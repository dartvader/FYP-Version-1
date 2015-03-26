package com.claimvantage.rest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;

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

import com.claimvantage.data.AlertRepository;
import com.claimvantage.data.ExecutionRepository;
import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.PackageRepository;
import com.claimvantage.drools.controller.PackageExecutor;
import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Package;
import com.claimvantage.model.Sobject;

import org.codehaus.jackson.type.TypeReference;

@Path("executions")
public class ExecutionRESTResourceService {
	
	private static ExecutionRepository executionRepo = ExecutionRepository.instance();
	
	@javax.ws.rs.core.Context 
	ServletContext context;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Execution> getExecutions() {
		return executionRepo.getExecutions();
	}
}

