package com.claimvantage.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.claimvantage.drools.util.BuilderUtil;

@XmlRootElement
public class Rule {
	
	private String name;
	private String description;
	@JsonIgnore
	private UUID id;
	private StringBuilder script;
	private List<Condition> conditions;
	private Consequence consequence;
	private Boolean status;
	
	private Rule() {
		this.status = true;
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
}
