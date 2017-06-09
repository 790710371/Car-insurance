package com.safeCar.Bean;
/*
 * 操作记录实体类
 */
public class OperateRecord {
	private int operate_id;
	private int user_id;
	private String operation_account;
	private String identity_flag;
	public int getOperate_id() {
		return operate_id;
	}
	public void setOperate_id(int operate_id) {
		this.operate_id = operate_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getOperation_account() {
		return operation_account;
	}
	public void setOperation_account(String operation_account) {
		this.operation_account = operation_account;
	}
	public String getIdentity_flag() {
		return identity_flag;
	}
	public void setIdentity_flag(String identity_flag) {
		this.identity_flag = identity_flag;
	}
	public String getOperate_type() {
		return operate_type;
	}
	public void setOperate_type(String operate_type) {
		this.operate_type = operate_type;
	}
	public String getOperate_date() {
		return operate_date;
	}
	public void setOperate_date(String operate_date) {
		this.operate_date = operate_date;
	}
	private String operate_type;
	private String operate_date;
}
