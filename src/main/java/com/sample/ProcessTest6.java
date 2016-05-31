package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.runtime.process.ProcessInstance;
import org.jbpm.workflow.instance.WorkflowProcessInstance;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.sample.DecisionEngineInputMessage;
import com.sample.DecisionEngineRuleManager;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest6 {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process6");
        	DecisionEngineInputMessage inputMsg = new DecisionEngineInputMessage();
        	
        	List<String> messages = new ArrayList<String>();
            messages.add("message 1");
            messages.add("message 2");
            messages.add("message 3");
        	Map<String, Object> params = new HashMap<String, Object>();
            params.put("messages", messages);
            kSession.insert(inputMsg);
            // start a new process instance
            //org.kie.api.runtime.process.ProcessInstance process = kSession.startProcess("org.jbpm.quickstarts.reusablesubprocessparent",params);
            kSession.fireAllRules();
            /*messages = (List<String>) ((WorkflowProcessInstance)process).getVariable("messages");
            for (String message : messages) {
                System.out.println("Message = "+message);
            }*/
            inputMsg.addPolicyRuleResult(0);
            List<Integer> messages2 = new ArrayList<Integer>();
            messages2 = inputMsg.getPolicyRuleResult();
            for (int message : messages2) {
                System.out.println("Message = "+message);
            }
            kSession.dispose();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
