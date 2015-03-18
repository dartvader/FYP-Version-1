package com.claimvantage.drools.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message.Level;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.claimvantage.data.AlertRepository;
import com.claimvantage.data.ExecutionRepository;
import com.claimvantage.data.PackageRepository;
import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.exporter.DataLoader;
import com.claimvantage.drools.listeners.TrackingWorkingMemoryEventListener;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Sobject;

public class PackageExecutor {
	
	private String packageId;
	private com.claimvantage.model.Package selectedPackage;
	private static PackageRepository packageRepo = PackageRepository.instance();
	private static RulesRepository rulesRepo = RulesRepository.instance();
	private static AlertRepository alertsRepo = AlertRepository.instance();
	private static ExecutionRepository executionsRepo = ExecutionRepository.instance();
	
	private final String REPOSITORY_LOCATION = "src/main/resources/rules/";

	// Constructor 
	public PackageExecutor(String packageId) {
		super();
		this.packageId = packageId;
	}
	
	public void execute() {
		selectedPackage = packageRepo.getPackagesById(this.packageId);
		ArrayList<Rule> realRules = rulesRepo.getRulesByNames(selectedPackage.getRuleNames());

		KieSession session = createKieSession(realRules);
		loadData(session, selectedPackage.getRequiredObjects());
		executeRules(session, selectedPackage, realRules);
	}
	
	
	public KieSession createKieSession(ArrayList<Rule> rules) {

		KieServices kieServices = KieServices.Factory.get();
		KieRepository kieRepository = kieServices.getRepository();
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		
		for (Rule r : rules) {
			kieFileSystem.write(REPOSITORY_LOCATION + r.getName() + ".drl", r.getScript().toString());
		}
		
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll(); // kieModule is automatically deployed to KieRepository
						// if successfully built.

		if (kb.getResults().hasMessages(Level.ERROR)) {
			throw new RuntimeException("Build Errors:\n"
					+ kb.getResults().toString());
		}

		KieContainer kContainer = kieServices.newKieContainer(kieRepository.getDefaultReleaseId());
		return kContainer.newKieSession();
	}
	
	private void loadData(KieSession kieSession, HashSet<Sobject> requiredObjects) {
		// pass reference to the kieSession into the bulk data exporter
		DataLoader.execute(kieSession, requiredObjects);
	}

	public Execution executeRules(KieSession kieSession, com.claimvantage.model.Package selectedPacakge, ArrayList<Rule> rules) {

		selectedPacakge.incrementNumberOfExecutions();
		List<Alert> alerts = new ArrayList<Alert>();

		TrackingWorkingMemoryEventListener workingMemoryListener = new TrackingWorkingMemoryEventListener();
		kieSession.addEventListener(workingMemoryListener);
		
		for (Rule rule : rules) {
			if (rule.getSetting() != null && rule.getGlobal() != null) {
				kieSession.setGlobal(rule.getGlobal(), rule.getSetting());
			}
		}
		
		int numberOfRuleFired = kieSession.fireAllRules();
		
		long factCount = kieSession.getFactCount();
		selectedPacakge.incrementNumberOfRulesFired(numberOfRuleFired);

		alerts = workingMemoryListener.getAlerts();
		selectedPacakge.incrementNumberOfAlerts(alerts.size());
		Execution execution = new Execution(alerts, rules, selectedPacakge.getId(), numberOfRuleFired, factCount, alerts.size());
		
		alertsRepo.addAlerts(new Timestamp(new Date().getTime()).toLocalDateTime().toString(), alerts);
		executionsRepo.addExecution(new Timestamp(new Date().getTime()).toLocalDateTime().toString(), execution);
		
		selectedPackage.addNewAlerts(alerts);
		selectedPacakge.executions.add(execution);
		selectedPacakge.setLastExecutionDate(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
		
		// Cleaning up Session memory
		kieSession.removeEventListener(workingMemoryListener);
		kieSession.dispose();

		return execution;
	}
}
