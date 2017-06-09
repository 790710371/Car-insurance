package com.safeCar.Service;

public interface ICashBackService {
	//查询返现日期和次数
	public Object[] getCashBackInfo();
	//查返现次数
	public int getRetCount ();
	//进行返现
	public void actCashBack();
}
