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
	
	public ArrayList<Rule> updateRules(ArrayList<Rule> updatedRules) {
		this.rules.clear();
		this.rules.addAll(updatedRules);
		return this.rules;
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
		return this.rules;
	}

	public void setRules(ArrayList<Rule> rules) {
		this.rules = rules;
	}
	
	public ArrayList<Rule> getRulesByNames(ArrayList<String> packageRuleNames) {
		
		ArrayList<Rule> returnRules = new ArrayList<Rule>();	
		for (String ruleName : packageRuleNames) {
			
			for (Rule rule : this.rules) {
				if (rule.getName() == ruleName || rule.getName().contains(ruleName)) {
					returnRules.add(rule);
				}
			}
		}
		return returnRules;
	}
	
	public ArrayList<Rule> getRulesByCategory(ArrayList<String> packageRuleCategories) {
		
		ArrayList<Rule> returnRules = new ArrayList<Rule>();	
		for (String ruleCategory : packageRuleCategories) {
			for (Rule rule : this.rules) {
				// This might change to the settings
				if (rule.getName() == ruleCategory || rule.getName().contains(ruleCategory)) {
					returnRules.add(rule);
				}
			}
		}
		return returnRules = returnRules;
	}
}
