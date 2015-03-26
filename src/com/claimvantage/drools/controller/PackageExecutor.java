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
import com.claimvantage.drools.listeners.WorkingMemoryEventListener;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Sobject;
import com.claimvantage.model.Package;


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

		KieSession session = createDroolsSession(realRules);
		loadData(session, selectedPackage.getRequiredObjects());
		executeRules(session, selectedPackage, realRules);
	}
	
	
	public KieSession createDroolsSession(ArrayList<Rule> rules) {
		// KieServices factory is used to create the virtual building blocks need to create a drools session
		KieServices droolsServices = KieServices.Factory.get();
		
		// The Drools repository class is used to store all available KieModules
		KieRepository droolsRulesRepository = droolsServices.getRepository();
		// Virtual file system used to write the rules to
		KieFileSystem droolsFileSystem = droolsServices.newKieFileSystem();
		
		for (Rule r : rules) {
			// writing the rules to the virtual rule system
			droolsFileSystem.write(REPOSITORY_LOCATION + r.getName() + ".drl", r.getScript().toString());
		}
		// create a rule builder 
		KieBuilder droolsRuleBuilder = droolsServices.newKieBuilder(droolsFileSystem);
		// Build all rules
		droolsRuleBuilder.buildAll(); // kieModule is automatically deployed to KieRepository
						
		// if successfully built.
		if (droolsRuleBuilder.getResults().hasMessages(Level.ERROR)) {
			throw new RuntimeException("Build Errors:\n"
					+ droolsRuleBuilder.getResults().toString());
		}
		// Create a container for the session
		KieContainer droolsContainer = droolsServices.newKieContainer(droolsRulesRepository.getDefaultReleaseId());
		return droolsContainer.newKieSession();
	}
	
	private void loadData(KieSession droolsSession, HashSet<Sobject> requiredObjects) {
		// pass reference to the droolsSession into the bulk data exporter
		DataLoader.execute(droolsSession, requiredObjects);
	}

	private Execution executeRules(KieSession droolsSession, Package selectedPacakge, ArrayList<Rule> rules) {
		
		selectedPacakge.incrementNumberOfExecutions();
		List<Alert> alerts = new ArrayList<Alert>();
		// Loading a listener to capture any matched rules
		WorkingMemoryEventListener workingMemoryListener = new WorkingMemoryEventListener();
		droolsSession.addEventListener(workingMemoryListener);
		// Injecting the Rules settings (Configurations, Scores and Recommendations)
		for (Rule rule : rules) {
			if (rule.getSetting() != null && rule.getGlobal() != null) {
				droolsSession.setGlobal(rule.getGlobal(), rule.getSetting());
			}
		}
		// Firing the rules against the loaded claims data
		int numberOfRuleFired = droolsSession.fireAllRules();
		// Retrieving and storing all necessary information in regards the execution of the drools rules.
		long factCount = droolsSession.getFactCount();
		selectedPacakge.incrementNumberOfRulesFired(numberOfRuleFired);
		// Retrieving the alerts fired
		alerts = workingMemoryListener.getAlerts();
		selectedPacakge.incrementNumberOfAlerts(alerts.size());
		alertsRepo.addAlerts(new Timestamp(new Date().getTime()).toLocalDateTime().toString(), alerts);
		selectedPackage.addNewAlerts(alerts);
		
		Execution execution = new Execution(alerts, rules, selectedPacakge.getId(), numberOfRuleFired, factCount, alerts.size());
		executionsRepo.addExecution(new Timestamp(new Date().getTime()).toLocalDateTime().toString(), execution);
		selectedPacakge.executions.add(execution);
		selectedPacakge.setLastExecutionDate(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
		
		// Cleaning up Session memory
		droolsSession.removeEventListener(workingMemoryListener);
		droolsSession.dispose();

		return execution;
	}
}
