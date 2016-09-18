package processBackup;

public class EarlyFraudInputMessage {
	
	//测试velocity规则
	private int eventPerAppMobile1;
	private int eventPerAppMobile2;
	
	//测试threshold规则
	private double amount;
	private double currentLoanAmount;
	
	//测试黑名单/灰名单规则
	private int appID_attribute;
	private int appMobile_attribute;
	private int appIP_attribute;
	private int appDI_attribute;

	//测试政策规则
	private String ipCountry;
	private int age;
	private int optTime;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEventPerAppMobile1() {
		return eventPerAppMobile1;
	}

	public void setEventPerAppMobile1(int eventPerAppMobile1) {
		this.eventPerAppMobile1 = eventPerAppMobile1;
	}

	public int getEventPerAppMobile2() {
		return eventPerAppMobile2;
	}

	public void setEventPerAppMobile2(int eventPerAppMobile2) {
		this.eventPerAppMobile2 = eventPerAppMobile2;
	}

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

	public int getAppID_attribute() {
		return appID_attribute;
	}

	public void setAppID_attribute(int appID_attribute) {
		this.appID_attribute = appID_attribute;
	}

	public int getAppMobile_attribute() {
		return appMobile_attribute;
	}

	public void setAppMobile_attribute(int appMobile_attribute) {
		this.appMobile_attribute = appMobile_attribute;
	}

	public int getAppIP_attribute() {
		return appIP_attribute;
	}

	public void setAppIP_attribute(int appIP_attribute) {
		this.appIP_attribute = appIP_attribute;
	}

	public int getAppDI_attribute() {
		return appDI_attribute;
	}

	public void setAppDI_attribute(int appDI_attribute) {
		this.appDI_attribute = appDI_attribute;
	}

	public String getIpCountry() {
		return ipCountry;
	}

	public void setIpCountry(String ipCountry) {
		this.ipCountry = ipCountry;
	}

	public int getOptTime() {
		return optTime;
	}

	public void setOptTime(int optTime) {
		this.optTime = optTime;
	}
}
