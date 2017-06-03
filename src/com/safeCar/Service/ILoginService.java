package com.safeCar.Service;

import com.safeCar.Service.impl.LoginServiceImpl.LoginListener;

public interface ILoginService {
	//ÓÃ»§µÇÂ¼£¬Ìá¹©¼àÌıÆ÷£¬¼àÌıµÇÂ¼×´Ì¬
	void login(LoginListener listener);
}
