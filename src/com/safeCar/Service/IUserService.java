package com.safeCar.Service;

import com.safeCar.Service.impl.RegisterServiceImpl.IFailCallback;
import com.safeCar.Service.impl.RegisterServiceImpl.ISuccessCallback;

public interface IUserService {
		//ע���߼�������װ
		public void register(ISuccessCallback successCallback,IFailCallback failCallback);
}
