package com.claimvantage.rest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import com.claimvantage.data.PackageRepository;
import com.claimvantage.drools.controller.PackageExecutor;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Package;
import com.claimvantage.model.Sobject;

import org.codehaus.jackson.type.TypeReference;

@Path("packages")
public class PacakgeRESTResourceService {
	
	private static PackageRepository packageRepo = PackageRepository.instance();
	private static RulesRepository rulesRepo = RulesRepository.instance();
	
	@javax.ws.rs.core.Context 
	ServletContext context;
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response savePackage(ArrayList<String> newPackageRules) {
		
    	Response.ResponseBuilder builder = null;	
		try {
			/*
			 * This is going to be a problem Because Rules that are custom built need to build there own required objects.
			 * I did not take into consideration that you could have custom and core rules in the same package.
			 * I am just going to manually add all the required objects into the system for every package.
			 */
			String webInfPath = context.getRealPath("WEB-INF");
			ObjectMapper mapper = new ObjectMapper();
			HashSet<Sobject> requiredObjects = (HashSet<Sobject>) mapper.readValue(new File(webInfPath +"/RequiredObjects.json"), new TypeReference<HashSet<Sobject>>(){});
			
			Package newPackage = new Package(newPackageRules, "Custom Package", requiredObjects);
			packageRepo.addPackage(newPackage);
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
	public List<Package> getPackages() {
		
		System.out.println("Getting packages ");
		return packageRepo.getPackages();
	}
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("/core")
    @Produces(MediaType.APPLICATION_JSON)
	public Package loadCorePackage() {
		
		if (!packageRepo.isCorePackageCreated()) {
			String webInfPath = context.getRealPath("WEB-INF");
			try {
				ObjectMapper mapper = new ObjectMapper();
				
				ArrayList<Rule> rules = (ArrayList<Rule>) mapper.readValue(new File(webInfPath +"/Rules.json"), new TypeReference<ArrayList<Rule>>(){});
				System.out.println("Incoming rules from the file " + rules.size());
				
				ArrayList<String> rulesForPackage = new ArrayList<String>();
				for(Rule rule : rules) {
					rulesRepo.addRule(rule);
					rulesForPackage.add(rule.getName());
				}
				
				HashSet<Sobject> requiredObjects = (HashSet<Sobject>) mapper.readValue(new File(webInfPath +"/RequiredObjects.json"), new TypeReference<HashSet<Sobject>>(){});	
				Package corePackage = new Package(rulesForPackage, "Core Package", requiredObjects);
				
				packageRepo.setCorePackage(corePackage);
				packageRepo.addPackage(corePackage);
				packageRepo.hasCorePackageCreated(true);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return packageRepo.getCorePackage();
	}
	
	@GET
	@Path("/execute/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Package executePacakge(@PathParam("id") String packageId) {
		
		PackageExecutor packageExecution = new PackageExecutor(packageId);
		packageExecution.execute();
		
		Package packageUpdate = packageRepo.getPackagesById(packageId);
		return packageUpdate;
	}
	
	@GET
	@Path("/rules/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Rule> getPacakgeRules(@PathParam("id") String id) {
		System.out.println(" GEtting package rules " + id);
		
		Package selectedPacakge = packageRepo.getPackagesById(id);
		System.out.println(" score " + rulesRepo.getRulesByNames(selectedPacakge.getRuleNames()).get(0).getSetting().getScore());
		
		return rulesRepo.getRulesByNames(selectedPacakge.getRuleNames());
	}
}
