package com.claimvantage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.claimvantage.model.Alert;
import com.claimvantage.model.Execution;

public class ExecutionRepository {
	
	private static ExecutionRepository instance = null;
	
	private HashMap<String, Execution> executions;
	
	public ExecutionRepository() {
		executions = new HashMap<String, Execution>();
	}

	public static ExecutionRepository instance() {
		if (instance == null) {
			instance = new ExecutionRepository();
		}
		return instance;
	}
	
	public void addExecution( String timeStamp, Execution execution) {
		executions.put(timeStamp, execution);
		System.out.println("<<adding>> executions map size " + executions.size());
	}
	
	public HashMap<String, Execution> getExecutions() {
		return executions;
	}

	public void setExecution(HashMap<String, Execution> executions) {
		this.executions = executions;
	}
	
	public HashMap<String, Execution> getExecution() {
		return this.executions;
	}
}
