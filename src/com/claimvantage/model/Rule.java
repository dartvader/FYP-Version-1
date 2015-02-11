package com.claimvantage.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.claimvantage.drools.util.BuilderUtil;

@XmlRootElement
public class Rule {
	
	private String name;
	private String description;
	private Integer id;
	private StringBuilder script;
	private List<Condition> conditions;
	private Consequence consequence;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		StringBuilder s = BuilderUtil.buildRuleScript(this);
		System.out.println(s.toString());
		this.script = BuilderUtil.buildRuleScript(this);
	}
}
