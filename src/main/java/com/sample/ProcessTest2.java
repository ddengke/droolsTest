package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.InputMessage;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest2 {

    public static final void main(String[] args) {
    	//InputMessage inputMsg = new InputMessage();
    	//inputMsg.setTaskResult(2);
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process2");

            // start a new process instance
        	//kSession.insert(inputMsg);
            kSession.startProcess("sample2");
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
