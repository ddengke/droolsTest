package com.sample;

public class DecisionEngineInputMessage {
	
	private int totalScore;
	private int riskLevel;
	private double riskRate;
	private int amountThresholdMin;
	private int amountThresholdMax;
	private double finalAmount;
	private int age;
	private int ageScore;
	private String marriage;
	private int marriageScore;
	private String sex;
	private int sexScore;
	private String contactInfo;
	private int contactInfoScore;
	private String claimedEducation;
	private int claimedEducationScore;
	private String certifiedEducation;
	private int certifiedEducationScore;
	private String companyType;
	private int companyTypeScore;
	private String title;
	private int titleScore;
	private int workingExperience;
	private int workingExperienceScore;
	private double salary;
	private int salaryScore;
	private String shebao;
	private int shebaoScore;
	private String gjj;
	private int gjjScore;
	private String hasHouse;
	private int hasHouseScore;
	private String hasCar;
	private int hasCarScore;
	private String hasCreditCard;
	private int hasCreditCardScore;
	private int mobileLife;
	private int mobileLifeScore;
	private int livingLife;
	private int livingLifeScore;
	private int loanTerm;
	private int loanTermScore;
	private double payRate;
	private int payRateScore;
	private String profitLevel;
	
	
	public void recordRules(String ruleCode, int ruleScore, String ruleDesc){
		//System.out.println("触发的规则代码: " + ruleCode + "; 规则分值: "+ruleScore+"; 规则描述: "+ruleDesc);
		//System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	
	public void recordRules(String ruleCode, int score){
		System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public int getTotalScore() {
		return totalScore;
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

	public int getAgeScore() {
		return ageScore;
	}

	public void setAgeScore(int ageScore) {
		this.ageScore = ageScore;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public int getMarriageScore() {
		return marriageScore;
	}

	public void setMarriageScore(int marriageScore) {
		this.marriageScore = marriageScore;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSexScore() {
		return sexScore;
	}

	public void setSexScore(int sexScore) {
		this.sexScore = sexScore;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public int getContactInfoScore() {
		return contactInfoScore;
	}

	public void setContactInfoScore(int contactInfoScore) {
		this.contactInfoScore = contactInfoScore;
	}

	public String getClaimedEducation() {
		return claimedEducation;
	}

	public void setClaimedEducation(String claimedEducation) {
		this.claimedEducation = claimedEducation;
	}

	public int getClaimedEducationScore() {
		return claimedEducationScore;
	}

	public void setClaimedEducationScore(int claimedEducationScore) {
		this.claimedEducationScore = claimedEducationScore;
	}

	public String getCertifiedEducation() {
		return certifiedEducation;
	}

	public void setCertifiedEducation(String certifiedEducation) {
		this.certifiedEducation = certifiedEducation;
	}

	public int getCertifiedEducationScore() {
		return certifiedEducationScore;
	}

	public void setCertifiedEducationScore(int certifiedEducationScore) {
		this.certifiedEducationScore = certifiedEducationScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTitleScore() {
		return titleScore;
	}

	public void setTitleScore(int titleScore) {
		this.titleScore = titleScore;
	}

	public int getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(int workingExperience) {
		this.workingExperience = workingExperience;
	}

	public int getWorkingExperienceScore() {
		return workingExperienceScore;
	}

	public void setWorkingExperienceScore(int workingExperienceScore) {
		this.workingExperienceScore = workingExperienceScore;
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

	public String getShebao() {
		return shebao;
	}

	public void setShebao(String shebao) {
		this.shebao = shebao;
	}

	public int getShebaoScore() {
		return shebaoScore;
	}

	public void setShebaoScore(int shebaoScore) {
		this.shebaoScore = shebaoScore;
	}

	public String getGjj() {
		return gjj;
	}

	public void setGjj(String gjj) {
		this.gjj = gjj;
	}

	public int getGjjScore() {
		return gjjScore;
	}

	public void setGjjScore(int gjjScore) {
		this.gjjScore = gjjScore;
	}

	public String getHasHouse() {
		return hasHouse;
	}

	public void setHasHouse(String hasHouse) {
		this.hasHouse = hasHouse;
	}

	public int getHasHouseScore() {
		return hasHouseScore;
	}

	public void setHasHouseScore(int hasHouseScore) {
		this.hasHouseScore = hasHouseScore;
	}

	public String getHasCar() {
		return hasCar;
	}

	public void setHasCar(String hasCar) {
		this.hasCar = hasCar;
	}

	public int getHasCarScore() {
		return hasCarScore;
	}

	public void setHasCarScore(int hasCarScore) {
		this.hasCarScore = hasCarScore;
	}

	public String getHasCreditCard() {
		return hasCreditCard;
	}

	public void setHasCreditCard(String hasCreditCard) {
		this.hasCreditCard = hasCreditCard;
	}

	public int getHasCreditCardScore() {
		return hasCreditCardScore;
	}

	public void setHasCreditCardScore(int hasCreditCardScore) {
		this.hasCreditCardScore = hasCreditCardScore;
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

	public int getLivingLife() {
		return livingLife;
	}

	public void setLivingLife(int livingLife) {
		this.livingLife = livingLife;
	}

	public int getLivingLifeScore() {
		return livingLifeScore;
	}

	public void setLivingLifeScore(int livingLifeScore) {
		this.livingLifeScore = livingLifeScore;
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

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public int getPayRateScore() {
		return payRateScore;
	}

	public void setPayRateScore(int payRateScore) {
		this.payRateScore = payRateScore;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public int getCompanyTypeScore() {
		return companyTypeScore;
	}

	public void setCompanyTypeScore(int companyTypeScore) {
		this.companyTypeScore = companyTypeScore;
	}

	public String getProfitLevel() {
		return profitLevel;
	}

	public void setProfitLevel(String profitLevel) {
		this.profitLevel = profitLevel;
	}




}
