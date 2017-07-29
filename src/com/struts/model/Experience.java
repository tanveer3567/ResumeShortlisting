package com.struts.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Experience implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name="studentId")
	private Student student;
	private int noy;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Comapny",joinColumns=@JoinColumn(name="studentId"))
	private Collection<Company> company = new ArrayList<Company>();
	@Transient
	private String company1;
	@Transient
	private String role1;
	@Transient
	private Date startDate1;
	@Transient
	private Date endDate1;
	@Transient
	private String company2;
	@Transient
	private String role2;
	@Transient
	private Date startDate2;
	@Transient
	private Date endDate2;
	@Transient
	private String company3;
	@Transient
	private String role3;
	@Transient
	private Date startDate3;
	@Transient
	private Date endDate3;
	private double currentCTC;
	private String degree;
	private String groupType;
	private String universityCollege;
	private int percentage1;
	private String intermediate;
	private int percentage2;
	private String school;
	private int percentage3;
	@Transient
	private int studentId;
	
	public Experience(){}
	
	public Experience(Student student, int noy, Collection<Company> company, double currentCTC, String degree,
			String groupType, String universityCollege, int percentage1, String intermediate, int percentage2,
			String school, int percentage3) {
		super();
		this.student = student;
		this.noy = noy;
		this.company = company;
		this.currentCTC = currentCTC;
		this.degree = degree;
		this.groupType = groupType;
		this.universityCollege = universityCollege;
		this.percentage1 = percentage1;
		this.intermediate = intermediate;
		this.percentage2 = percentage2;
		this.school = school;
		this.percentage3 = percentage3;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
	public int getNoy() {
		return noy;
	}
	public void setNoy(int noy) {
		this.noy = noy;
	}
	public Collection<Company> getCompany() {
		return company;
	}
	public void setCompany(Collection<Company> company) {
		this.company = company;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getCompany1() {
		return company1;
	}

	public void setCompany1(String company1) {
		this.company1 = company1;
	}

	public String getRole1() {
		return role1;
	}

	public void setRole1(String role1) {
		this.role1 = role1;
	}

	public Date getStartDate1() {
		return startDate1;
	}

	public void setStartDate1(Date startDate1) {
		this.startDate1 = startDate1;
	}

	public Date getEndDate1() {
		return endDate1;
	}

	public void setEndDate1(Date endDate1) {
		this.endDate1 = endDate1;
	}

	public String getCompany2() {
		return company2;
	}

	public void setCompany2(String company2) {
		this.company2 = company2;
	}

	public String getRole2() {
		return role2;
	}

	public void setRole2(String role2) {
		this.role2 = role2;
	}

	public Date getStartDate2() {
		return startDate2;
	}

	public void setStartDate2(Date startDate2) {
		this.startDate2 = startDate2;
	}

	public Date getEndDate2() {
		return endDate2;
	}

	public void setEndDate2(Date endDate2) {
		this.endDate2 = endDate2;
	}

	public String getCompany3() {
		return company3;
	}

	public void setCompany3(String company3) {
		this.company3 = company3;
	}

	public String getRole3() {
		return role3;
	}

	public void setRole3(String role3) {
		this.role3 = role3;
	}

	public Date getStartDate3() {
		return startDate3;
	}

	public void setStartDate3(Date startDate3) {
		this.startDate3 = startDate3;
	}

	public Date getEndDate3() {
		return endDate3;
	}

	public void setEndDate3(Date endDate3) {
		this.endDate3 = endDate3;
	}
	
}
