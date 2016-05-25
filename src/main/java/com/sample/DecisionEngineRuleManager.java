package com.sample;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DecisionEngineRuleManager {
	
	 /*public static void main(String args[]) {
		  int score = 0;
		  score = getScore("MIS_IP");
		  System.out.println("The score is: "+score);
		 }*/
	
	public int ruleScore = 0;
	public String ruleDesc = null;
	public String modelName;
	public int minValue = 0;
	public int maxValue = 0;
	

	public int getRuleScore() {
		return ruleScore;
	}

	public void setRuleScore(int ruleScore) {
		this.ruleScore = ruleScore;
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

	public int getScore(String code){
		 File f = new File(modelName);
		 //File f = new File("CarLoanFraudModel.xml");
		 DocumentBuilder db = null;
		 DocumentBuilderFactory dbf = null;
		 String ruleCode = null;
		 String scoreStr=null;
		 //int ruleScore = 0;
		 //String ruleDesc = null;
		 
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
		     //if ("subCategory".equals(subCategoryNode.getNodeName()))
		     //NodeList detail = ruleNode.getChildNodes();
		     if (code.equals(rule.getAttributes().getNamedItem("code").getNodeValue())){ // 输出code
		    	 ruleCode = rule.getAttributes().getNamedItem("code").getNodeValue();
		    	  scoreStr = rule.getAttributes().getNamedItem("score").getNodeValue();
		   	      //ruleDesc = rule.getAttributes().getNamedItem("description").getNodeValue();
		    	  setRuleScore(Integer.valueOf(scoreStr).intValue());
		    	  setRuleDesc(rule.getAttributes().getNamedItem("description").getNodeValue());
		   	      //ruleScore = Integer.valueOf(scoreStr).intValue();
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
	
	public int getScore(String code, int mode){
		 File f = new File(modelName);
//		File f = new File("CarLoanFraudModel.xml");
		 DocumentBuilder db = null;
		 DocumentBuilderFactory dbf = null;
		 String ruleCode = null;
		 String scoreStr=null;
		 String vMinValue=null;
		 String vMaxValue=null;
		 //int ruleScore = 0;
		 //String ruleDesc = null;
		 
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
		     //if ("subCategory".equals(subCategoryNode.getNodeName()))
		     //NodeList detail = ruleNode.getChildNodes();
		     if (code.equals(rule.getAttributes().getNamedItem("code").getNodeValue())){ // 输出code
		    	 ruleCode = rule.getAttributes().getNamedItem("code").getNodeValue();
		    	  scoreStr = rule.getAttributes().getNamedItem("score").getNodeValue();
		   	      //ruleDesc = rule.getAttributes().getNamedItem("description").getNodeValue();
		   	      vMinValue = rule.getAttributes().getNamedItem("min").getNodeValue();
		   	      vMaxValue = rule.getAttributes().getNamedItem("max").getNodeValue();
		   	      setRuleScore(Integer.valueOf(scoreStr).intValue());
		   	      setRuleDesc(rule.getAttributes().getNamedItem("description").getNodeValue());
		   	      setMinValue(Integer.valueOf(vMinValue).intValue());
		   	      setMaxValue(Integer.valueOf(vMaxValue).intValue());
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
