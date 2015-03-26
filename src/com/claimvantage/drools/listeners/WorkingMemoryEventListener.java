package com.claimvantage.drools.listeners;

import java.util.ArrayList;
import java.util.List;
import org.kie.api.event.rule.DefaultRuleRuntimeEventListener;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.claimvantage.model.Alert;

public class WorkingMemoryEventListener extends DefaultRuleRuntimeEventListener {

	private static Logger log = LoggerFactory.getLogger(WorkingMemoryEventListener.class);
	
    private List<Alert> alerts = new ArrayList<Alert>();
	
	private FactHandle handleFilter;
	private Class<?> classFilter;
	
	/**
	* Void constructor sets the listener to record all working memory events
	* with no filtering.
	*/
	public WorkingMemoryEventListener() {
		this.handleFilter = null;
	}
	
	public WorkingMemoryEventListener(FactHandle handle) {
		this.handleFilter = handle;
	}
	
	public WorkingMemoryEventListener(Class<?> classFilter) {
		this.handleFilter = null;
		this.classFilter = classFilter;
	}
	
	@Override
	public void objectInserted(final ObjectInsertedEvent event) {
		Alert a;

		if ((handleFilter == null  && classFilter == null)
				|| event.getFactHandle() == handleFilter
				|| event.getObject().getClass().equals(classFilter)) {
			
			if (event.getObject().getClass().equals(Alert.class)) {
				a = (Alert) event.getObject();
				alerts.add(a);
				log.trace("Insertion: " + a.getRuleName());
			}
		}
	}
	
	public List<Alert> getAlerts() {
		return alerts;
	}
	
	public String getPrintableSummary() {
		return "TrackingWorkingMemoryEventListener: " +
		    "alert insertions=[" + alerts.size() + "], ";
	}
}