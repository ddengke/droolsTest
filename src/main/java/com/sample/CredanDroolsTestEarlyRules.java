package com.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.sample.RuleManager;
import com.sample.EarlyFraudInputMessage;

public class CredanDroolsTestEarlyRules {

	public static void main(String[] args) {


		EarlyFraudInputMessage inputMsg = EarlyFraudInputMessage.builder().setId("43290119820220513X").build();

		RuleManager ruleManager = new RuleManager();
		ruleManager.setModelName("src/main/resources/FastLoanEarlyFraudModel.xml");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 显示的格式
		String date = sdf.format(new Date());
		System.out.println("系统开始执行时间：" + date);
		try {
			KnowledgeBase kbase = readKnowledgeBase();
			StatefulKnowledgeSession kieSession = kbase.newStatefulKnowledgeSession();
			KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(kieSession, "test");
			System.out.println("==========================");

			kieSession.insert(inputMsg);
			kieSession.insert(ruleManager);
			kieSession.fireAllRules();
			System.out.println("前置反欺诈最终结果为: " + ruleManager.getEarlyFraudDecision());
			kieSession.dispose();
			logger.close();
			date = sdf.format(new Date());
			System.out.println("==========================");
			System.out.println("系统执行结束时间：" + date);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("com/rules/posNegative.drl"), ResourceType.DRL);
		
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}
	

}
