package com.claimvantage.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.claimvantage.data.RulesRepository;
import com.claimvantage.drools.controller.DroolsController;
import com.claimvantage.model.Condition;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Ruleset;

import javax.naming.CommunicationException;

import org.codehaus.jettison.json.JSONObject;

@Path("rules")
public class RuleResourceRESTService {

	private static RulesRepository rulesRepository = RulesRepository.instance();
	private static DroolsController droolsController = DroolsController.instance();

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addRule(Rule rule) {
		
		Response.ResponseBuilder builder = null;		
		try {
			System.out.println("adding rule set in RulesetResourceRESTService ");
			rule.buildScript();
			rulesRepository.addRule(rule);

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
    public List<Rule> listAllRules() {
    	if (rulesRepository.getRules() == null) {
    		return null;
    	}
        return rulesRepository.getRules();
    }
}
