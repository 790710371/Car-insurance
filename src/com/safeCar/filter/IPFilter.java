package com.safeCar.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.safeCar.tools.BaseUtils;

public class IPFilter implements Filter{
	public FilterConfig filterConfig;
	String ip;
	public IPFilter(){
		super();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			String ipRemote =request.getRemoteAddr();
			if(ipRemote.equals(ip)){
				response.setCharacterEncoding("utf-8");
	            PrintWriter out = response.getWriter();
	            out.println("<b>���IP����ֹ��ַ���ʡ�</b>");
			}else{
				 //����������һ��
		        chain.doFilter(request, response);
			}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		//��װ����filterConfig
        this.filterConfig=filterConfig;
        //��ʼ���������������ļ�web.xml��ȡ����IP
        this.ip=this.filterConfig.getInitParameter("ip");
	}

}
