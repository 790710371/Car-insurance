package com.safeCar.Service;

import com.safeCar.Service.impl.RegisterService;
import com.safeCar.Service.impl.RegisterService.IFailCallback;
import com.safeCar.Service.impl.RegisterService.ISuccessCallback;

public interface IUserService {
		//ע���߼�������װ
		public void register(ISuccessCallback successCallback,IFailCallback failCallback);
}
