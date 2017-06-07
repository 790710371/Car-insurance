package com.safeCar.Service.impl;

import com.safeCar.Config;
import com.safeCar.Dao.impl.OperateRecordDaoImpl;
import com.safeCar.Service.IOperateService;

public class OperateServiceImpl implements IOperateService{

	@Override
	public void insertOperateRecord(Object... obj) {
		OperateRecordDaoImpl operateRecordDaoImpl = new OperateRecordDaoImpl();
		operateRecordDaoImpl.insertOperateRecord(obj);
	}
	@Override
	public  String getOperateType(String url){
		String action =null;
		switch(url){
		case Config.VALUE_ADMIN_QUERY_INSURE:
			action = "投保查询";
			break;
		case Config.VALUE_CAR_FIX:
			action = "修理车辆";
			break;
		case Config.VALUE_DEL_USR:
			action = "删除用户";
			break;
		case Config.VALUE_INSURE:
			action = "用户投保";
			break;
		case Config.VALUE_QUERY_CASH:
			action = "查询余额";
			break;
		case Config.VALUE_RECHARGR:
			action = "用户充值";
			break;
		}
		return action;
	};

}
