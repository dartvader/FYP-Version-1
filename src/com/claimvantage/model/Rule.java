package com.claimvantage.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.claimvantage.drools.util.BuilderUtil;
import com.claimvantage.rules.Setting;
import com.claimvantage.model.RuleCorrelation;

@XmlRootElement
public class Rule {
	
	private String name;
	private String description;
	private UUID id;
	private StringBuilder script;
	private List<Condition> conditions;
	private Consequence consequence;
	private Boolean status;
	private String global;
	private Setting setting;
	private ArrayList<RuleCorrelation> relatedRules;
	
	private Rule() {
		// this.status = true;
	}
	
	private Rule(ArrayList<RuleCorrelation> relatedRules) {
		this.relatedRules = relatedRules;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setScript(StringBuilder script) {
		this.script = script;
	}
	public List<Condition> getConditions() {
		return conditions;
	}
	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}
	public Consequence getConsequence() {
		return consequence;
	}
	public void setConsequence(Consequence consequence) {
		this.consequence = consequence;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public StringBuilder getScript() {
		return script;
	}
	public void buildScript() {
		// TODO Remove StringBuilder s = BuilderUtil.buildRuleScript(this);
		this.script = BuilderUtil.buildRuleScript(this);
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getGlobal() {
		return global;
	}

	public void setGlobal(String global) {
		this.global = global;
	}

	public Setting getSetting() {
		return setting;
	}

	public void setSetting(Setting setting) {
		this.setting = setting;
	}

	public ArrayList<RuleCorrelation> getRelatedRules() {
		return relatedRules;
	}

	public void setRelatedRules(ArrayList<RuleCorrelation> relatedRules) {
		this.relatedRules = relatedRules;
	}
}
