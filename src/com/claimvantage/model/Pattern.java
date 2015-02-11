package com.claimvantage.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pattern {

	private Sobject object;
	private String type;
	private List<Constraint> constraints;
	
	public Sobject getObject() {
		return object;
	}
	public void setObject(Sobject object) {
		this.object = object;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Constraint> getConstraints() {
		return constraints;
	}
	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}
}
