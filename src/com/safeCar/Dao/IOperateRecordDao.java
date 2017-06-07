package com.safeCar.Dao;

public interface IOperateRecordDao {
	public boolean insertOperateRecord(Object... obj);
	public boolean queryOperateRecord(String usr_account);
}
