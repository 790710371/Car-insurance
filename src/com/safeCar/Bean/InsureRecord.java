package com.safeCar.Bean;
/**
 * 返现信息
 * @author 83771
 *
 */

import java.util.Date;

import javax.xml.crypto.Data;

public class InsureRecord {

	/**id*/
	private int id_insure ;
	public int getId_insure() {
		return id_insure;
	}
	public void setId_insure(int id_insure) {
		this.id_insure = id_insure;
	}
	public Data getData_insure() {
		return data_insure;
	}
	public void setData_insure(Data data_insure) {
		this.data_insure = data_insure;
	}
	public int getRet_count() {
		return ret_count;
	}
	public void setRet_count(int ret_count) {
		this.ret_count = ret_count;
	}
	/**返现时间*/
	private Data  data_insure;
	/**返现次数*/
	private int  ret_count;

}
