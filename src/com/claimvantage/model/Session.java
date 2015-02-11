package com.claimvantage.model;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.builder.Message.Level;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import com.claimvantage.drools.listeners.TrackingAgendaEventListener;
import com.claimvantage.drools.listeners.TrackingWorkingMemoryEventListener;
import com.claimvantage.drools.util.HardCodedRules;
import com.sforce.soap.enterprise.Cve__Claim__C;

public class Session {
	
	private KieSession kieSession;
	private List<Rule> rules;
	private List<Alert> alerts;
	private TrackingAgendaEventListener agendaEventListener;
    private TrackingWorkingMemoryEventListener workingMemoryListener;
	private final String repositoryLocation = "src/resources/rules/";
	
	public Session(List<Rule> rules) {
		System.out.println(">>> creating Session");
		agendaEventListener = new TrackingAgendaEventListener();
		workingMemoryListener = new TrackingWorkingMemoryEventListener();
		/*
		this.kieSession = createKieSession(rules);
		this.kieSession.addEventListener(agendaEventListener);
		this.kieSession.addEventListener(workingMemoryListener);
		*/
		KieServices ks = KieServices.Factory.get();
        KieRepository kr = ks.getRepository();
        KieFileSystem kfs = ks.newKieFileSystem();
        List<Alert> alerts = new ArrayList<Alert>();
        System.out.println("Number of rules in system " + rules);
        kfs.write("src/main/resources/rules/HAL5.drl", HardCodedRules.getRuleClaimAlerts());
        KieBuilder kb = ks.newKieBuilder(kfs);
        kb.buildAll(); // kieModule is automatically deployed to KieRepository if successfully built.
        
        if (kb.getResults().hasMessages(Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }
        
        System.out.println("kr getDefaultReleaseId" + kr.getDefaultReleaseId());
        KieModule km = kr.getKieModule(kr.getDefaultReleaseId());
        KieContainer kContainer = ks.newKieContainer(kr.getDefaultReleaseId());
        KieSession kieSession = kContainer.newKieSession();
        TrackingAgendaEventListener agendaEventListener = new TrackingAgendaEventListener();
        TrackingWorkingMemoryEventListener workingMemoryListener = new TrackingWorkingMemoryEventListener();
        kieSession.addEventListener(agendaEventListener);
        
        System.out.println("get session id " + kieSession.getId());
        
        ArrayList<Cve__Claim__C> claims = new ArrayList<Cve__Claim__C>();
        Cve__Claim__C c = new Cve__Claim__C();
        for (int i = 0;i < 1000;i++) {
        	c = new Cve__Claim__C();
        	if (i == 1) {
        		c.setCve__BenefitType__C("STD");
        	} else {
        		c.setCve__BenefitType__C("STD " + i);
        	}
        	c.setCreatedById("me");
        	claims.add(c);
        	kieSession.insert(c);
        }
        kieSession.addEventListener(workingMemoryListener);
        System.out.println("kSession rules fired " + kieSession.fireAllRules());
        kieSession.fireAllRules();
        //System.out.println("agendaEventListener Rule List " + agendaEventListener.getRuleList().get(0));
        alerts =  workingMemoryListener.getAlerts();
        System.out.println("working " + alerts.size());
		
	}
	
	public void addRule(Rule rule) {
		this.rules.add(rule);
	}
	
	public void addFact(Sobject sob) {
		
	}
	
	public void deleteRule(String ruleName) {
		// implement this
	}
	
	public void fireRules() {
		System.out.println("packages " + kieSession.getKieBase().getKiePackages());
		System.out.println("Firing rules " + kieSession.fireAllRules());
		
		// get the results in the already 
		if (alerts == null) {
			alerts = new ArrayList<Alert>();
		} else {
			alerts.clear();
		}
		alerts = workingMemoryListener.getAlerts();
		System.out.println(" Fire all rules alerts " + alerts.size());
		System.out.println(" fact count " + kieSession.getFactCount());
	}
	
	public static KieSession createKieSession(List<Rule> rules) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kcontainer = createKieContainer(ks, rules);
        
        // Configure and create the KieBase
        KieBaseConfiguration kbconf = ks.newKieBaseConfiguration();
        KieBase kbase = kcontainer.newKieBase(kbconf);
        
        System.out.println("packages size "+kbase.getKiePackages().size());

        // Configure and create the KieSession
        KieSessionConfiguration ksconf = ks.newKieSessionConfiguration();
        return kbase.newKieSession(ksconf, null);
    }
	
	private static KieContainer createKieContainer(KieServices ks, List<Rule> rules) {
        // Create the in-memory File System and add the resources files to it
		System.out.println("Creating container \n ");
        KieFileSystem kfs = ks.newKieFileSystem();
        String path;
        for (Rule r : rules) {
        	path = "src/resources/rules/" + r.getName() + ".drl";
        	String rule = r.getScript().toString();
        	kfs.write(path, rule);
        }
        // Create the builder for the resources of the File System
        KieBuilder kbuilder = ks.newKieBuilder(kfs);
        
        // Build the Kie Bases
        kbuilder.buildAll();
        // Check for errors
        if (kbuilder.getResults().hasMessages(Level.ERROR)) {
            throw new IllegalArgumentException(kbuilder.getResults().toString());
        }

        // Get the Release ID (mvn style: groupId, artifactId,version)
        ReleaseId relId = kbuilder.getKieModule().getReleaseId();
        System.out.println("release getArtifactId " + relId.getArtifactId());
        System.out.println("release getGroupId " + relId.getGroupId());
        System.out.println("release getVersion " + relId.getVersion());
        // Create the Container, wrapping the KieModule with the given ReleaseId
        return ks.newKieContainer(relId);
    }

	public KieSession getKieSession() {
		return kieSession;
	}

	public void setSession(KieSession kieSession) {
		this.kieSession = kieSession;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<Alert> getAlerts() {
		alerts = workingMemoryListener.getAlerts();
		return alerts;
	}
	
	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
	
	public void loadFakeClaims() {
		System.out.println("loading fake claims");
		ArrayList<Cve__Claim__C> claims = new ArrayList<Cve__Claim__C>();
        Cve__Claim__C c = new Cve__Claim__C();
        for (int i = 0;i < 1000;i++) {
        	c = new Cve__Claim__C();
        	c.setCve__BenefitType__C("STD");
        	c.setCve__IncurredNet__C(20.20);
        	c.setCve__LiabilityNet__C(20.00);
        	claims.add(c);
        	kieSession.insert(c);
        }
		System.out.println("Fact count " + kieSession.getFactCount());
	}
}
