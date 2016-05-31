package com.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.drools.runtime.process.ProcessInstance;
import org.jbpm.workflow.instance.WorkflowProcessInstance;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.sample.InputMessage;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

    public static final void main(String[] args) {
    	InputMessage inputMsg = new InputMessage();
    	inputMsg.setTestResult(1);
    	int messages;
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");
        	kSession.insert(inputMsg);
        	Map<String, Object> params = new HashMap<String, Object>();
            params.put("taskResult", 21);
            // start a new process instance
            org.kie.api.runtime.process.ProcessInstance process = kSession.startProcess("sample2",params);
            kSession.fireAllRules();
            messages = (int) ((WorkflowProcessInstance)process).getVariable("testResult");
            System.out.println("The final result is: "+messages);
            kSession.dispose();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
