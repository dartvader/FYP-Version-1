package com.claimvantage.rest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Consume;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.SessionRepository;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Session;
import com.claimvantage.model.Sobject;

import org.codehaus.jackson.type.TypeReference;

@Path("sessions")
public class SessionResourceRESTService {
	
	private static SessionRepository sessionRepo = SessionRepository.instance();
	private static RulesRepository rulesRepo = RulesRepository.instance();
	private Session corePackageSession = null;
	
	@javax.ws.rs.core.Context 
	ServletContext context;
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response saveSession(Session session) {
		System.out.println(">>> create new session <<< ");
    	Response.ResponseBuilder builder = null;	
    	
		try {
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
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("/core")
    @Produces(MediaType.APPLICATION_JSON)
	public Session loadCorePackage() {
		
		if (!sessionRepo.isCorePackageCreated()) {
			String webInfPath = context.getRealPath("WEB-INF");
			try {
				ObjectMapper mapper = new ObjectMapper();
				
				List<Rule> rules = (List<Rule>) mapper.readValue(new File(webInfPath +"/Rules.json"), new TypeReference<List<Rule>>(){});
				for(Rule rule : rules) {
					rulesRepo.addRule(rule);
				}
				
				HashSet<Sobject> requiredObjects = (HashSet<Sobject>) mapper.readValue(new File(webInfPath +"/RequiredObjects.json"), new TypeReference<HashSet<Sobject>>(){});
				
				Session corePackageSession = new Session(rules, "Custom Package", requiredObjects);
				sessionRepo.setCorePackage(corePackageSession);
				sessionRepo.addSession(corePackageSession);
				sessionRepo.hasCorePackageCreated(true);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sessionRepo.getCorePackage();
	}
	
	@GET
	@Path("/execute/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Session executeSessionRules(@PathParam("id") String id) {
		/* 
		 * TODO Execute this in  thread
		 * Try calculate time and poll back to the user
		 */
		System.out.println(" session id that is being executed " + id);
		Session session = sessionRepo.getSessionsById(id);

		System.out.println(" session id that is being executed " + session.getCreationDateTime());
		session.executeRules();
		Session sessionUpdate = sessionRepo.getSessionsById(id);
		
		return sessionUpdate;
	}
}
