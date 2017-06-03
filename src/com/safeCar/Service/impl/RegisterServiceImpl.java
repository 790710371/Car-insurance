package com.safeCar.Service.impl;

import com.safeCar.Bean.User;
import com.safeCar.Dao.impl.RegisterDaoImpl;
import com.safeCar.Service.IUserService;

public class RegisterServiceImpl implements IUserService{
	User user;
	public RegisterServiceImpl(User user){
		this.user = user;
	}
	public void register( ISuccessCallback successCallback,IFailCallback failCallback){
		RegisterDaoImpl userDao = new RegisterDaoImpl(user);
		boolean registeredFlag = userDao.query(user);
		if(!registeredFlag){
			//开始注册，根据注册结果提供回调接口
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
