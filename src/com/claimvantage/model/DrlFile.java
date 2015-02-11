package com.claimvantage.model;

import java.util.List;

public class DrlFile {
	
	StringBuilder ruleScript;
	Rule rule;

	public final String LOCAL_PACKAGE = "package com.claimvantage.* \n";
	public final String LOCAL_IMPORTS_OBJECTS = "import com.claimvantage.soap.enterprise.* \n";
	public final String ANY_TRUE_BINDER = " || ";
	public final String ALL_TRUE_BINDER = " , ";
	
	public DrlFile(Rule rule) {
		this.rule = rule;
		this.buildRuleScript(rule);
	}

	private StringBuilder buildRuleScript(Rule rule) {
		ruleScript = new StringBuilder();
		
		addPackages();
		addImports();
		
		addRuleName(rule.getName());
		for (Condition c : rule.getConditions()) {
			addPatterns(c.getPatterns());
		};
		addConsequence(rule.getConsequence(), rule.getName());
		return ruleScript;
	}
	
	private void addBlankLine() {    	
		ruleScript.append("\n");
    }
	
	private void addTab() {    	
		ruleScript.append("\t");
    }
	
	private void addPackages() {    	
		ruleScript.append(LOCAL_PACKAGE);
    }
    
	private void addImports() {    	
    	ruleScript.append(LOCAL_IMPORTS_OBJECTS);
    }
    
	private void addRuleName(String ruleName) {
    	ruleScript.append("rule '" + ruleName + "' when \n");
    }
    
	private void addPatterns(List<Pattern> patterns) {
    	
    	Sobject object;
    	String pattern = "";
    	List<Constraint> constraints;

    	for (Pattern p : patterns) {
    		object = p.getObject();
    		constraints = p.getConstraints();
    		pattern += object.getSobApi() + "(";
    		
    		if (p.getType().contains("Single")) {
    			pattern += addConstraints(p.getConstraints(), p.getType(), null);
    		} else if (p.getType() == "Any") {
    			pattern += addConstraints(p.getConstraints(), p.getType(), ANY_TRUE_BINDER);
    		} else if (p.getType() == "All") {
    			pattern += addConstraints(p.getConstraints(), p.getType(), ALL_TRUE_BINDER);
    		}
    	}
    	ruleScript.append(pattern);
    }
    
    private String addConstraints(List<Constraint> constraints, String type, String patternBinder) {

		System.out.println(">>> Adding constraints");
    	String pattern = "";
    	Boolean needsPatternBinder = false;
    	System.out.println(">>> constraints.size " + constraints.size());
    	for (Constraint c : constraints) {

    		pattern += needsPatternBinder == true ? patternBinder : "";
			pattern += c.getField().getType() == "String" ?  
			        addStringConstraint(c.getField().getApi(), c.getOperator().getValue(), c.getValue()):
					addNumericConstraint(c.getField().getApi(), c.getOperator().getValue(), c.getValue());
			// Using flag to tag on the pattern binder to front of the constraint if there are more the one constraints in the list
			needsPatternBinder = true;
		}
    	pattern +=");\n";
		return pattern;
	}

    private void addConsequence(Consequence c, String ruleName) {
    	String consequence = "";
    	consequence += "Then \n";
    	consequence += "  insert( new Alert(" + ruleName + "," + c.getScore() + "," + c.getRecommendation() + ")); \n";
    	consequence += "end \n";
    	ruleScript.append(consequence);
    }
    
    private String addStringConstraint(String field, String operator, String value) {
		System.out.println(">>> Adding String");
    	return field + operator + "'" + value + "'";
    }
    
    private String addNumericConstraint(String field, String operator, String value) {
		System.out.println(">>> Adding numeric");
    	return field + operator + value;
    }

    private StringBuilder getRuleScript() {
		return ruleScript;
	}

    private void setRuleScript(StringBuilder ruleScript) {
		this.ruleScript = ruleScript;
	}

    private Rule getRule() {
		return rule;
	}

    private void setRule(Rule rule) {
		this.rule = rule;
	}
}
