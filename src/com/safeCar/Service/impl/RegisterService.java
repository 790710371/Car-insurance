package com.safeCar.Service.impl;

import com.safeCar.Bean.User;
import com.safeCar.Dao.impl.RegisterDao;
import com.safeCar.Service.IUserService;

public class RegisterService implements IUserService{
	User user;
	public RegisterService(User user){
		this.user = user;
	}
	public void register( ISuccessCallback successCallback,IFailCallback failCallback){
		RegisterDao userDao = new RegisterDao(user);
		boolean registeredFlag = userDao.query(user);
		if(!registeredFlag){
			//��ʼע�ᣬ����ע�����ṩ�ص��ӿ�
			boolean resultedFlag = userDao.insert(user);
			if(resultedFlag){
				successCallback.onSuccess();
			}else{
				failCallback.onFail();
			}
		}
	}
	public static interface ISuccessCallback{
		void onSuccess();
	}
	public static interface IFailCallback{
		void onFail();
	}
}
