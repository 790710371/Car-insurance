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
	            out.println("<b>你的IP被禁止地址访问。</b>");
			}else{
				 //继续进行下一步
		        chain.doFilter(request, response);
			}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		//封装对象filterConfig
        this.filterConfig=filterConfig;
        //初始化操作，从配置文件web.xml读取过滤IP
        this.ip=this.filterConfig.getInitParameter("ip");
	}

}
