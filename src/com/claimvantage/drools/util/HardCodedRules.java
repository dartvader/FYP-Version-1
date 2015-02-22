package com.claimvantage.drools.util;

public final class HardCodedRules {
	
    // Example drl Strings for testing
    public static String getClaimRule() {
        String s = "" +
                   "package com.claimvantage.session \n\n" +
                   "import com.claimvantage.* \n\n" +
                   
                   "global java.io.PrintStream out \n\n" +
                   
                   "rule 'rule 1' when \n" +
                   "    m : Message( ) \n" +
                   "then \n" +
                   "    out.println( m.getName() + ':'  +  m.getText() ); \n" +
                   "end \n" +
                   
                   "rule 'rule 2' when \n" +
                   "    Message( text == \"Hello, HAL. Do you read me, HAL?\" ) \n" +
                   "then \n" +
                   "    insert( new Message(\"HAL\", \"Dave. I read you.\" ) ); \n" +
                   "end";
        return s;
    }
    
    public static String getStringRule() {
    	String s = "" +
                "package com.rules \n" +
                "import com.claimvantage.model.* \n" +
                "import com.sforce.soap.enterprise.* \n" +
                "import java.io.PrintStream \n\n" +
                
                "rule 'rule claim string' when \n" +
                "    Cve__Claim__C( $beforeTax : Cve__IncurredBeforeTax__C) \n" +
                "    Cve__Claim__C(Cve__BenefitType__C == 'STD') \n" +
                "then \n" +
                "    System.out.println('beforeTax STD CLaim ' + $beforeTax); \n" +
                "    insert( new Alert('Claim', 20, 'Recommendation') ); \n" +
                "end \n";
    	return s;
    }
    public static String getDoubleRule() {
    	String s = "" +
                "package com.rules \n" +
                "import com.claimvantage.model.* \n" +
                "import com.sforce.soap.enterprise.* \n" +
                "import java.io.PrintStream \n\n" +
                
                "rule 'rule claim double' when \n" +
                "   Cve__Claim__C($beforeTax : Cve__IncurredNet__C) \n" +
    			"   Cve__Claim__C(Cve__IncurredNet__C > 0.00);" + 
                "then \n" +
                "    System.out.println('beforeTax Claim ' + $beforeTax); \n" +
                "    insert( new Alert('Claim', 20, 'Recommendation') ); \n" +
                "end \n";
    	return s;
    }
}
