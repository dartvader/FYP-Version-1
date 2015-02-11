package com.claimvantage.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.SessionRepository;
import com.claimvantage.drools.controller.DroolsController;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Session;

@Path("sessions")
public class DroolsResourceRESTService {
	
	private static DroolsController droolsController = DroolsController.instance();
	private static SessionRepository sessionRepo = SessionRepository.instance();
	private static RulesRepository rulesRepo = RulesRepository.instance();
	
	@GET
	@Path("/new")
	@Produces("text/plain")
	public String createNewSession() {
    	//System.out.println(">>>> rules currently in system " + rulesRepo.getRules().size());
    	droolsController.newSession(rulesRepo.getRules());
		return "New Session Created";
	}
	
	@GET
	@Path("/fire")
	@Produces("text/plain")
	public String fireAllRules() {
    	//droolsController.newSession(rulesRepo.getRules());
		droolsController.fireRules();
            
		return "Fired";
	}
	
	@GET
	@Path("/alerts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alert> getAlerts() {
    	System.out.println(">>>> fire rules ");
		return droolsController.getCurrentAlerts();
    }
}
