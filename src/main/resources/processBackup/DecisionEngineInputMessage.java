package processBackup;

public class DecisionEngineInputMessage {
	
	private double amount;
	private double currentLoanAmount;
	private int age;
	private int marriage;
	private int sex;
	private int education;
	private int hukou;
	private int companyNature;
	private int title;
	private double workExperience;
	private double salary;
	private int payroll;
	private int socialSecurity;
	private int gjj;
	private int badge;
	private int wageWater;
	private int incomeCert;
	private int hasHouse;
	private int hasCar;
	private int hasInsurance;
	private int hasNationalDebt;
	private int hasFinProd;
	private int mobileLife;
	private int residenceMonth;
	private int loanTerm;
	private double downPaymentRate;
	private String profitLevel;
	
	//各项信息的验证状态
	private int marriageIsVerified;
	private int educationIsVerified;
	private int hukouIsVerified;
	private int companyNatureIsVerified;
	private int titleIsVerified;
	private int workExperienceIsVerified;
	private int payrollIsVerified;
	private int socialSecurityIsVerified;
	private int gjjIsVerified;
	private int badgeIsVerified;
	private int wageWaterIsVerified;
	private int incomeCertIsVerified;
	private int hasHouseIsVerified;
	private int hasCarIsVerified;
	private int hasInsuranceIsVerified;
	private int hasNationalDebtIsVerified;
	private int hasFinProdIsVerified;
	private int mobileLifeIsVerified;
	private int residenceMonthIsVerified;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCurrentLoanAmount() {
		return currentLoanAmount;
	}
	public void setCurrentLoanAmount(double currentLoanAmount) {
		this.currentLoanAmount = currentLoanAmount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarriage() {
		return marriage;
	}
	public void setMarriage(int marriage) {
		this.marriage = marriage;
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
	public double getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(double workExperience) {
		this.workExperience = workExperience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	public int getBadge() {
		return badge;
	}
	public void setBadge(int badge) {
		this.badge = badge;
	}
	public int getWageWater() {
		return wageWater;
	}
	public void setWageWater(int wageWater) {
		this.wageWater = wageWater;
	}
	public int getIncomeCert() {
		return incomeCert;
	}
	public void setIncomeCert(int incomeCert) {
		this.incomeCert = incomeCert;
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
	public int getMobileLife() {
		return mobileLife;
	}
	public void setMobileLife(int mobileLife) {
		this.mobileLife = mobileLife;
	}
	public int getResidenceMonth() {
		return residenceMonth;
	}
	public void setResidenceMonth(int residenceMonth) {
		this.residenceMonth = residenceMonth;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getDownPaymentRate() {
		return downPaymentRate;
	}
	public void setDownPaymentRate(double downPaymentRate) {
		this.downPaymentRate = downPaymentRate;
	}
	public String getProfitLevel() {
		return profitLevel;
	}
	public void setProfitLevel(String profitLevel) {
		this.profitLevel = profitLevel;
	}
	public int getMarriageIsVerified() {
		return marriageIsVerified;
	}
	public void setMarriageIsVerified(int marriageIsVerified) {
		this.marriageIsVerified = marriageIsVerified;
	}
	public int getEducationIsVerified() {
		return educationIsVerified;
	}
	public void setEducationIsVerified(int educationIsVerified) {
		this.educationIsVerified = educationIsVerified;
	}
	public int getHukouIsVerified() {
		return hukouIsVerified;
	}
	public void setHukouIsVerified(int hukouIsVerified) {
		this.hukouIsVerified = hukouIsVerified;
	}
	public int getCompanyNatureIsVerified() {
		return companyNatureIsVerified;
	}
	public void setCompanyNatureIsVerified(int companyNatureIsVerified) {
		this.companyNatureIsVerified = companyNatureIsVerified;
	}
	public int getTitleIsVerified() {
		return titleIsVerified;
	}
	public void setTitleIsVerified(int titleIsVerified) {
		this.titleIsVerified = titleIsVerified;
	}
	public int getWorkExperienceIsVerified() {
		return workExperienceIsVerified;
	}
	public void setWorkExperienceIsVerified(int workExperienceIsVerified) {
		this.workExperienceIsVerified = workExperienceIsVerified;
	}

	public int getPayrollIsVerified() {
		return payrollIsVerified;
	}
	public void setPayrollIsVerified(int payrollIsVerified) {
		this.payrollIsVerified = payrollIsVerified;
	}
	public int getSocialSecurityIsVerified() {
		return socialSecurityIsVerified;
	}
	public void setSocialSecurityIsVerified(int socialSecurityIsVerified) {
		this.socialSecurityIsVerified = socialSecurityIsVerified;
	}
	public int getGjjIsVerified() {
		return gjjIsVerified;
	}
	public void setGjjIsVerified(int gjjIsVerified) {
		this.gjjIsVerified = gjjIsVerified;
	}
	public int getBadgeIsVerified() {
		return badgeIsVerified;
	}
	public void setBadgeIsVerified(int badgeIsVerified) {
		this.badgeIsVerified = badgeIsVerified;
	}
	public int getWageWaterIsVerified() {
		return wageWaterIsVerified;
	}
	public void setWageWaterIsVerified(int wageWaterIsVerified) {
		this.wageWaterIsVerified = wageWaterIsVerified;
	}
	public int getIncomeCertIsVerified() {
		return incomeCertIsVerified;
	}
	public void setIncomeCertIsVerified(int incomeCertIsVerified) {
		this.incomeCertIsVerified = incomeCertIsVerified;
	}
	public int getHasHouseIsVerified() {
		return hasHouseIsVerified;
	}
	public void setHasHouseIsVerified(int hasHouseIsVerified) {
		this.hasHouseIsVerified = hasHouseIsVerified;
	}
	public int getHasCarIsVerified() {
		return hasCarIsVerified;
	}
	public void setHasCarIsVerified(int hasCarIsVerified) {
		this.hasCarIsVerified = hasCarIsVerified;
	}
	public int getHasInsuranceIsVerified() {
		return hasInsuranceIsVerified;
	}
	public void setHasInsuranceIsVerified(int hasInsuranceIsVerified) {
		this.hasInsuranceIsVerified = hasInsuranceIsVerified;
	}
	public int getHasNationalDebtIsVerified() {
		return hasNationalDebtIsVerified;
	}
	public void setHasNationalDebtIsVerified(int hasNationalDebtIsVerified) {
		this.hasNationalDebtIsVerified = hasNationalDebtIsVerified;
	}
	public int getHasFinProdIsVerified() {
		return hasFinProdIsVerified;
	}
	public void setHasFinProdIsVerified(int hasFinProdIsVerified) {
		this.hasFinProdIsVerified = hasFinProdIsVerified;
	}
	public int getMobileLifeIsVerified() {
		return mobileLifeIsVerified;
	}
	public void setMobileLifeIsVerified(int mobileLifeIsVerified) {
		this.mobileLifeIsVerified = mobileLifeIsVerified;
	}
	public int getResidenceMonthIsVerified() {
		return residenceMonthIsVerified;
	}
	public void setResidenceMonthIsVerified(int residenceMonthIsVerified) {
		this.residenceMonthIsVerified = residenceMonthIsVerified;
	}
	


}
