package com.safeCar.Bean;

public class LRInfo {


	/**id*/
	private Integer id;
	/** 用户名 */
	private String usr_account;

	/** 密码 */
	private String usr_pwd;
	
	/**判断标记 */
	private boolean flag;

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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public LRInfo(String usr_account, String usr_pwd) {
		super();
		this.usr_account = usr_account;
		this.usr_pwd = usr_pwd;
	}

	public LRInfo() {
		super();
	}

	public LRInfo(Integer id, String usr_account, String usr_pwd, boolean flag) {
		super();
		this.id = id;
		this.usr_account = usr_account;
		this.usr_pwd = usr_pwd;
		this.flag = flag;
	}
	
	
	


}
