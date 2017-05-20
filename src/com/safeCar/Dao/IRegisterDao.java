package com.safeCar.Dao;

import com.safeCar.Bean.User;

public interface IRegisterDao {
		/*
		 * return true成功,false失败
		 */
		public  boolean insert(User user);//插入用户
		/*
		 * return true存在，false不存在
		 */
		public boolean query(User user);//查询用户返回是否存在
}
