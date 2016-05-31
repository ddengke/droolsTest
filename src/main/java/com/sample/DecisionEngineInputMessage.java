package com.sample;

import java.util.ArrayList;
import java.util.List;

public class DecisionEngineInputMessage {
	
	private int totalScore;
	private int riskLevel;
	private double riskRate;
	private int amountThresholdMin;
	private int amountThresholdMax;
	private double requestedAmount;
	private double approvedAmount;
	private int age;
	private int ageScore;
	private int marriage;
	private int marriageScore;
	private int sex;
	private int sexScore;
	private int education;
	private int educationScore;
	private int hukou;
	private int hukouScore;
	private int companyNature;
	private int companyNatureScore;
	private int title;
	private int titleScore;
	private double workExperience;
	private int workExperienceScore;
	private double salary;
	private int salaryScore;
	private int payroll;
	private int payrollScore;
	private int socialSecurity;
	private int socialSecurityScore;
	private int gjj;
	private int gjjScore;
	private int badge;
	private int badgeScore;
	private int wageWater;
	private int wageWaterScore;
	private int incomeCert;
	private int incomeCertScore;
	private int hasHouse;
	private int hasHouseScore;
	private int hasCar;
	private int hasCarScore;
	private int hasInsurance;
	private int hasInsuranceScore;
	private int hasNationalDebt;
	private int hasNationalDebtScore;
	private int hasFinProd;
	private int hasFinProdScore;
	private int mobileLife;
	private int mobileLifeScore;
	private int residenceMonth;
	private int residenceMonthScore;
	private int loanTerm;
	private int loanTermScore;
	private double downPaymentRate;
	private int downPaymentRateScore;
	private String profitLevel;
	
	//policy rule inputs
	private double currentLoanAmount;
	private List<Integer> policyRuleResult = new ArrayList<Integer>();
	private String policyRuleDecision;
	
	public void recordRules(String ruleCode, int ruleScore, String ruleDesc){
		//System.out.println("触发的规则代码: " + ruleCode + "; 规则分值: "+ruleScore+"; 规则描述: "+ruleDesc);
		//System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	
	public void addPolicyRuleResult(int ruleResult){
		policyRuleResult.add(ruleResult);
	}
	
	public void recordRules(String ruleCode, int score){
		System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	
	public List<Integer> getPolicyRuleResult() {
		return policyRuleResult;
	}

	public void setPolicyRuleResult(List<Integer> policyRuleResult) {
		this.policyRuleResult = policyRuleResult;
	}

	public double getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(double approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int getHukouScore() {
		return hukouScore;
	}

	public void setHukouScore(int hukouScore) {
		this.hukouScore = hukouScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}

	public double getRiskRate() {
		return riskRate;
	}

	public void setRiskRate(double riskRate) {
		this.riskRate = riskRate;
	}

	public int getAmountThresholdMin() {
		return amountThresholdMin;
	}

	public void setAmountThresholdMin(int amountThresholdMin) {
		this.amountThresholdMin = amountThresholdMin;
	}

	public int getAmountThresholdMax() {
		return amountThresholdMax;
	}

	public void setAmountThresholdMax(int amountThresholdMax) {
		this.amountThresholdMax = amountThresholdMax;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public int getAgeScore() {
		return ageScore;
	}

	public void setAgeScore(int ageScore) {
		this.ageScore = ageScore;
	}


	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public int getMarriageScore() {
		return marriageScore;
	}

	public void setMarriageScore(int marriageScore) {
		this.marriageScore = marriageScore;
	}

	public int getSexScore() {
		return sexScore;
	}

	public void setSexScore(int sexScore) {
		this.sexScore = sexScore;
	}

	public int getEducationScore() {
		return educationScore;
	}

	public void setEducationScore(int educationScore) {
		this.educationScore = educationScore;
	}

	public int getTitleScore() {
		return titleScore;
	}

	public void setTitleScore(int titleScore) {
		this.titleScore = titleScore;
	}


	public double getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(double workExperience) {
		this.workExperience = workExperience;
	}

	public int getWorkExperienceScore() {
		return workExperienceScore;
	}

	public void setWorkExperienceScore(int workExperienceScore) {
		this.workExperienceScore = workExperienceScore;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSalaryScore() {
		return salaryScore;
	}

	public void setSalaryScore(int salaryScore) {
		this.salaryScore = salaryScore;
	}

	public int getGjjScore() {
		return gjjScore;
	}

	public void setGjjScore(int gjjScore) {
		this.gjjScore = gjjScore;
	}

	public int getHasHouseScore() {
		return hasHouseScore;
	}

	public void setHasHouseScore(int hasHouseScore) {
		this.hasHouseScore = hasHouseScore;
	}

	public int getHasCarScore() {
		return hasCarScore;
	}

	public void setHasCarScore(int hasCarScore) {
		this.hasCarScore = hasCarScore;
	}

	public int getMobileLife() {
		return mobileLife;
	}

	public void setMobileLife(int mobileLife) {
		this.mobileLife = mobileLife;
	}

	public int getMobileLifeScore() {
		return mobileLifeScore;
	}

	public void setMobileLifeScore(int mobileLifeScore) {
		this.mobileLifeScore = mobileLifeScore;
	}

	public int getResidenceMonth() {
		return residenceMonth;
	}

	public void setResidenceMonth(int residenceMonth) {
		this.residenceMonth = residenceMonth;
	}

	public int getResidenceMonthScore() {
		return residenceMonthScore;
	}

	public void setResidenceMonthScore(int residenceMonthScore) {
		this.residenceMonthScore = residenceMonthScore;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public int getLoanTermScore() {
		return loanTermScore;
	}

	public void setLoanTermScore(int loanTermScore) {
		this.loanTermScore = loanTermScore;
	}

	public int getPayrollScore() {
		return payrollScore;
	}

	public void setPayrollScore(int payrollScore) {
		this.payrollScore = payrollScore;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public int getBadgeScore() {
		return badgeScore;
	}

	public void setBadgeScore(int badgeScore) {
		this.badgeScore = badgeScore;
	}

	public int getWageWater() {
		return wageWater;
	}

	public void setWageWater(int wageWater) {
		this.wageWater = wageWater;
	}

	public int getWageWaterScore() {
		return wageWaterScore;
	}

	public void setWageWaterScore(int wageWaterScore) {
		this.wageWaterScore = wageWaterScore;
	}

	public int getIncomeCert() {
		return incomeCert;
	}

	public void setIncomeCert(int incomeCert) {
		this.incomeCert = incomeCert;
	}

	public int getIncomeCertScore() {
		return incomeCertScore;
	}

	public void setIncomeCertScore(int incomeCertScore) {
		this.incomeCertScore = incomeCertScore;
	}

	public int getSocialSecurityScore() {
		return socialSecurityScore;
	}

	public void setSocialSecurityScore(int socialSecurityScore) {
		this.socialSecurityScore = socialSecurityScore;
	}

	public int getHasInsuranceScore() {
		return hasInsuranceScore;
	}

	public void setHasInsuranceScore(int hasInsuranceScore) {
		this.hasInsuranceScore = hasInsuranceScore;
	}

	public int getHasNationalDebtScore() {
		return hasNationalDebtScore;
	}

	public void setHasNationalDebtScore(int hasNationalDebtScore) {
		this.hasNationalDebtScore = hasNationalDebtScore;
	}

	public int getHasFinProdScore() {
		return hasFinProdScore;
	}

	public void setHasFinProdScore(int hasFinProdScore) {
		this.hasFinProdScore = hasFinProdScore;
	}

	public double getDownPaymentRate() {
		return downPaymentRate;
	}

	public void setDownPaymentRate(double downPaymentRate) {
		this.downPaymentRate = downPaymentRate;
	}

	public int getDownPaymentRateScore() {
		return downPaymentRateScore;
	}

	public void setDownPaymentRateScore(int downPaymentRateScore) {
		this.downPaymentRateScore = downPaymentRateScore;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getHukou() {
		return hukou;
	}

	public void setHukou(int hukou) {
		this.hukou = hukou;
	}

	public int getCompanyNature() {
		return companyNature;
	}

	public void setCompanyNature(int companyNature) {
		this.companyNature = companyNature;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public int getPayroll() {
		return payroll;
	}

	public void setPayroll(int payroll) {
		this.payroll = payroll;
	}

	public int getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public int getGjj() {
		return gjj;
	}

	public void setGjj(int gjj) {
		this.gjj = gjj;
	}

	public int getHasHouse() {
		return hasHouse;
	}

	public void setHasHouse(int hasHouse) {
		this.hasHouse = hasHouse;
	}

	public int getHasCar() {
		return hasCar;
	}

	public void setHasCar(int hasCar) {
		this.hasCar = hasCar;
	}

	public int getHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(int hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public int getHasNationalDebt() {
		return hasNationalDebt;
	}

	public void setHasNationalDebt(int hasNationalDebt) {
		this.hasNationalDebt = hasNationalDebt;
	}

	public int getHasFinProd() {
		return hasFinProd;
	}

	public void setHasFinProd(int hasFinProd) {
		this.hasFinProd = hasFinProd;
	}

	public int getCompanyNatureScore() {
		return companyNatureScore;
	}

	public void setCompanyNatureScore(int companyNatureScore) {
		this.companyNatureScore = companyNatureScore;
	}

	public String getProfitLevel() {
		return profitLevel;
	}

	public void setProfitLevel(String profitLevel) {
		this.profitLevel = profitLevel;
	}

	public double getCurrentLoanAmount() {
		return currentLoanAmount;
	}

	public void setCurrentLoanAmount(double currentLoanAmount) {
		this.currentLoanAmount = currentLoanAmount;
	}

	public String getPolicyRuleDecision() {
		return policyRuleDecision;
	}

	public void setPolicyRuleDecision(String policyRuleDecision) {
		this.policyRuleDecision = policyRuleDecision;
	}




}
