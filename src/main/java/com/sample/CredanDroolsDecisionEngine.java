package com.sample;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.sample.DecisionEngineInputMessage;
import com.sample.DecisionEngineRuleManager;


public class CredanDroolsDecisionEngine {

	public static void main(String[] args) {

DecisionEngineInputMessage inputMsg = new DecisionEngineInputMessage();
		
		inputMsg.setAge(23);
		inputMsg.setMarriage(1);
		inputMsg.setSex(1);
		inputMsg.setEducation(2);
		inputMsg.setHukou(1);
		inputMsg.setCompanyNature(3);
		inputMsg.setTitle(4);
		inputMsg.setWorkExperience(0.5);
		inputMsg.setPayroll(1);
		inputMsg.setSocialSecurity(0);
		inputMsg.setGjj(0);
		inputMsg.setBadge(0);
		inputMsg.setWageWater(0);
		inputMsg.setIncomeCert(0);
		inputMsg.setHasHouse(0);
		inputMsg.setHasCar(0);
		inputMsg.setHasInsurance(0);
		inputMsg.setHasNationalDebt(0);
		inputMsg.setHasFinProd(0);
		inputMsg.setMobileLife(0);
		inputMsg.setResidenceMonth(0);
		inputMsg.setLoanTerm(24);
		inputMsg.setDownPaymentRate(0.32);
		
		inputMsg.setSalary(6789.2);
		inputMsg.setProfitLevel("HP");
		//inputMsg.setRiskLevel(0);
		
		inputMsg.setTotalScore(0);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //显示的格式
		String date = sdf.format(new Date()); 
		System.out.println("系统开始执行时间："+date);
		DecisionEngineRuleManager ruleManager = new DecisionEngineRuleManager();
		ruleManager.setModelName("src/main/resources/FastLoanDecisionModel.xml");
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("appDecisionEngine-session");
            // start a new process instance
        	System.out.println("==========================");

        	kSession.insert(inputMsg);
        	kSession.insert(ruleManager);
        	Map<String, Object> params = new HashMap<String, Object>();
            params.put("policyRuleFlag", 21);
            kSession.startProcess("appDecisionProcess",params);
            kSession.fireAllRules();
            kSession.dispose();
			DecimalFormat df = new DecimalFormat("0.00");
			String finalAmount = df.format(inputMsg.getApprovedAmount());
			System.out.println("总评分模型得分为："+inputMsg.getTotalScore()+"分\n"
								+"最终的风险级别评定为："+inputMsg.getRiskLevel()+"级\n"
								+"可贷款金额范围为："+inputMsg.getAmountThresholdMin()+" ~ "+inputMsg.getAmountThresholdMax()+"元\n"
								+"最终评定的风险系数为："+inputMsg.getRiskRate()+"%\n"
								+"最终审核通过的贷款金额为："+finalAmount+"元\n"
								+"政策规则审核的结果为："+inputMsg.getPolicyRuleDecision());
			date = sdf.format(new Date()); 
			System.out.println("==========================");
			System.out.println("系统执行结束时间："+date);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
