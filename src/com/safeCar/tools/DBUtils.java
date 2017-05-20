package com.safeCar.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.safeCar.Config;

public class DBUtils {

	//��ȡ���ݿ�����
		public static Connection getConnection(){
			Connection conn = null;
			try{
				System.out.println("���ڼ�������");
				Class.forName(Config.JDBC_NAME);
				System.out.println("�������ݿ������ɹ�");
				//���������ɹ�
				conn = (Connection) DriverManager.getConnection(Config.JDBC_URL, Config.JDBC_USER_NAME, Config.JDBC_USER_PWD);
			}catch(Exception e){
				e.printStackTrace();
			}
			return conn;
		}
		//�ر�Statement����
		public static void closePreparedStatement(PreparedStatement pst) throws SQLException{
			try{
				if(null!=pst){
					pst.close();
				}
			}catch(SQLException e){
				throw new SQLException("�ر�PreparedStatementʧ��");
			}
		}
		//�ر�Connection����
		public static void closeConnection(java.sql.Connection conn) throws SQLException{
			try{
				if(null!=conn){
					conn.close();
				}
			}catch(SQLException es){
				throw new SQLException("�ر�Connection����ʧ��");
			}
		}
		
		//�ر�ResultSet����
		public static void closeResultSet(ResultSet rs) throws SQLException{
			try{
				if(null!=rs){
					rs.close();
				}
			}catch (SQLException e) {
				// TODO: handle exception
				throw new SQLException("�ر�ResultSet����ʧ��");
			}
		}

}
