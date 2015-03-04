package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.claimvantage.model.Rule;

public class RulesRepository {
	
	private static RulesRepository instance = null;
	private ArrayList<Rule> rules;

	private RulesRepository () {
		rules = new ArrayList<Rule>();
	}
	
	public void updateRules(ArrayList<Rule> updatedRules) {
		this.rules.clear();
		this.rules.addAll(updatedRules);
	}
	
	public static RulesRepository instance() {
		if (instance == null) {
			instance = new RulesRepository();
		}
		return instance;
	}
	
	public void addRule(Rule rule) {
		UUID randomId = UUID.randomUUID();
		rule.setId(randomId);
		rules.add(rule);
	}
	
	public static RulesRepository getInstance() {
		return instance;
	}

	public static void setInstance(RulesRepository instance) {
		RulesRepository.instance = instance;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(ArrayList<Rule> rules) {
		this.rules = rules;
	}
	// TODO 
	public Rule getRuleByName(String rule) {
		Rule returnRule = null;
		
		
		return returnRule = null;
	}
	
	public ArrayList<Rule> getRulesByNames(ArrayList<String> rules) {
		ArrayList<Rule> returnRules = new ArrayList<Rule>();	
		
		for (Rule rule : this.rules) {
			for (String ruleName : rules) {
				// This might change to the settings
				if (rule.getName() == ruleName || (rule.getName().contains(ruleName))) {
					returnRules.add(rule);
				}
			}
		}
		return returnRules = null;
	}
	
	public ArrayList<Rule> getRulesByCategory(ArrayList<String> rules) {
		ArrayList returnRules = new ArrayList<Rule>();	
		
		return returnRules = null;
	}
}
