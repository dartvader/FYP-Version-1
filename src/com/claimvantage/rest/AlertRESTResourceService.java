package com.claimvantage.rest;

import java.util.List;
import java.util.NavigableMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.claimvantage.data.AlertRepository;
import com.claimvantage.model.Alert;

@Path("alerts")
public class AlertRESTResourceService {
	
	private static AlertRepository alertRepo = AlertRepository.instance();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public NavigableMap<String, List<Alert>> getAlerts() {
		// Code needs to be extended and send back true rest response
		return alertRepo.getAlerts();
	}
}

