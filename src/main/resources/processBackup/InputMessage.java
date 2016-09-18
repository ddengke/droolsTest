package processBackup;

public class InputMessage {
	
	private String id_num;
	
	private String phone;
	
	private int score;
	private String result;
	
	private String ip;
	private String ipCountry;
	
	private String lastIp;
	
	private String di;
	private String lastDi;
	private int age;
	
	private String companyAddr;
	private String homeAddr;
	private String sms;
	
	//测试behavior规则
	private int isVM;
	private int isEmulator;
	private int isProxy;
	private int isVPN;
	private int isRoot;
	private int isJailbreak;
	private int isNewUser;
	private int isReturnUser;
	private String cookie;
	private int optTime;
	
	//测试velocity规则
	private int sameAppPhoneEvents;
	private int sameAppIDEvents;
	private int sameCoAppPhoneEvents;
	private int sameAppEmailEvents;
	private int sameAppAccountEvents;
	private int sameAppIPEvents;
	private int sameAppDIEvents;
	private int sameAppDIIPs1;
	private int sameAppDIIPs2;
	private int sameAppDIIPs3;
	private int sameAppDIIDs;
	private int multAccountperDI;
	private int multEmailperID1;
	private int multEmailperID2;
	private int multEmailperID3;
	private int multEmailperID4;
	private int multAddperDI;
	private int multIDperAccount1;
	private int multIDperAccount2;
	private int multIDperAccount3;
	private int multIDperAccount4;
	
	//Duncan新增velocity字段名称
	private int eventPerAppMobile1;
	private int eventPerAppMobile2;
	private int eventPerAppMobile3;
	private int eventPerAppMobile4;
	private int eventPerAppMobile5;
	private int eventPerAppMobile6;
	
	private int eventPerCoAppMobile1;
	private int eventPerCoAppMobile2;
	private int eventPerCoAppMobile3;
	private int eventPerCoAppMobile4;
	private int eventPerCoAppMobile5;
	private int eventPerCoAppMobile6;
	
	private int eventPerAppID1;
	private int eventPerAppID2;
	private int eventPerAppID3;
	private int eventPerAppID4;
	private int eventPerAppID5;
	private int eventPerAppID6;
	
	private int eventPerCompanyPhone1;
	private int eventPerCompanyPhone2;
	private int eventPerCompanyPhone3;
	private int eventPerCompanyPhone4;
	private int eventPerCompanyPhone5;
	private int eventPerCompanyPhone6;
	
	private int eventPerDI1;
	private int eventPerDI2;
	private int eventPerDI3;
	private int eventPerDI4;
	private int eventPerDI5;
	
	private int mobilePerDI1;
	private int mobilePerDI2;
	private int mobilePerDI3;
	private int mobilePerDI4;
	private int mobilePerDI5;
	
	private int IDPerDI1;
	private int IDPerDI2;
	private int IDPerDI3;
	private int IDPerDI4;
	private int IDPerDI5;
	
	private int IDPerCoAppMobile1;
	private int IDPerCoAppMobile2;
	private int IDPerCoAppMobile3;
	private int IDPerCoAppMobile4;
	private int IDPerCoAppMobile5;
	private int IDPerCoAppMobile6;
	
	//测试mismatch规则
	private String appPhone;
	private String appName;
	private String appMobileCity;
	private String appHomePhoneCity;
	private String appHomeAddr;
	private String appHomeCity;
	private String trueIPCity;
	private String recName;
	private String recPhone;
	private String recAddr;
	private int vAmount;
	private String merchantCity;
	private String coAppMobileCity;
	private double inputSalary;
	private double verifiedSalary;
	private int inputEducation;
	private int verifiedEducation;
	
	//测试threshold规则
	private double amount;
	private double totalAmount;
	private int otpAATimes;
	
	//测试黑名单规则
	private int appID_attribute;
	private int appPhone_attribute;
	private int coAppPhone_attribute;
	private int appEmail_attribute;
	private int appIP_attribute;
	private int appDI_attribute;
	private int appIPScope;
	private int shippingAddress_attribute;
	private int sPhone_attribute;
	
	//测试atoBehavior规则
	private int failedLogin;
	private String unfamiliarDI;
	private String unfamiliarIP;
	private String nameModified;
	private String phoneModified;
	private String addrModified;
	private String passwdModified;
	private String newIDAdded;
	private String accountType;
	
	public int getFailedLogin() {
		return failedLogin;
	}

	public void setFailedLogin(int failedLogin) {
		this.failedLogin = failedLogin;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public double getInputSalary() {
		return inputSalary;
	}

	public void setInputSalary(double inputSalary) {
		this.inputSalary = inputSalary;
	}

	public double getVerifiedSalary() {
		return verifiedSalary;
	}

	public void setVerifiedSalary(double verifiedSalary) {
		this.verifiedSalary = verifiedSalary;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getCoAppMobileCity() {
		return coAppMobileCity;
	}

	public int getInputEducation() {
		return inputEducation;
	}

	public void setInputEducation(int inputEducation) {
		this.inputEducation = inputEducation;
	}

	public int getVerifiedEducation() {
		return verifiedEducation;
	}

	public void setVerifiedEducation(int verifiedEducation) {
		this.verifiedEducation = verifiedEducation;
	}

	public void setCoAppMobileCity(String coAppMobileCity) {
		this.coAppMobileCity = coAppMobileCity;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getMultAccountperDI() {
		return multAccountperDI;
	}

	public void setMultAccountperDI(int multAccountperDI) {
		this.multAccountperDI = multAccountperDI;
	}

	public String getIpCountry() {
		return ipCountry;
	}

	public void setIpCountry(String ipCountry) {
		this.ipCountry = ipCountry;
	}

	public int getMultEmailperID1() {
		return multEmailperID1;
	}

	public void setMultEmailperID1(int multEmailperID1) {
		this.multEmailperID1 = multEmailperID1;
	}

	public int getMultEmailperID2() {
		return multEmailperID2;
	}

	public int getOtpAATimes() {
		return otpAATimes;
	}

	public void setOtpAATimes(int otpAATimes) {
		this.otpAATimes = otpAATimes;
	}

	public void setMultEmailperID2(int multEmailperID2) {
		this.multEmailperID2 = multEmailperID2;
	}

	public int getMultEmailperID3() {
		return multEmailperID3;
	}

	public void setMultEmailperID3(int multEmailperID3) {
		this.multEmailperID3 = multEmailperID3;
	}

	public int getMultEmailperID4() {
		return multEmailperID4;
	}

	public void setMultEmailperID4(int multEmailperID4) {
		this.multEmailperID4 = multEmailperID4;
	}

	public int getMultAddperDI() {
		return multAddperDI;
	}

	public void setMultAddperDI(int multAddperDI) {
		this.multAddperDI = multAddperDI;
	}

	public int getMultIDperAccount1() {
		return multIDperAccount1;
	}

	public void setMultIDperAccount1(int multIDperAccount1) {
		this.multIDperAccount1 = multIDperAccount1;
	}

	public int getMultIDperAccount2() {
		return multIDperAccount2;
	}

	public void setMultIDperAccount2(int multIDperAccount2) {
		this.multIDperAccount2 = multIDperAccount2;
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

	public int getEventPerAppMobile3() {
		return eventPerAppMobile3;
	}

	public void setEventPerAppMobile3(int eventPerAppMobile3) {
		this.eventPerAppMobile3 = eventPerAppMobile3;
	}

	public int getEventPerAppMobile4() {
		return eventPerAppMobile4;
	}

	public void setEventPerAppMobile4(int eventPerAppMobile4) {
		this.eventPerAppMobile4 = eventPerAppMobile4;
	}

	public int getEventPerAppMobile5() {
		return eventPerAppMobile5;
	}

	public void setEventPerAppMobile5(int eventPerAppMobile5) {
		this.eventPerAppMobile5 = eventPerAppMobile5;
	}

	public int getEventPerAppMobile6() {
		return eventPerAppMobile6;
	}

	public void setEventPerAppMobile6(int eventPerAppMobile6) {
		this.eventPerAppMobile6 = eventPerAppMobile6;
	}

	public int getEventPerCoAppMobile1() {
		return eventPerCoAppMobile1;
	}

	public void setEventPerCoAppMobile1(int eventPerCoAppMobile1) {
		this.eventPerCoAppMobile1 = eventPerCoAppMobile1;
	}

	public int getEventPerCoAppMobile2() {
		return eventPerCoAppMobile2;
	}

	public void setEventPerCoAppMobile2(int eventPerCoAppMobile2) {
		this.eventPerCoAppMobile2 = eventPerCoAppMobile2;
	}

	public int getEventPerCoAppMobile3() {
		return eventPerCoAppMobile3;
	}

	public void setEventPerCoAppMobile3(int eventPerCoAppMobile3) {
		this.eventPerCoAppMobile3 = eventPerCoAppMobile3;
	}

	public int getEventPerCoAppMobile4() {
		return eventPerCoAppMobile4;
	}

	public void setEventPerCoAppMobile4(int eventPerCoAppMobile4) {
		this.eventPerCoAppMobile4 = eventPerCoAppMobile4;
	}

	public int getEventPerCoAppMobile5() {
		return eventPerCoAppMobile5;
	}

	public void setEventPerCoAppMobile5(int eventPerCoAppMobile5) {
		this.eventPerCoAppMobile5 = eventPerCoAppMobile5;
	}

	public int getEventPerCoAppMobile6() {
		return eventPerCoAppMobile6;
	}

	public void setEventPerCoAppMobile6(int eventPerCoAppMobile6) {
		this.eventPerCoAppMobile6 = eventPerCoAppMobile6;
	}

	public int getEventPerAppID1() {
		return eventPerAppID1;
	}

	public void setEventPerAppID1(int eventPerAppID1) {
		this.eventPerAppID1 = eventPerAppID1;
	}

	public int getEventPerAppID2() {
		return eventPerAppID2;
	}

	public void setEventPerAppID2(int eventPerAppID2) {
		this.eventPerAppID2 = eventPerAppID2;
	}

	public int getEventPerAppID3() {
		return eventPerAppID3;
	}

	public void setEventPerAppID3(int eventPerAppID3) {
		this.eventPerAppID3 = eventPerAppID3;
	}

	public int getEventPerAppID4() {
		return eventPerAppID4;
	}

	public void setEventPerAppID4(int eventPerAppID4) {
		this.eventPerAppID4 = eventPerAppID4;
	}

	public int getEventPerAppID5() {
		return eventPerAppID5;
	}

	public void setEventPerAppID5(int eventPerAppID5) {
		this.eventPerAppID5 = eventPerAppID5;
	}

	public int getEventPerAppID6() {
		return eventPerAppID6;
	}

	public void setEventPerAppID6(int eventPerAppID6) {
		this.eventPerAppID6 = eventPerAppID6;
	}

	public int getEventPerCompanyPhone1() {
		return eventPerCompanyPhone1;
	}

	public void setEventPerCompanyPhone1(int eventPerCompanyPhone1) {
		this.eventPerCompanyPhone1 = eventPerCompanyPhone1;
	}

	public int getEventPerCompanyPhone2() {
		return eventPerCompanyPhone2;
	}

	public void setEventPerCompanyPhone2(int eventPerCompanyPhone2) {
		this.eventPerCompanyPhone2 = eventPerCompanyPhone2;
	}

	public int getEventPerCompanyPhone3() {
		return eventPerCompanyPhone3;
	}

	public void setEventPerCompanyPhone3(int eventPerCompanyPhone3) {
		this.eventPerCompanyPhone3 = eventPerCompanyPhone3;
	}

	public int getEventPerCompanyPhone4() {
		return eventPerCompanyPhone4;
	}

	public void setEventPerCompanyPhone4(int eventPerCompanyPhone4) {
		this.eventPerCompanyPhone4 = eventPerCompanyPhone4;
	}

	public int getEventPerCompanyPhone5() {
		return eventPerCompanyPhone5;
	}

	public void setEventPerCompanyPhone5(int eventPerCompanyPhone5) {
		this.eventPerCompanyPhone5 = eventPerCompanyPhone5;
	}

	public int getEventPerCompanyPhone6() {
		return eventPerCompanyPhone6;
	}

	public void setEventPerCompanyPhone6(int eventPerCompanyPhone6) {
		this.eventPerCompanyPhone6 = eventPerCompanyPhone6;
	}

	public int getEventPerDI1() {
		return eventPerDI1;
	}

	public void setEventPerDI1(int eventPerDI1) {
		this.eventPerDI1 = eventPerDI1;
	}

	public int getEventPerDI2() {
		return eventPerDI2;
	}

	public void setEventPerDI2(int eventPerDI2) {
		this.eventPerDI2 = eventPerDI2;
	}

	public int getEventPerDI3() {
		return eventPerDI3;
	}

	public void setEventPerDI3(int eventPerDI3) {
		this.eventPerDI3 = eventPerDI3;
	}

	public int getEventPerDI4() {
		return eventPerDI4;
	}

	public void setEventPerDI4(int eventPerDI4) {
		this.eventPerDI4 = eventPerDI4;
	}

	public int getEventPerDI5() {
		return eventPerDI5;
	}

	public void setEventPerDI5(int eventPerDI5) {
		this.eventPerDI5 = eventPerDI5;
	}

	public int getMobilePerDI1() {
		return mobilePerDI1;
	}

	public void setMobilePerDI1(int mobilePerDI1) {
		this.mobilePerDI1 = mobilePerDI1;
	}

	public int getMobilePerDI2() {
		return mobilePerDI2;
	}

	public void setMobilePerDI2(int mobilePerDI2) {
		this.mobilePerDI2 = mobilePerDI2;
	}

	public int getMobilePerDI3() {
		return mobilePerDI3;
	}

	public void setMobilePerDI3(int mobilePerDI3) {
		this.mobilePerDI3 = mobilePerDI3;
	}

	public int getMobilePerDI4() {
		return mobilePerDI4;
	}

	public void setMobilePerDI4(int mobilePerDI4) {
		this.mobilePerDI4 = mobilePerDI4;
	}

	public int getMobilePerDI5() {
		return mobilePerDI5;
	}

	public void setMobilePerDI5(int mobilePerDI5) {
		this.mobilePerDI5 = mobilePerDI5;
	}

	public int getIDPerDI1() {
		return IDPerDI1;
	}

	public void setIDPerDI1(int iDPerDI1) {
		IDPerDI1 = iDPerDI1;
	}

	public int getIDPerDI2() {
		return IDPerDI2;
	}

	public void setIDPerDI2(int iDPerDI2) {
		IDPerDI2 = iDPerDI2;
	}

	public int getIDPerDI3() {
		return IDPerDI3;
	}

	public void setIDPerDI3(int iDPerDI3) {
		IDPerDI3 = iDPerDI3;
	}

	public int getIDPerDI4() {
		return IDPerDI4;
	}

	public void setIDPerDI4(int iDPerDI4) {
		IDPerDI4 = iDPerDI4;
	}

	public int getIDPerDI5() {
		return IDPerDI5;
	}

	public void setIDPerDI5(int iDPerDI5) {
		IDPerDI5 = iDPerDI5;
	}

	public int getIDPerCoAppMobile1() {
		return IDPerCoAppMobile1;
	}

	public void setIDPerCoAppMobile1(int iDPerCoAppMobile1) {
		IDPerCoAppMobile1 = iDPerCoAppMobile1;
	}

	public int getIDPerCoAppMobile2() {
		return IDPerCoAppMobile2;
	}

	public void setIDPerCoAppMobile2(int iDPerCoAppMobile2) {
		IDPerCoAppMobile2 = iDPerCoAppMobile2;
	}

	public int getIDPerCoAppMobile3() {
		return IDPerCoAppMobile3;
	}

	public void setIDPerCoAppMobile3(int iDPerCoAppMobile3) {
		IDPerCoAppMobile3 = iDPerCoAppMobile3;
	}

	public int getIDPerCoAppMobile4() {
		return IDPerCoAppMobile4;
	}

	public void setIDPerCoAppMobile4(int iDPerCoAppMobile4) {
		IDPerCoAppMobile4 = iDPerCoAppMobile4;
	}

	public int getIDPerCoAppMobile5() {
		return IDPerCoAppMobile5;
	}

	public void setIDPerCoAppMobile5(int iDPerCoAppMobile5) {
		IDPerCoAppMobile5 = iDPerCoAppMobile5;
	}

	public int getIDPerCoAppMobile6() {
		return IDPerCoAppMobile6;
	}

	public void setIDPerCoAppMobile6(int iDPerCoAppMobile6) {
		IDPerCoAppMobile6 = iDPerCoAppMobile6;
	}

	public int getMultIDperAccount3() {
		return multIDperAccount3;
	}

	public void setMultIDperAccount3(int multIDperAccount3) {
		this.multIDperAccount3 = multIDperAccount3;
	}

	public int getMultIDperAccount4() {
		return multIDperAccount4;
	}

	public void setMultIDperAccount4(int multIDperAccount4) {
		this.multIDperAccount4 = multIDperAccount4;
	}

	public String getUnfamiliarDI() {
		return unfamiliarDI;
	}

	public void setUnfamiliarDI(String unfamiliarDI) {
		this.unfamiliarDI = unfamiliarDI;
	}

	public String getUnfamiliarIP() {
		return unfamiliarIP;
	}

	public void setUnfamiliarIP(String unfamiliarIP) {
		this.unfamiliarIP = unfamiliarIP;
	}

	public String getNameModified() {
		return nameModified;
	}

	public void setNameModified(String nameModified) {
		this.nameModified = nameModified;
	}

	public String getPhoneModified() {
		return phoneModified;
	}

	public void setPhoneModified(String phoneModified) {
		this.phoneModified = phoneModified;
	}

	public String getAddrModified() {
		return addrModified;
	}

	public void setAddrModified(String addrModified) {
		this.addrModified = addrModified;
	}

	public String getPasswdModified() {
		return passwdModified;
	}

	public void setPasswdModified(String passwdModified) {
		this.passwdModified = passwdModified;
	}

	public String getNewIDAdded() {
		return newIDAdded;
	}

	public void setNewIDAdded(String newIDAdded) {
		this.newIDAdded = newIDAdded;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getvAmount() {
		return vAmount;
	}

	public void setvAmount(int vAmount) {
		this.vAmount = vAmount;
	}

	public void recordRules(String ruleCode, int ruleScore, String ruleDesc){
		System.out.println("触发的规则代码: " + ruleCode + "; 规则分值: "+ruleScore+"; 规则描述: "+ruleDesc);
		//System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	
	public void recordRules(String ruleCode, int ruleScore){
		//System.out.println("触发的规则代码: " + ruleCode + "; 规则分值: "+ruleScore+"; ");
		//System.out.println("Fired rule \""+ruleCode+"\", score: "+score);
	}
	
	public void addScore(int score){
		this.score = this.score + score;
		//System.out.println(this.score+"===input");
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getId_num() {
		return id_num;
	}

	public void setId_num(String id_num) {
		this.id_num = id_num;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public String getDi() {
		return di;
	}

	public void setDi(String di) {
		this.di = di;
	}

	public String getLastDi() {
		return lastDi;
	}

	public void setLastDi(String lastDi) {
		this.lastDi = lastDi;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

	public String getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public int getOptTime() {
		return optTime;
	}

	public void setOptTime(int optTime) {
		this.optTime = optTime;
	}

	public int getSameAppPhoneEvents() {
		return sameAppPhoneEvents;
	}

	public void setSameAppPhoneEvents(int sameAppPhoneEvents) {
		this.sameAppPhoneEvents = sameAppPhoneEvents;
	}

	public int getSameAppIDEvents() {
		return sameAppIDEvents;
	}

	public void setSameAppIDEvents(int sameAppIDEvents) {
		this.sameAppIDEvents = sameAppIDEvents;
	}

	public int getSameCoAppPhoneEvents() {
		return sameCoAppPhoneEvents;
	}

	public void setSameCoAppPhoneEvents(int sameCoAppPhoneEvents) {
		this.sameCoAppPhoneEvents = sameCoAppPhoneEvents;
	}

	public int getSameAppEmailEvents() {
		return sameAppEmailEvents;
	}

	public void setSameAppEmailEvents(int sameAppEmailEvents) {
		this.sameAppEmailEvents = sameAppEmailEvents;
	}

	public int getSameAppAccountEvents() {
		return sameAppAccountEvents;
	}

	public void setSameAppAccountEvents(int sameAppAccountEvents) {
		this.sameAppAccountEvents = sameAppAccountEvents;
	}

	public int getSameAppIPEvents() {
		return sameAppIPEvents;
	}

	public void setSameAppIPEvents(int sameAppIPEvents) {
		this.sameAppIPEvents = sameAppIPEvents;
	}

	public int getSameAppDIEvents() {
		return sameAppDIEvents;
	}

	public void setSameAppDIEvents(int sameAppDIEvents) {
		this.sameAppDIEvents = sameAppDIEvents;
	}



	public int getSameAppDIIPs1() {
		return sameAppDIIPs1;
	}

	public void setSameAppDIIPs1(int sameAppDIIPs1) {
		this.sameAppDIIPs1 = sameAppDIIPs1;
	}

	public int getSameAppDIIPs2() {
		return sameAppDIIPs2;
	}

	public void setSameAppDIIPs2(int sameAppDIIPs2) {
		this.sameAppDIIPs2 = sameAppDIIPs2;
	}

	public int getSameAppDIIPs3() {
		return sameAppDIIPs3;
	}

	public void setSameAppDIIPs3(int sameAppDIIPs3) {
		this.sameAppDIIPs3 = sameAppDIIPs3;
	}

	public int getSameAppDIIDs() {
		return sameAppDIIDs;
	}

	public void setSameAppDIIDs(int sameAppDIIDs) {
		this.sameAppDIIDs = sameAppDIIDs;
	}

	public String getAppPhone() {
		return appPhone;
	}

	public void setAppPhone(String appPhone) {
		this.appPhone = appPhone;
	}

	public String getRecPhone() {
		return recPhone;
	}

	public void setRecPhone(String recPhone) {
		this.recPhone = recPhone;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double d) {
		this.amount = d;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppMobileCity() {
		return appMobileCity;
	}

	public void setAppMobileCity(String appMobileCity) {
		this.appMobileCity = appMobileCity;
	}

	public String getAppHomePhoneCity() {
		return appHomePhoneCity;
	}

	public void setAppHomePhoneCity(String appHomePhoneCity) {
		this.appHomePhoneCity = appHomePhoneCity;
	}

	public String getAppHomeAddr() {
		return appHomeAddr;
	}

	public void setAppHomeAddr(String appHomeAddr) {
		this.appHomeAddr = appHomeAddr;
	}

	public String getAppHomeCity() {
		return appHomeCity;
	}

	public void setAppHomeCity(String appHomeCity) {
		this.appHomeCity = appHomeCity;
	}

	public String getTrueIPCity() {
		return trueIPCity;
	}

	public void setTrueIPCity(String trueIPCity) {
		this.trueIPCity = trueIPCity;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getRecAddr() {
		return recAddr;
	}

	public void setRecAddr(String recAddr) {
		this.recAddr = recAddr;
	}

	public int getIsVM() {
		return isVM;
	}

	public void setIsVM(int isVM) {
		this.isVM = isVM;
	}

	public int getIsEmulator() {
		return isEmulator;
	}

	public void setIsEmulator(int isEmulator) {
		this.isEmulator = isEmulator;
	}

	public int getIsProxy() {
		return isProxy;
	}

	public void setIsProxy(int isProxy) {
		this.isProxy = isProxy;
	}

	public int getIsVPN() {
		return isVPN;
	}

	public void setIsVPN(int isVPN) {
		this.isVPN = isVPN;
	}

	public int getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public int getIsJailbreak() {
		return isJailbreak;
	}

	public void setIsJailbreak(int isJailbreak) {
		this.isJailbreak = isJailbreak;
	}

	public int getIsNewUser() {
		return isNewUser;
	}

	public void setIsNewUser(int isNewUser) {
		this.isNewUser = isNewUser;
	}

	public int getIsReturnUser() {
		return isReturnUser;
	}

	public void setIsReturnUser(int isReturnUser) {
		this.isReturnUser = isReturnUser;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public int getAppID_attribute() {
		return appID_attribute;
	}

	public void setAppID_attribute(int appID_attribute) {
		this.appID_attribute = appID_attribute;
	}

	public int getAppPhone_attribute() {
		return appPhone_attribute;
	}

	public void setAppPhone_attribute(int appPhone_attribute) {
		this.appPhone_attribute = appPhone_attribute;
	}

	public int getCoAppPhone_attribute() {
		return coAppPhone_attribute;
	}

	public void setCoAppPhone_attribute(int coAppPhone_attribute) {
		this.coAppPhone_attribute = coAppPhone_attribute;
	}

	public int getAppEmail_attribute() {
		return appEmail_attribute;
	}

	public void setAppEmail_attribute(int appEmail_attribute) {
		this.appEmail_attribute = appEmail_attribute;
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

	public int getAppIPScope() {
		return appIPScope;
	}

	public void setAppIPScope(int appIPScope) {
		this.appIPScope = appIPScope;
	}

	public int getShippingAddress_attribute() {
		return shippingAddress_attribute;
	}

	public void setShippingAddress_attribute(int shippingAddress_attribute) {
		this.shippingAddress_attribute = shippingAddress_attribute;
	}

	public int getsPhone_attribute() {
		return sPhone_attribute;
	}

	public void setsPhone_attribute(int sPhone_attribute) {
		this.sPhone_attribute = sPhone_attribute;
	}


}
