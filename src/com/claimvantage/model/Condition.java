package com.claimvantage.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Condition {
	
	private Sobject object;
	private List<Pattern> patterns;
	
	public Sobject getObject() {
		return object;
	}
	public void setObject(Sobject object) {
		this.object = object;
	}
	public List<Pattern> getPatterns() {
		return patterns;
	}
	public void setPatterns(List<Pattern> patterns) {
		this.patterns = patterns;
	}
}
