package com.claimvantage.drools.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.event.rule.DefaultRuleRuntimeEventListener;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.claimvantage.model.Alert;

public class TrackingWorkingMemoryEventListener extends DefaultRuleRuntimeEventListener {

	private static Logger log = LoggerFactory.getLogger(TrackingWorkingMemoryEventListener.class);
	
	//private List<ObjectInsertedEvent> insertions = new ArrayList<ObjectInsertedEvent>();
    private List<Alert> alerts = new ArrayList<Alert>();
	
	private FactHandle handleFilter;
	private Class<?> classFilter;
	
	/**
	* Void constructor sets the listener to record all working memory events
	* with no filtering.
	*/
	public TrackingWorkingMemoryEventListener() {
		this.handleFilter = null;
	}
	
	/**
	* Constructor which sets up an event filter. The listener will only record
	* events when the event {@link FactHandle} matches the constructor argument.
	* 
	* @param handle
	*            The {@link FactHandle} to filter on.
	*/
	public TrackingWorkingMemoryEventListener(FactHandle handle) {
		this.handleFilter = handle;
	}
	
	public TrackingWorkingMemoryEventListener(Class<?> classFilter) {
		this.handleFilter = null;
		this.classFilter = classFilter;
	}
	
	@Override
	public void objectInserted(final ObjectInsertedEvent event) {
		Alert a;

		/* 
		System.out.println("<<< getFactHandle " + event.getFactHandle().toString() + " >>> ");
		System.out.println("<<< Class Name " + event.getFactHandle()+ " >>> ");
		System.out.println("<<<  getObject " + event.getObject().toString() + " >>> ");
		System.out.println("<<<  getObject class name " + event.getObject().getClass().getName() + " >>> ");
		*/
		if ((handleFilter == null  && classFilter == null)
				|| event.getFactHandle() == handleFilter
				|| event.getObject().getClass().equals(classFilter)) {
			
			if (event.getObject().getClass().equals(Alert.class)) {
				a = (Alert) event.getObject();
				System.out.println(">>>> adding alert <<<<");
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