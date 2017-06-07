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
			action = "Ͷ����ѯ";
			break;
		case Config.VALUE_CAR_FIX:
			action = "������";
			break;
		case Config.VALUE_DEL_USR:
			action = "ɾ���û�";
			break;
		case Config.VALUE_INSURE:
			action = "�û�Ͷ��";
			break;
		case Config.VALUE_QUERY_CASH:
			action = "��ѯ���";
			break;
		case Config.VALUE_RECHARGR:
			action = "�û���ֵ";
			break;
		}
		return action;
	};

}
