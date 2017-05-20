package com.safeCar.Bean;

/**
 * 登录信息类
 * 
 * @author 83771
 *
 */
public class LoginInfo {

	/**id*/
	private Integer id;
	/** 用户名 */
	private String usr_account;

	/** 密码 */
	private String usr_pwd;
	
	/**判断标记 */
	private int flag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LoginInfo(Integer id, String usr_account, String usr_pwd, int flag) {
		super();
		this.id = id;
		this.usr_account = usr_account;
		this.usr_pwd = usr_pwd;
		this.flag = flag;
	}
	
	
	

}
