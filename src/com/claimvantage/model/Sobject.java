package com.claimvantage.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sobject {
	
	private String sobApi;
	private String sobLabel;
	private List<SobField> sobFields;
	
	public String getSobApi() {
		return sobApi;
	}
	public void setSobApi(String sobApi) {
		this.sobApi = sobApi;
	}
	public String getSobLabel() {
		return sobLabel;
	}
	public void setSobLabel(String sobLabel) {
		this.sobLabel = sobLabel;
	}
	public List<SobField> getSobFields() {
		return sobFields;
	}
	public void setSobFields(List<SobField> sobFields) {
		this.sobFields = sobFields;
	}
}
