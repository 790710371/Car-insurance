//������
package com.safeCar;
/*
 * �˴��������SQL���д���ⷽ���ѯ
 */
//�û���
//create table if not exists `user`(
//	`id` int unsigned auto_increment PRIMARY KEY,
//	`usr_name` varchar(100) NOT NULL,
//	`usr_email` varchar(50) NOT NULL,
//	`usr_phone` varchar(50) NOT NULL,
//	`usr_IDcard` varchar(50) NOT NULL,
//	`usr_carID` varchar(50) NOT NULL,  
//	`login_info_id` int unsigned,
//	`id_cash_left` int unsigned,
//	`id_insure` int unsigned,
//	`id_fix` int unsigned,
//	FOREIGN KEY(login_info_id) REFERENCES logininfo(login_info_id) ON DELETE CASCADE,
//	FOREIGN KEY(id_cash_left) REFERENCES user_cash_left(id_cash_left) ON DELETE CASCADE,
//	FOREIGN KEY(`id_insure`) REFERENCES insure_record(id_insure) ON DELETE CASCADE,
//	FOREIGN KEY(`id_fix`) REFERENCES car_fix_record(id_fix) ON DELETE CASCADE
//	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
////��¼��Ϣ��
//create table if not exists `logininfo`(
//	`login_info_id` int unsigned auto_increment PRIMARY KEY,
//	`usr_account` varchar(20) NOT NULL,
//	`usr_pwd` varchar(20) NOT NULL,
//	`flag` int NOT NULL
//)ENGINE=InnoDB DEFAULT CHARSET=utf8;
////�û�����
//create table if not exists `user_cash_left`(
//	`id_cash_left` int unsigned auto_increment PRIMARY KEY,
//	`usr_cash` int NOT NULL
//)ENGINE=InnoDB DEFAULT CHARSET=utf8;
////Ͷ��������Ϣ��¼��
//create table if not exists `insure_record`(
//	id_insure int unsigned auto_increment PRIMARY KEY,
//	`data_insure` datatime NOT NULL��
//	`ret_count` int NOT NULL
//)ENGINE=InnoDB DEFAULT CHARSET=utf8;
////�޳���Ϣ��¼��
//create table if not exists `car_fix_record`(
//	`id_fix` int unsigned auto_increment PRIMARY KEY,
//	`data_fix_car` datatime NOT NULL
//)ENGINE=InnoDB DEFAULT CHARSET=utf8;

public class Config {
	public static final String JDBC_NAME = "com.mysql.jdbc.Driver";//mysql��������
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/safeCar?useUnicode=true&characterEncoding=utf8";
	public static final String JDBC_USER_NAME = "root";
	public static final String JDBC_USER_PWD = "1312273072";
	public static final String KEY_ACTION= "action";
	public static final String TB_USER ="user";//user��
	public static final String VALUE_REGISTER = "Register";//ע��
	public static final String VALUE_LOGIN = "Login";//��¼
	public static final String VALUE_LOGOUT= "Logout";//ע��
	public static final String VALUE_ADMIN_QUERY = "AdminQuery";//��ѯ�û�
	public static final String VALUE_DEL_USR = "DelUser";//ɾ���û�
	public static final String VALUE_ADD_USER = "AddUser";//������û�
	public static final String VALUE_OPEREATE_RECORD="QueryOperateRecord";//��ѯ������¼
	public static final String VALUE_SETTING_ADMIN = "SettingAdm";//���ù���Ա
	public static final String VALUE_PAGE = "pages";//ҳ��
	public static final String VALUE_RECHARGR = "Recharge";//�û���ֵ
	public static final String VALUE_INSURE = "Insure";//�û�Ͷ��
	public static final String VALUE_CAR_FIX = "Fix";//�û��޳�
}

