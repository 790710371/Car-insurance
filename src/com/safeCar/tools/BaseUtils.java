package com.safeCar.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;

public class BaseUtils {
	public static String ipUrl = "http://ip.taobao.com/service/getIpInfo2.php?ip=myip";
	private BaseUtils(){
	}
	public static Object getSessionValue(HttpServletRequest req,String attr){
		Object obj;
		HttpSession session  = req.getSession();
		obj = session.getAttribute(attr);
		return obj;
	}
	public static String getIpAddr(){
		String ipAddr = null;
		URLConnection conn ;
		BufferedReader bufferedReader = null ;
		InputStream in = null;
		try {
			 conn = new URL(ipUrl).openConnection();
			 in = conn.getInputStream();
		    bufferedReader = new BufferedReader(new InputStreamReader(in));
			String len ="";
			while((len=bufferedReader.readLine())!=null){
				ipAddr=len.toString();
			}
			JSONObject jsonObject;
			try {
				jsonObject = new JSONObject(ipAddr);
				JSONObject obj = jsonObject.getJSONObject("data");
				ipAddr = obj.getString("ip");
				System.out.println(ipAddr);
				return ipAddr;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(null!=in){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(null!=bufferedReader){
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return "error";
	}
	/*
	 * 获取当前的日期
	 */
	public static String getCurrentDate(){
			Date d = new Date();  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        String dateNowStr = sdf.format(d);  
	        return dateNowStr;
	}
	
}
