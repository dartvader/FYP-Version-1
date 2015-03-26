package com.claimvantage.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.claimvantage.data.RulesRepository;
import com.claimvantage.model.Rule;

@Path("rules")
public class RuleRESTResourceService {

	private static RulesRepository rulesRepository = RulesRepository.instance();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addRule(Rule rule) {
		
		Response.ResponseBuilder builder = null;		
		try {
			rule.buildScript(); // Building the script
			rulesRepository.addRule(rule);
            builder = Response.ok();
        } catch (Exception e) {
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
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Rule> updateRules(ArrayList<Rule> rules) {
		
		ArrayList<Rule> updatedRules = null;
		try {
			updatedRules = new ArrayList<Rule>(rulesRepository.updateRules(rules));
        } catch (Exception e) {
            System.out.println("Error updating the rules");
            System.out.println("Error " +  e.getMessage());
            System.out.println("Error " +  e.getLocalizedMessage());
            System.out.println("Error " +  e.getStackTrace());
        }
		
		return updatedRules;
	}
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rule> getRules() {
    	if (rulesRepository.getRules() == null) {
    		return null;
    	}
        return rulesRepository.getRules();
    }
}
