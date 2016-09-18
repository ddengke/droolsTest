package com.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class RuleManager {
	
	public int ruleScore;
	public String ruleDesc;
	public String modelName;
	public int minValue;
	public int maxValue;
	
	//返回结果
	private List<Integer> earlyFraudResult = new ArrayList<Integer>();
	private String earlyFraudDecision;
	public int ruleTotalScore;
	
	//记录所有触发的规则
	public void recordRules(String ruleCode, int ruleScore, String ruleDesc){
		System.out.println("触发的规则代码: " + ruleCode + "; 规则评分: "+ruleScore+"; 规则描述: "+ruleDesc);
	}
	/**
	 * 记录所有触发的规则并保存到数据库
	 */
	public static List<Map<String, Object>> rules = Lists.newArrayList();
	
	/*public void recordRules(String ruleCode, int ruleScore, String ruleDesc){
		Map<String, Object> map = Maps.newHashMap();
		map.put("ruleCode", ruleCode);
		map.put("ruleScore", ruleScore);
		map.put("ruleDesc", ruleDesc);
		rules.add(map);
	}*/
	
	//所有有分值规则的公用方法，对规则分数进行累加
	public void addRuleTotalScore(int score){
		this.ruleTotalScore = this.ruleTotalScore + score;
	}
	
	//所有前置性规则的公用方法，没有分数的累加，只有结果的输出
	public void addEarlyFraudResult(int ruleResult){
		earlyFraudResult.add(ruleResult);
	}

	public String getEarlyFraudDecision() {
		return earlyFraudDecision;
	}

	//前置性规则的公用方法，输出前置规则的最终结果，优先级为：reject > accept > review
	public void setEarlyFraudDecision(String earlyFraudDecision) {
		this.earlyFraudDecision = earlyFraudDecision;
	}

	public int getRuleScore() {
		return ruleScore;
	}

	public void setRuleScore(int ruleScore) {
		this.ruleScore = ruleScore;
	}

	public List<Integer> getEarlyFraudResult() {
		return earlyFraudResult;
	}

	public void setEarlyFraudResult(List<Integer> earlyFraudResult) {
		this.earlyFraudResult = earlyFraudResult;
	}

	public String getRuleDesc() {
		return ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getRuleTotalScore() {
		return ruleTotalScore;
	}

	public void setRuleTotalScore(int ruleTotalScore) {
		this.ruleTotalScore = ruleTotalScore;
	}

	public int readRuleInfo(String code, int ruleType){
		 File f = new File(modelName);
		 //File f = new File("CarLoanFraudModel.xml");
		 DocumentBuilder db = null;
		 DocumentBuilderFactory dbf = null;
		 
		 //Initiate rule info
		 //String ruleCode = null;
		 String scoreStr=null;
		 String vMinValue=null;
		 String vMaxValue=null;
		 ruleScore = -1;
		 ruleDesc = null;
		 minValue = 0;
		 maxValue = 0;
		 
		 try {
		  // 返回documentBuilderFactory对象
		  dbf = DocumentBuilderFactory.newInstance();
		  // 返回db对象用documentBuilderFatory对象获得返回documentBuildr对象
		  db = dbf.newDocumentBuilder();
		  // 得到一个DOM并返回给document对象
		  Document dt = db.parse(f);
		  NodeList ruleNode = dt.getElementsByTagName("rule");
		    // 遍历<category>下的节点
		    for (int i = 0; i < ruleNode.getLength(); i++) {
		     // 获得<category>元素每一个节点
		     Node rule = ruleNode.item(i);
		     if (code.equals(rule.getAttributes().getNamedItem("code").getNodeValue())){ // 输出code
		    	  //ruleCode = rule.getAttributes().getNamedItem("code").getNodeValue();
		    	  scoreStr = rule.getAttributes().getNamedItem("score").getNodeValue();
		    	  setRuleScore(Integer.valueOf(scoreStr).intValue());
		    	  setRuleDesc(rule.getAttributes().getNamedItem("description").getNodeValue());
		    	  if (ruleType == 2){
		    		  vMinValue = rule.getAttributes().getNamedItem("min").getNodeValue();
			   	      vMaxValue = rule.getAttributes().getNamedItem("max").getNodeValue();
			   	      setMinValue(Integer.valueOf(vMinValue).intValue());
			   	      setMaxValue(Integer.valueOf(vMaxValue).intValue());
		    	  }
		   	  break;
		     }      
		    }
		    //System.out.println("找寻到的规则代码: " + ruleCode + "; 规则分值: "+ruleScore+"; 规则描述: "+ruleDesc);
		 }
		 catch (Exception e) {
		  e.printStackTrace();
		 }
		 return ruleScore;
	 }

}
