package com.struts.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

public class Application {

	private int studentId;
	private String firstname;
	private String middlename;
	private String lastname;
	private String dateOfBirth;
	private String emailId;
	private long phoneNumber;
	private String address;
	private String state;
	private String city;
	private int pincode;
	private Student student;
	private int noy;
	private String Company1;
	private String role1;
	private String startDate1;
	private String endDate1;
	private String Company2;
	private String role2;
	private String startDate2;
	private String endDate2;
	private String Company3;
	private String role3;
	private String startDate3;
	private String endDate3;
	private double currentCTC;
	private String degree;
	private String groupType;
	private String universityCollege;
	private int percentage1;
	private String intermediate;
	private int percentage2;
	private String school;
	private int percentage3;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth.toString().substring(0, 10);
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getNoy() {
		return noy;
	}
	public void setNoy(int noy) {
		this.noy = noy;
	}
	public String getCompany1() {
		return Company1;
	}
	public void setCompany1(String company1) {
		Company1 = company1;
	}
	public String getRole1() {
		return role1;
	}
	public void setRole1(String role1) {
		this.role1 = role1;
	}
	public String getStartDate1() {
		return startDate1;
	}
	public void setStartDate1(Date startDate1) {
		this.startDate1 = startDate1.toString().substring(0, 10);
	}
	public String getEndDate1() {
		return endDate1;
	}
	public void setEndDate1(Date endDate1) {
		this.endDate1 = endDate1.toString().substring(0, 10);
	}
	public String getCompany2() {
		return Company2;
	}
	public void setCompany2(String company2) {
		Company2 = company2;
	}
	public String getRole2() {
		return role2;
	}
	public void setRole2(String role2) {
		this.role2 = role2;
	}
	public String getStartDate2() {
		return startDate2;
	}
	public void setStartDate2(Date startDate2) {
		this.startDate2 = startDate2.toString().substring(0, 10);
	}
	public String getEndDate2() {
		return endDate2;
	}
	public void setEndDate2(Date endDate2) {
		this.endDate2 = endDate2.toString().substring(0, 10);
	}
	public String getCompany3() {
		return Company3;
	}
	public void setCompany3(String company3) {
		Company3 = company3;
	}
	public String getRole3() {
		return role3;
	}
	public void setRole3(String role3) {
		this.role3 = role3;
	}
	public String getStartDate3() {
		return startDate3;
	}
	public void setStartDate3(Date startDate3) {
		this.startDate3 = startDate3.toString().substring(0, 10);
	}
	public String getEndDate3() {
		return endDate3;
	}
	public void setEndDate3(Date endDate3) {
		this.endDate3 = endDate3.toString().substring(0, 10);
	}
	public double getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(double currentCTC) {
		this.currentCTC = currentCTC;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getUniversityCollege() {
		return universityCollege;
	}
	public void setUniversityCollege(String universityCollege) {
		this.universityCollege = universityCollege;
	}
	public int getPercentage1() {
		return percentage1;
	}
	public void setPercentage1(int percentage1) {
		this.percentage1 = percentage1;
	}
	public String getIntermediate() {
		return intermediate;
	}
	public void setIntermediate(String intermediate) {
		this.intermediate = intermediate;
	}
	public int getPercentage2() {
		return percentage2;
	}
	public void setPercentage2(int percentage2) {
		this.percentage2 = percentage2;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getPercentage3() {
		return percentage3;
	}
	public void setPercentage3(int percentage3) {
		this.percentage3 = percentage3;
	}
	
}
