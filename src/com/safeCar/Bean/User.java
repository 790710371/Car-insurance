package com.safeCar.Bean;

/**
 * 用户类
 * 
 * @author 83771
 *
 */
public class User {
	/** id*/
	private Integer id;
	/** 姓名*/
	private String usr_name;
	/** 邮箱号*/
	private String usr_email;
	/** 手机号 */
	private String usr_phone;
	/**身份证号码 */
	private String usr_IDcard;
	/** 车牌号 */
	private String usr_carID;
	/**登录信息*/
	private LoginInfo usr_loginInfo;
	/**余额信息*/
	private UserCashLeft usr_balance;
	/**投保记录*/
	private InsureRecord insureRecord;
	public InsureRecord getInsureRecord() {
		return insureRecord;
	}

	public void setInsureRecord(InsureRecord insureRecord) {
		this.insureRecord = insureRecord;
	}

	public CarFixRecord getCarFixRecord() {
		return carFixRecord;
	}

	public void setCarFixRecord(CarFixRecord carFixRecord) {
		this.carFixRecord = carFixRecord;
	}

	/**修车记录*/
	private CarFixRecord carFixRecord;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsr_name() {
		return usr_name;
	}
	
	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}
	
	public String getUsr_email() {
		return usr_email;
	}
	
	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}
	
	public String getUsr_phone() {
		return usr_phone;
	}
	
	public void setUsr_phone(String usr_phone) {
		this.usr_phone = usr_phone;
	}
	
	public String getUsr_IDcard() {
		return usr_IDcard;
	}
	
	public void setUsr_IDcard(String usr_IDcard) {
		this.usr_IDcard = usr_IDcard;
	}
	
	public String getUsr_carID() {
		return usr_carID;
	}
	
	public void setUsr_carID(String usr_carID) {
		this.usr_carID = usr_carID;
	}
	
	public LoginInfo getUsr_loginInfo() {
		return usr_loginInfo;
	}
	
	public void setUsr_loginInfo(LoginInfo usr_loginInfo) {
		this.usr_loginInfo = usr_loginInfo;
	}

	public UserCashLeft getUsr_balance() {
		return usr_balance;
	}

	public void setUsr_balance(UserCashLeft usr_balance) {
		this.usr_balance = usr_balance;
	}

	public User(String usr_name, String usr_email, String usr_phone, String usr_IDcard, String usr_carID) {
		super();
		this.usr_name = usr_name;
		this.usr_email = usr_email;
		this.usr_phone = usr_phone;
		this.usr_IDcard = usr_IDcard;
		this.usr_carID = usr_carID;
	}

	public User() {
		super();
	}

	public User(Integer id, String usr_name, String usr_email, String usr_phone, String usr_IDcard, String usr_carID,
			LoginInfo usr_loginInfo, UserCashLeft usr_balance) {
		super();
		this.id = id;
		this.usr_name = usr_name;
		this.usr_email = usr_email;
		this.usr_phone = usr_phone;
		this.usr_IDcard = usr_IDcard;
		this.usr_carID = usr_carID;
		this.usr_loginInfo = usr_loginInfo;
		this.usr_balance = usr_balance;
	}
	public User( String usr_name, String usr_email, String usr_phone, String usr_IDcard, String usr_carID,
			LoginInfo usr_loginInfo, UserCashLeft usr_balance) {
		super();
		this.usr_name = usr_name;
		this.usr_email = usr_email;
		this.usr_phone = usr_phone;
		this.usr_IDcard = usr_IDcard;
		this.usr_carID = usr_carID;
		this.usr_loginInfo = usr_loginInfo;
		this.usr_balance = usr_balance;
	}
	
	
	
	
	
	
}
