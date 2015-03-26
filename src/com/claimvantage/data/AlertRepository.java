package com.claimvantage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import javax.persistence.Entity;

import com.claimvantage.model.Alert;
import com.claimvantage.model.Package;

public class AlertRepository {
	
	private static AlertRepository instance = null;
	
	private NavigableMap<String, List<Alert>> alerts;
	
	public AlertRepository() {
		alerts = new TreeMap<String, List<Alert>>();
	}

	public static AlertRepository instance() {
		if (instance == null) {
			instance = new AlertRepository();
		}
		return instance;
	}
	
	public Entry<String, List<Alert>> getLastEntry() {
		return alerts.lastEntry();
	}
	
	public void addAlerts(String timeStamp, List<Alert> newAlerts) {
		alerts.put(timeStamp, newAlerts);
	}

	public NavigableMap<String, List<Alert>> getAlerts() {
		return alerts;
	}

	public void setAlerts(NavigableMap<String, List<Alert>> alerts) {
		this.alerts = alerts;
	}
}
