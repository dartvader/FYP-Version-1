package com.claimvantage.drools.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.MatchEvent;
import org.kie.api.runtime.rule.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A listener that will track all rule firings in a session.
 * 
 * @author Stephen Masters
 */
public class TrackingAgendaEventListener extends DebugAgendaEventListener {

    private static Logger log = LoggerFactory.getLogger(TrackingAgendaEventListener.class);

    private ArrayList<String> ruleList = new ArrayList<String>();
    
    @Override
    public void afterMatchFired(AfterMatchFiredEvent event) {
    	
    	Match matchedEvent = event.getMatch();
    	org.kie.api.definition.rule.Rule rule = matchedEvent.getRule();
    	

        String ruleName = rule.getName();
        ruleList.add(ruleName);
        Map<String, Object> ruleMetaDataMap = rule.getMetaData();
        StringBuilder sb = new StringBuilder("Rule fired: " + ruleName);
        
        if (ruleMetaDataMap.size() > 0) {
            sb.append("\n  With [" + ruleMetaDataMap.size() + "] meta-data:");
            for (String key : ruleMetaDataMap.keySet()) {
                sb.append("\n    key=" + key + ", value="
                        + ruleMetaDataMap.get(key));
            }
        }
        System.out.println(">>> after match ");
        log.debug(sb.toString());
    }

    public boolean isRuleFired(String ruleName) {
        for (String a : ruleList) {
            if (a.equals(ruleName)) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        ruleList.clear();
    }

    public final ArrayList<String> getRuleList() {
        return ruleList;
    }
}