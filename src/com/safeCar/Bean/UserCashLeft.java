package com.safeCar.Bean;
/**
 * 用户余额信息
 * @author 83771
 *
 */
public class UserCashLeft {

	/**id*/
	private int id_cash_left ;
	/**剩余金额*/
	private  int  usr_cash;
	
	public Integer getId() {
		return id_cash_left;
	}
	public void setId(Integer id_cash_left) {
		this.id_cash_left = id_cash_left;
	}
	public double getMoney() {
		return usr_cash;
	}
	public void setMoney(int usr_cash) {
		this.usr_cash = usr_cash;
	}
	
	
}
