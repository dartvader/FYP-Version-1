package com.claimvantage.rest;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.claimvantage.data.ExecutionRepository;
import com.claimvantage.model.Execution;

@Path("executions")
public class ExecutionRESTResourceService {
	
	private static ExecutionRepository executionRepo = ExecutionRepository.instance();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Execution> getExecutions() {
		return executionRepo.getExecutions();
	}
}

