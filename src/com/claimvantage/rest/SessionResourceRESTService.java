package com.claimvantage.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Consume;

import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.SessionRepository;
import com.claimvantage.drools.controller.SessionExecutor;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Session;

@Path("sessions")
public class SessionResourceRESTService {
	
	private static SessionRepository sessionRepo = SessionRepository.instance();
	private static RulesRepository rulesRepo = RulesRepository.instance();
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response saveSession(Session session) {
		System.out.println(">>> create new session <<< ");
    	Response.ResponseBuilder builder = null;	
    	
		try {
			System.out.println(">>> create new session <<< ");
			sessionRepo.addSession(session);
			
            builder = Response.ok();
        } catch (Exception e) {
            // Handle generic exceptions
            System.out.println("Error in Rules set resource REST service");
            System.out.println("Error " +  e.getMessage());
            System.out.println("Error " +  e.getLocalizedMessage());
            System.out.println("Error " +  e.getStackTrace());
            
            Map<String, String> responseObj = new HashMap<String, String>();
            responseObj.put("error ", e.getMessage());
            builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
        }
		return builder.build();
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Session> getCurrentSession() {
		return sessionRepo.getSessions();
	}
	
	@GET
	@Path("/execute/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Execution executeSessionRules(@PathParam("id") String id) {
		/* 
		 * TODO Execute this in  thread
		 * Try calculate time and poll back to the user
		 */
		System.out.println(" session id that is being executed " + id);
		Session session = sessionRepo.getSessionsById(id);

		System.out.println(" session id that is being executed " + session.getCreationDateTime());
		return session.executeRules();
	}
}
