package com.struts.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dbUtils.StudentRepository;
import com.struts.model.User;

public class UserLogin extends ActionSupport implements ModelDriven<User>{
	
	private StudentRepository  repo = null;
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void validate(){
		if(StringUtils.isEmpty(getUser().getUsername()))
			addFieldError("username", "User Name cannot be blank");
		if(StringUtils.isEmpty(getUser().getPassword()))
			addFieldError("password", "Password Cannot be blank");
	}
	
	
	
	public String execute(){
		repo= new StudentRepository();
		if(repo.login(user)){
			Cookie cookie = new Cookie("login", getUser().getUsername());
			cookie.setMaxAge(60*60);
			cookie.setPath("/");
			ServletActionContext.getResponse().addCookie(cookie);
			return SUCCESS;
		}
		else
			return ERROR;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
