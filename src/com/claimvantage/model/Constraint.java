package com.claimvantage.model;

public class Constraint {
	
	private SobField field;
	private String value;
	private Operator operator;
	
	public SobField getField() {
		return field;
	}
	public void setField(SobField field) {
		this.field = field;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
