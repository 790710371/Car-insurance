package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.OperateRecord;

public interface IOperateRecordDao {
	public boolean insertOperateRecord(String usr_account,String operateTypeUrl);
	public List<OperateRecord> queryOperateRecord(String startDate,String endDate);
	public String getOperateType(String url);
}
