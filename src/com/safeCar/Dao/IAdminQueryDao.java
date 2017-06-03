package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.User;

public interface IAdminQueryDao {
			public List<User> queryUserInfo(String usr_name);
}
