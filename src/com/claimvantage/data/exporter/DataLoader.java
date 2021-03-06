package com.claimvantage.data.exporter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.kie.api.runtime.KieSession;

import com.claimvantage.drools.util.Strings;
import com.claimvantage.model.Sobject;
import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class DataLoader {
	
	public static void execute(KieSession droolsSession, HashSet<Sobject> objects) {
		
		ArrayList<String> queries = buildQueries(objects);
		ArrayList<QueryResult> exportResults = exportData(queries);
		loadData(droolsSession, exportResults);
	}
	
	private static ArrayList<String> buildQueries(HashSet<Sobject> objects) {

		ArrayList<String> exportQueries = new ArrayList<String>();
		
		for (Sobject object : objects) {
			String soql = "select " + Strings.csvs(object.getSobFields()) + " from " + object.getSobApi();
	        System.out.println(">>> soql=" + soql);
	        exportQueries.add(soql);
		}
		return exportQueries;
	}

	public static ArrayList<QueryResult> exportData(ArrayList<String> queries) {

		EnterpriseConnection connection = createConnection();
		ArrayList<QueryResult> results = new ArrayList<QueryResult>();
		try {
			for (String query : queries) {
				results.add(connection.query(query));
			}
		} catch (ConnectionException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static void loadData(KieSession droolsSession, ArrayList<QueryResult> results) {
		
		for (QueryResult result : results) {
			if (result.getSize() > 0) {
				for (int i = 0; i < result.getRecords().length; i++) {
					droolsSession.insert(result.getRecords()[i]);
				}
			}
		}
	}
	
	public static EnterpriseConnection createConnection() {

		EnterpriseConnection connection = null;
		
		// TODO put these in configuration file
   		String USERNAME = "leemcdonald@83demo.com";
   		String PASSWORD = "0un7tijf1rLmEWCqLRQQtueEgjVd6DNRL7";
    	ConnectorConfig config = new ConnectorConfig();
    	
		config.setUsername(USERNAME);
		config.setPassword(PASSWORD);
		try {
			connection = Connector.newConnection(config);
		} catch (ConnectionException e1) {
			e1.printStackTrace();
		}
    	return connection;
    }	
}