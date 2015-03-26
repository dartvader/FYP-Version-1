package com.claimvantage.drools.util;


/**
 * This code was taken from the ClaimVantage enterprise application.
 */
import java.util.ArrayList;
import java.util.List;

import com.claimvantage.model.SobField;

public class Strings {
    
    public static String csvs(List<SobField> fields) {
        return separate(new ArrayList<SobField>(fields), ",", "");
    }
    
    public static String csvs(ArrayList<SobField> strings) {
        return separate(strings, ",", "");
    }
    
    public static String separate(ArrayList<SobField> strings, String separator, String quote) {
        String result = "";
        for (SobField o : strings) {
            if (o.getApi() != null) {
                if (result.length() > 0) {
                    result += separator;
                }
                if (quote != null) {
                    result += quote;
                }
                result += o.getApi();
                if (quote != null) {
                    result += quote;
                }
            }
        }
        return result;
    }
}