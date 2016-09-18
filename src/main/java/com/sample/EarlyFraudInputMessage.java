package com.sample;

public class EarlyFraudInputMessage {

	// 测试velocity规则
	private int eventPerAppMobile1;
	private int eventPerAppMobile2;

	// 测试threshold规则
	private double amount;

	// 测试黑名单/灰名单规则
	private int appID_attribute;	//身份证
	private int appMobile_attribute;
	private int appIP_attribute;
	private int appDI_attribute;

	// 测试政策规则
	private String ipCountry;
	private int age;
	
	// 测试身份证格式
	private String id;
	
	public EarlyFraudInputMessage(){
		
	}

	public EarlyFraudInputMessage(int eventPerAppMobile1, int eventPerAppMobile2, double amount, double currentLoanAmount, int appID_attribute, int appMobile_attribute, int appIP_attribute,
			int appDI_attribute, String ipCountry, int age, String id, int optTime) {
		super();
		this.eventPerAppMobile1 = eventPerAppMobile1;
		this.eventPerAppMobile2 = eventPerAppMobile2;
		this.amount = amount;
		this.appID_attribute = appID_attribute;
		this.appMobile_attribute = appMobile_attribute;
		this.appIP_attribute = appIP_attribute;
		this.appDI_attribute = appDI_attribute;
		this.ipCountry = ipCountry;
		this.age = age;
		this.id = id;
	}

	public static class Builder {
		// 测试velocity规则
		private int eventPerAppMobile1;
		private int eventPerAppMobile2;

		// 测试threshold规则
		private double amount;
		private double currentLoanAmount;

		// 测试黑名单/灰名单规则
		private int appID_attribute;
		private int appMobile_attribute;
		private int appIP_attribute;
		private int appDI_attribute;

		// 测试政策规则
		private String ipCountry;
		private int age;
		private int optTime;
		
		// 测试身份证格式
		private String id;


		public Builder setEventPerAppMobile1(int eventPerAppMobile1) {
			this.eventPerAppMobile1 = eventPerAppMobile1;
			return this;
		}

		public Builder setEventPerAppMobile2(int eventPerAppMobile2) {
			this.eventPerAppMobile2 = eventPerAppMobile2;
			return this;
		}

		public Builder setAmount(double amount) {
			this.amount = amount;
			return this;
		}

		public Builder setCurrentLoanAmount(double currentLoanAmount) {
			this.currentLoanAmount = currentLoanAmount;
			return this;
		}

		public Builder setAppID_attribute(int appID_attribute) {
			this.appID_attribute = appID_attribute;
			return this;
		}

		public Builder setAppMobile_attribute(int appMobile_attribute) {
			this.appMobile_attribute = appMobile_attribute;
			return this;
		}

		public Builder setAppIP_attribute(int appIP_attribute) {
			this.appIP_attribute = appIP_attribute;
			return this;
		}

		public Builder setAppDI_attribute(int appDI_attribute) {
			this.appDI_attribute = appDI_attribute;
			return this;
		}

		public Builder setIpCountry(String ipCountry) {
			this.ipCountry = ipCountry;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setOptTime(int optTime) {
			this.optTime = optTime;
			return this;
		}

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

		public EarlyFraudInputMessage build() {
			return new EarlyFraudInputMessage(eventPerAppMobile1, eventPerAppMobile2, amount, currentLoanAmount, appID_attribute, appMobile_attribute, appIP_attribute, appDI_attribute,
					ipCountry, age, id, optTime);
		}
	}
	
	public static Builder builder(){
		return new Builder();
	}

	public int getEventPerAppMobile1() {
		return eventPerAppMobile1;
	}

	public int getEventPerAppMobile2() {
		return eventPerAppMobile2;
	}

	public double getAmount() {
		return amount;
	}

	public int getAppID_attribute() {
		return appID_attribute;
	}

	public int getAppMobile_attribute() {
		return appMobile_attribute;
	}

	public int getAppIP_attribute() {
		return appIP_attribute;
	}

	public int getAppDI_attribute() {
		return appDI_attribute;
	}

	public String getIpCountry() {
		return ipCountry;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

}
