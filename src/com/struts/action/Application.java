package com.struts.action;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dbUtils.StudentRepository;
import com.struts.model.Student;

public class Application extends ActionSupport implements ModelDriven<Student> {

	private StudentRepository  repo = new StudentRepository();
	private Student student = new Student() ;
	private int studentRegId;
	
	public int getStudentRegId() {
		return studentRegId;
	}
	public void setStudentRegId(int studentRegId) {
		this.studentRegId = studentRegId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}
	
	public void validate(){
		if(StringUtils.isEmpty(getStudent().getFirstname()))
			addFieldError("firstname", "First Name cannot be blank");
		if(getStudent().getFirstname().length()>32)
			addFieldError("firstname", "Length of First Name cannot be more than 32");
		if(StringUtils.isEmpty(getStudent().getLastname()))
			addFieldError("lastname", "Last Name Cannot be blank");
		if(getStudent().getLastname().length()>32)
			addFieldError("lastname", "Length of Last Name cannot be more than 32");
		if(getStudent().getDateOfBirth()==null)
			addFieldError("dateOfBirth", "Date birth  Cannot be blank");
		if(getStudent().getDateOfBirth()!=null && getStudent().getDateOfBirth().getTime()> new Date().getTime())
			addFieldError("dateOfBirth", "Date of birth cannot be more than current date");
		if(StringUtils.isEmpty(getStudent().getEmailId()))
			addFieldError("emailId", "Email Id Cannot be blank");
//		if(getStudent().getEmailId().matches("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}"));
//			addFieldError("emailId", "Invalid Email ID");
//		if(getStudent().getPhoneNumber()==0)
//			addFieldError("phoneNumber", "Phone Number Cannot be blank");
//		if(String.valueOf(getStudent().getPhoneNumber()).matches("[0-9]+") && String.valueOf(getStudent().getPhoneNumber()).length()==10)
//			addFieldError("phoneNumber", "Invalid Phone Number");
		if(StringUtils.isEmpty(getStudent().getAddress()))
			addFieldError("address", "Address Cannot be blank");
		if(StringUtils.isEmpty(getStudent().getState()))
			addFieldError("state", "State Cannot be blank");
		if(StringUtils.isEmpty(getStudent().getCity()))
			addFieldError("city", "City Cannot be blank");
		if(getStudent().getCity().length()>32)
			addFieldError("city", "Length of the city name cannot be more than 32");
		if(getStudent().getPincode()==0)
			addFieldError("pincode", "Pin Code Cannot be blank");
	}
	
	public String addStudentDetails(){
		int id = repo.createStudent(getStudent());
		if(id != -1){
			setStudentRegId(id);
			return SUCCESS;
		}
		else
			return ERROR;
	}
	
}
