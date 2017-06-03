package com.safeCar.Bean;

/**
 * 登录信息类
 * 
 * @author 83771
 *
 */
public class LoginInfo {

	/**id*/
	private int login_info_id ;
	/** 用户名 */
	private String usr_account;

	/** 密码 */
	private String usr_pwd;
	
	/**判断标记 */
	private int flag;

	public Integer getId() {
		return login_info_id;
	}

	public void setId(int login_info_id) {
		this.login_info_id = login_info_id;
	}

	public String getUsr_account() {
		return usr_account;
	}

	public void setUsr_account(String usr_account) {
		this.usr_account = usr_account;
	}

	public String getUsr_pwd() {
		return usr_pwd;
	}

	public void setUsr_pwd(String usr_pwd) {
		this.usr_pwd = usr_pwd;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public LoginInfo(String usr_account, String usr_pwd) {
		super();
		this.usr_account = usr_account;
		this.usr_pwd = usr_pwd;
	}

	public LoginInfo() {
		super();
	}

	public LoginInfo(int login_info_id, String usr_account, String usr_pwd, int flag) {
		super();
		this.login_info_id = login_info_id;
		this.usr_account = usr_account;
		this.usr_pwd = usr_pwd;
		this.flag = flag;
	}
	
	
	

}
