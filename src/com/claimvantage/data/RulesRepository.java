package com.claimvantage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.claimvantage.drools.util.BuilderUtil;
import com.claimvantage.model.DrlFile;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Ruleset;

public class RulesRepository {
	
	private static RulesRepository instance = null;
	
	private List<Rule> rules;
	private Map<Rule, DrlFile> rulesetToString;

	private RulesRepository () {
		rules = new ArrayList<Rule>();
		rulesetToString = new HashMap<Rule, DrlFile>();
	}
	
	public static RulesRepository instance() {
		if (instance == null) {
			instance = new RulesRepository();
		}
		return instance;
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
		System.out.println(rule.getScript());
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

	public Map<Rule, DrlFile> getRulesetToString() {
		return rulesetToString;
	}

	public void setRulesetToString(Map<Rule, DrlFile> rulesetToString) {
		this.rulesetToString = rulesetToString;
	}
}
