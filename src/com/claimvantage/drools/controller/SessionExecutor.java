package com.claimvantage.drools.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

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
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Session;
import com.claimvantage.model.Sobject;
import com.claimvantage.data.SessionRepository;
import com.claimvantage.drools.listeners.*;
import com.claimvantage.drools.util.HardCodedRules;
import com.sforce.soap.enterprise.Cve__Claim__C;

public class SessionExecutor {

	private static SessionRepository sessionExecutionRepo = SessionRepository.instance();
	private static SessionExecutor instance = null;
	private Session currentSession;
	
	/*
	 * Private Constructor that creates the Singleton Instance
	 */
	private SessionExecutor() {
		
	}
	
	// Returns a single instance of this class
	public static SessionExecutor instance() {
		if (instance == null) {
			instance = new SessionExecutor();
		}
		return instance;
	}
	
	public void addExecutionSession(Session eSession) {
		sessionExecutionRepo.addSession(eSession);
	}
	
	// Create a new kieSession
	public Session getCurrentSession() {
		return currentSession;
	}
	
	// 
	public Execution fireRules() {

		System.out.println(">>> Firing Rules");
		System.out.println(">>> currentSession " + currentSession);
		return currentSession.executeRules();
	}
	
	public void addRule(Session session, Rule rule) {
		// TODO find session in repo
		
		// TODO add the rule to that session
		
	}
	
	public void removeRule(String name) {
		// TODO find session in repo

		// TODO remove the session
	}
}
