package com.safeCar.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter(urlPatterns = {"*.jsp","*.action"}, asyncSupported = true)
public class SessionFilter implements Filter{

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;
        HttpSession session = request.getSession();
        //���url eg:RoleServlet?op=torolelist
        String url = request.getServletPath() ;
        System.out.println(url);
        //�жϣ��ų�ɸѡ��ҳ���ύ��½ҳ
        if (!url.contains("/login.jsp")&&!url.contains("/register.jsp")&&!url.contains("LR.action")) {
            //session�д���user 
            if (session.getAttribute("userinfo") == null) {
                response.sendRedirect(request.getContextPath()+"/login.jsp");
                return;
            } 
        }
            arg2.doFilter(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
