package com.safeCar.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.safeCar.Config;

public class DBUtils {

	//获取数据库连接
		public static Connection getConnection(){
			Connection conn = null;
			try{
				System.out.println("正在加载驱动");
				Class.forName(Config.JDBC_NAME);
				System.out.println("加载数据库驱动成功");
				//加载驱动成功
				conn = (Connection) DriverManager.getConnection(Config.JDBC_URL, Config.JDBC_USER_NAME, Config.JDBC_USER_PWD);
			}catch(Exception e){
				e.printStackTrace();
			}
			return conn;
		}
		//关闭Statement对象
		public static void closePreparedStatement(PreparedStatement pst) throws SQLException{
			try{
				if(null!=pst){
					pst.close();
				}
			}catch(SQLException e){
				throw new SQLException("关闭PreparedStatement失败");
			}
		}
		//关闭Connection对象
		public static void closeConnection(java.sql.Connection conn) throws SQLException{
			try{
				if(null!=conn){
					conn.close();
				}
			}catch(SQLException es){
				throw new SQLException("关闭Connection对象失败");
			}
		}
		
		//关闭ResultSet对象
		public static void closeResultSet(ResultSet rs) throws SQLException{
			try{
				if(null!=rs){
					rs.close();
				}
			}catch (SQLException e) {
				// TODO: handle exception
				throw new SQLException("关闭ResultSet对象失败");
			}
		}

}
