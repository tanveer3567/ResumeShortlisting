package com.struts.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id @GeneratedValue
	private int studentId;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date dateOfBirth;
	private String emailId;
	private long phoneNumber;
	private String address;
	private String state;
	private String city;
	private int pincode;

	public Student(){
	}

	public Student(int studentId, String firstname, String middlename, String lastname, Date dateOfBirth,
			String emailId, long phoneNumber, String address, String state, String city, int pincode) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	
	
	
	
}
