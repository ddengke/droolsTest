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

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest5 {

    public static final void main(String[] args) {
DecisionEngineInputMessage inputMsg = new DecisionEngineInputMessage();
		
		inputMsg.setAge(23);
		inputMsg.setMarriage(1);
		inputMsg.setSex(1);
		inputMsg.setEducation(2);
		inputMsg.setHukou(0);
		inputMsg.setCompanyNature(3);
		inputMsg.setTitle(0);
		inputMsg.setWorkExperience(0);
		inputMsg.setPayroll(1);
		inputMsg.setSocialSecurity(1);
		inputMsg.setGjj(1);
		inputMsg.setHasHouse(0);
		inputMsg.setHasCar(0);
		inputMsg.setHasInsurance(0);
		inputMsg.setHasNationalDebt(0);
		inputMsg.setHasFinProd(0);
		inputMsg.setMobileLife(3);
		inputMsg.setResidenceMonth(3);
		inputMsg.setLoanTerm(24);
		inputMsg.setDownPaymentRate(0.2);
		//inputMsg.setRiskLevel(0);
		
		inputMsg.setTotalScore(0);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //显示的格式
		String date = sdf.format(new Date()); 
		System.out.println("系统开始执行时间："+date);
		DecisionEngineRuleManager ruleManager = new DecisionEngineRuleManager();
		ruleManager.setModelName("src/main/resources/ScoreCardModel.xml");
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
            params.put("policyRuleFlag", 11);
            kSession.startProcess("appDecisionProcess",params);
            kSession.fireAllRules();
            kSession.dispose();
			DecimalFormat df = new DecimalFormat("0.00");
			String finalAmount = df.format(inputMsg.getApprovedAmount());
			System.out.println("年龄的评分为："+inputMsg.getAgeScore()+"分\n"
								+"婚姻的评分为："+inputMsg.getMarriageScore()+"分\n"
								+"总评分模型得分为："+inputMsg.getTotalScore()+"分\n"
								+"最终的风险级别评定为："+inputMsg.getRiskLevel()+"级\n"
								+"可贷款金额范围为："+inputMsg.getAmountThresholdMin()+" ~ "+inputMsg.getAmountThresholdMax()+"元\n"
								+"最终评定的风险系数为："+inputMsg.getRiskRate()+"%\n"
								+"最终审核通过的贷款金额为："+finalAmount+"元");
			date = sdf.format(new Date()); 
			System.out.println("==========================");
			System.out.println("系统执行结束时间："+date);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
