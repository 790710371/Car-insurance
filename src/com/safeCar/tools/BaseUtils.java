package com.safeCar.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.safeCar.Bean.LoginInfo;

public class BaseUtils {
	private BaseUtils(){
		//·ÀÖ¹ÊµÀý»¯
	}
		@SuppressWarnings("unused")
		public static boolean isSessionExist(HttpServletRequest request){
			HttpSession session = request.getSession();
			if(null!=session){
				return true;
			}
			return false;
		}
}
