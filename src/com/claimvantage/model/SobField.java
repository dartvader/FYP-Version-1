package com.claimvantage.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SobField {
		
	private String api;
	private String label;
	private String type;
	
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
