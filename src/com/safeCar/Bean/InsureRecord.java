package com.safeCar.Bean;
/**
 * ·µÏÖĞÅÏ¢
 * @author 83771
 *
 */

import java.util.Date;

import javax.xml.crypto.Data;

public class InsureRecord {
	private int id_insure ;
	private String insure_account;
	private Date  data_insure;
	private int  ret_count;
	public String getInsure_account() {
		return insure_account;
	}
	public void setInsure_account(String insure_account) {
		this.insure_account = insure_account;
	}
	public int getId_insure() {
		return id_insure;
	}
	public void setId_insure(int id_insure) {
		this.id_insure = id_insure;
	}
	public Date getData_insure() {
		return data_insure;
	}
	public void setDate_insure(Date data_insure) {
		this.data_insure = data_insure;
	}
	public int getRet_count() {
		return ret_count;
	}
	public void setRet_count(int ret_count) {
		this.ret_count = ret_count;
	}

}
