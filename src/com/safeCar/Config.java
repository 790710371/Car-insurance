//配置类
package com.safeCar;
/*
 * 此处将建表的SQL语句写在这里
 * 
 */
public class Config {
	public static final String JDBC_NAME = "com.mysql.jdbc.Driver";//mysql驱动名称
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/safeCar";
	public static final String JDBC_USER_NAME = "root";
	public static final String JDBC_USER_PWD = "1312273072";
	public static final String KEY_ACTION= "action";
	public static final String TB_USER ="user";//user表
	public static final String VALUE_REGISTER = "Register";
	public static final String VALUE_LOGIN = "Login";
	public static final String VALUE_LOGOUT= "Logout";
}

