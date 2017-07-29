package com.struts.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class UserLogout {

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			if(cookie.getValue() != null && cookie.getName().equals("login")){
				cookie.setMaxAge(-1);
				cookie.setValue(null);
				cookie.setPath("/");
				response.addCookie(cookie);
				request.getSession().invalidate();
			}
		}
		return "success";
	}
}
