package com.claimvantage.drools.util;

import java.util.List;

import com.claimvantage.model.Condition;
import com.claimvantage.model.Consequence;
import com.claimvantage.model.Constraint;
import com.claimvantage.model.Pattern;
import com.claimvantage.model.Rule;
import com.claimvantage.model.Sobject;

/* 
 * This class will contain needed packages, Rule names, imports and any String Constant needed
 */
public final class BuilderUtil {
	
	public static final String NEW_LINE = "\n";
	public static final String DOUBLE_NEW_LINE = "\n\n";
	public static final String TAB = "\t";
	public static final String DOUBLE_TAB = "\t\t";
	
	public final static String LOCAL_PACKAGE_RULES = "package com.rules \n";
	public final static String IMPORTS_MODEL = "import com.claimvantage.model.* \n";
	public final static String LOCAL_IMPORTS_OBJECTS = "import com.sforce.soap.enterprise.Cve__Claim__C \n";
	
	public final static String ANY_TRUE_BINDER = " || ";
	public final static String ALL_TRUE_BINDER = " , ";
	
	/*
	 * Hard keywords are reserved, you cannot use any hard keyword when naming your 
	 * domain objects, properties, methods, functions and other elements that are used in the rule text.
	 * 
	 * Here is the list of hard keywords that must be avoided as identifiers when writing rules:
	 */
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	public static final String NULL = "null";
	
	/*
	 * Soft keywords are just recognized in their context, 
	 * enabling you to use these words in any other place if you wish, 
	 * although, it is still recommended to avoid them, 
	 * to avoid confusions, if possible. 
	 * 
	 * Here is a list of the soft keywords:
	 */
	public static final String LOCK_ON_ACTIVE = "lock-on-active";
	public static final String DATE_EFFECTIVE = "date-effective";
	public static final String DATE_EXPIRES = "date-expires";
	public static final String NO_LOOP = "no-loop";
	public static final String AUTO_FOCUS = "auto-focus";
	public static final String ACTIVATION_GROUP= "activation-group";
	public static final String AGENDA_GROUP = "agenda-group";
	public static final String RULEFLOW_GROUP= "ruleflow-group";
	public static final String ENTRY_POINT= "entry-point";
    public static final String DURATION= "duration";
    public static final String PACKAGE= "package";
    public static final String IMPORT = "import";
    public static final String DIALECT = "dialect";
    public static final String SALIENCE = "salience";
    public static final String ENABLED = "enabled";
    public static final String ATTRIBUTES = "attributes";
    public static final String RULE = "rule";
    public static final String EXTEND = "extend";
    public static final String WHEN = "when";
    public static final String THEN = "then";
    public static final String TEMPLATE = "template";
    public static final String QUERY = "query";
    public static final String DECLARE = "declare";
    public static final String FUNCTION = "function";
    public static final String GLOBAL = "global";
    public static final String EVAL = "eval";
    public static final String NOT = "not";
    public static final String IN = "in";
    public static final String OR = "or";
    public static final String AND = "and";
    public static final String EXISTS= "exists";
    public static final String FORALL= "forall";
    public static final String ACCUMULATE= "accumulate";
    public static final String COLLECT = "collect";
    public static final String FROM = "from";
    public static final String ACTION = "action";
    public static final String REVERSE = "reverse";
    public static final String RESULT = "result";
    public static final String END = "end";
    public static final String OVER = "over";
    public static final String INIT = "init";
    
    public static StringBuilder buildRuleScript(Rule rule) {
    	StringBuilder ruleScript = new StringBuilder();
		

    	ruleScript.append(NEW_LINE);
    	ruleScript.append(LOCAL_PACKAGE_RULES);
    	ruleScript.append(IMPORTS_MODEL);
    	ruleScript.append(LOCAL_IMPORTS_OBJECTS);
    	ruleScript.append("rule '" + rule.getName() + "' when \n");
		for (Condition c : rule.getConditions()) {
			ruleScript.append(addPatterns(c.getPatterns()));
		};
		ruleScript.append(addConsequence(rule.getConsequence(), rule.getName()));
		
		return ruleScript;
	}
    
	private static String addPatterns(List<Pattern> patterns) {
    	
    	Sobject object;
    	String pattern = "";
    	List<Constraint> constraints;

    	for (Pattern p : patterns) {
    		object = p.getObject();
    		constraints = p.getConstraints();
    		String javaObject = toJavaCodingConvention(object.getSobApi());
    		pattern += javaObject + "(";
    		
    		if (p.getType().contains("Single")) {
    			pattern += addConstraints(p.getConstraints(), p.getType(), null);
    		} else if (p.getType().contains("Any")) {
    			pattern += addConstraints(p.getConstraints(), p.getType(), ANY_TRUE_BINDER);
    		} else if (p.getType().contains("All")) {
    			pattern += addConstraints(p.getConstraints(), p.getType(), ALL_TRUE_BINDER);
    		}
    	}
    	return pattern;
    }
    
    private static String addConstraints(List<Constraint> constraints, String type, String patternBinder) {

    	String pattern = "";
    	Boolean needsPatternBinder = false;
    	for (Constraint c : constraints) {
    		System.out.println("patternBinder " + patternBinder);
    		pattern += needsPatternBinder == true ? patternBinder : "";
    		
			pattern += c.getField().getType().contains("String") ? addStringConstraint(c.getField().getApi(), c.getOperator().getValue(), c.getValue()):
					addNumericConstraint(c.getField().getApi(), c.getOperator().getValue(), c.getValue());
			
			// Using flag to tag on the pattern binder to front of the constraint if there are more the one constraints in the list
			needsPatternBinder = true;
		}
    	pattern +=");\n";
		return pattern;
	}

    private static String addConsequence(Consequence c, String ruleName) {
    	String consequence = "";
    	consequence += "then \n";
    	consequence += "  insert( new Alert('" + ruleName + "', " + c.getScore() + ", '" + c.getRecommendation() + "' )); \n";
    	consequence += "end \n";

    	return consequence;
    }
    
    private static String addStringConstraint(String field, String operator, String value) {
		String javaField = toJavaCodingConvention(field);
    	return javaField + operator + "'" + value + "'";
    }
    
    private static String addNumericConstraint(String field, String operator, String value) {
		String javaField = toJavaCodingConvention(field);
    	return javaField + operator + value;
    }
    // TODO Refactor this
    static String toJavaCodingConvention(String input) {
    	String firstCharUpper = firstToUpper(input);
    	String lastCharUpper = lastToUpper(firstCharUpper);
    	return lastCharUpper;
    }
    
    static String firstToUpper(String input){
    	String s = input.substring(0, 1).toUpperCase() + input.substring(1);
		return s;
    }
    static String lastToUpper(String input){
    	String lastChar = input.substring(input.length() - 1).toUpperCase();
    	lastChar = lastChar.toUpperCase();
    	input = input.substring(0,input.length()-1);
    	
        return input+lastChar;
    }
}
