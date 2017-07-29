package com.struts.model;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Company {

	private String name;
	private String role;
	private Date startDate;
	private Date endDate;
	
	public Company(){}
	public Company(String name, String role, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
