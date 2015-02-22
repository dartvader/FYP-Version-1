package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import com.claimvantage.model.Alert;
import com.claimvantage.model.Session;

public class AlertRepository {
	
	private static AlertRepository instance = null;
	
	private List<Alert> alerts;
	
	public AlertRepository() {
		alerts = new ArrayList<Alert>();
	}

	public static AlertRepository instance() {
		if (instance == null) {
			instance = new AlertRepository();
		}
		return instance;
	}
	
	public void addSession(Alert alert) {
		alerts.add(alert);
	}
	
	public List<Alert> getSessions() {
		return alerts;
	}

	public void setSessions(List<Alert> alerts) {
		this.alerts = alerts;
	}
	
	public void getSession(List<Alert> alerts) {
		this.alerts = alerts;
	}
}
