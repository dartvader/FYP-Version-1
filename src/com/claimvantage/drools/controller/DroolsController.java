package com.claimvantage.drools.controller;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message.Level;
import org.kie.api.builder.ReleaseId;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.builder.model.KieSessionModel;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.internal.io.ResourceFactory;

import com.claimvantage.model.Alert;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Session;
import com.claimvantage.model.Sobject;
import com.claimvantage.data.SessionRepository;
import com.claimvantage.drools.listeners.*;
import com.claimvantage.drools.util.HardCodedRules;
import com.sforce.soap.enterprise.Cve__Claim__C;

public class DroolsController {
	
	private static DroolsController instance = null;
	private static SessionRepository sessionRepo = SessionRepository.instance();
	
	private KieServices kieServices;
	private KieRepository kieRepository;
	private KieFileSystem kieFileSystem;
	private KieBuilder kieBuilder;
	private KieContainer kieContainer;
	private List<KieSession> kieSessions;
	private Session currentSession;
	private KieModuleModel kieModuleModel;
	private final String repositoryLocation = "src/resources/rules/";

	private TrackingAgendaEventListener agendaEventListener;
    private TrackingWorkingMemoryEventListener workingMemoryListener;
	
	private int currentSessionId;
	private List<Alert> resultsList;
	
	/*
	 * Private Constructor that creates the Singleton Instance
	 */
	private DroolsController() {
		
	}
	
	// Returns a single instance of this class
	public static DroolsController instance() {
		if (instance == null) {
			instance = new DroolsController();
		}
		return instance;
	}
	
	public void loadNewRule(String name, String drlString) {
		
		String fileLocation = repositoryLocation + name + ".drl";
		
		kieFileSystem.write(fileLocation , drlString);
		buildKieRepository(); // Always build the repository after loading a new resource
	}
	
	// Create a new kieSession
	public void newSession(List<Rule> rules) {
		/* 
		kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.generateAndWritePomXML(kieRepository.getDefaultReleaseId());
		kieBuilder = kieServices.newKieBuilder(kieFileSystem);
		kieContainer = kieServices.getKieClasspathContainer();
		*/
		// create new Session and store the id
		currentSession = new Session(rules);
		sessionRepo.addSession(currentSession);
		System.out.println(">>>>>>>>>>>>>>>>>>>>> loading claims ");
		//currentSession.loadFakeClaims();
	}
	
	public void fireRules() {
		currentSession.fireRules();
	}
	
	public List<Alert> getCurrentAlerts() {
		return currentSession.getAlerts();
	}
	
	// kieModule is automatically deployed to KieRepository if successfully built.
	public void buildKieRepository() {
		kieBuilder.buildAll(); 
        if (kieBuilder.getResults().hasMessages(Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kieBuilder.getResults().toString());
        }
	}
	
	// TODO make data loader
	private void loadFakeRules() {
		// TODO Auto-generated method stub
		String s = HardCodedRules.getRuleClaimAlerts();
		loadNewRule("Fake Rule set ", s);
	}
	
	public List<Alert> getResultsList() {
		return resultsList;
	}

	public void setResultsList(List<Alert> resultsList) {
		this.resultsList = resultsList;
	}
}
