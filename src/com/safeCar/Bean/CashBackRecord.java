package com.safeCar.Bean;
/**
 * ������Ϣ
 * @author 83771
 *
 */

import java.util.Date;

public class CashBackRecord {

	/**id*/
	private Integer id;
	/**����ʱ��*/
	private Date  date;
	/**���ִ���*/
	private int  count;
	/**�����˻�*/
	private String username;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
