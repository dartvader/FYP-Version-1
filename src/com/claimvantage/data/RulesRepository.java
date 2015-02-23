package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.claimvantage.model.Rule;

public class RulesRepository {
	
	private static RulesRepository instance = null;
	
	private List<Rule> rules;

	private RulesRepository () {
		rules = new ArrayList<Rule>();
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

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
	// TODO get rule by name
	
	

}
