package com.cn.scala.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(filterName="loginFilter",urlPatterns={"/*"})
public class CheckSessionFilter implements Filter{

	private String uri;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		//获取请求的路径
		uri = request.getRequestURI();
		//截取请求路径
		String requestPath = uri.substring(uri.lastIndexOf("/")+1, uri.length());
		
		//判断当前请求路径是否是去登录页面
		if("toLogin".equals(requestPath)){
			chain.doFilter(request, response);
		}else{
			//获取session
			HttpSession session = request.getSession();
			Object operator = session.getAttribute("login_session");
			if(operator != null){
				chain.doFilter(request, response);
			}else{
				uri = "/system/toLogin";
			}
			//转发到登录页面
			request.getRequestDispatcher(uri).forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
