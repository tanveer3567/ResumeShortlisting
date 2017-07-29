package com.struts.interceptors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CookieCheck implements Interceptor{

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		Cookie[] cookies = ServletActionContext.getRequest().getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getValue() != null && !StringUtils.isEmpty(cookie.getValue()) && cookie.getName().equals("login")){
					HttpSession session = ServletActionContext.getRequest().getSession();
					if(session.getAttribute("username")== null)
						session.setAttribute("username", cookie.getValue());
					return ai.invoke();
				}
			}
		}
		return "loginError";
	}
	
	
}
