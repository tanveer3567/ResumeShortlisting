package com.struts.action;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dbUtils.StudentRepository;
import com.struts.mail.Mailer;
import com.struts.model.Experience;
import com.struts.model.Student;
import com.struts.model.StudentExperience;

public class studentDetails extends ActionSupport implements ModelDriven<Student> {

	private StudentRepository  repo = null;
	private int studentId;
	private Student student;
	private ArrayList<Student> allStudents = null;
	
	public ArrayList<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(ArrayList<Student> allStudents) {
		this.allStudents = allStudents;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentDetails(){
		
		repo = new StudentRepository();
		allStudents = repo.getAllStudents();
		if(allStudents != null)
			return SUCCESS;
		else
			return ERROR;
	}

	public String deleteStudentDetails(){
		try{
			repo = new StudentRepository();
			String subject = "Application Status";
			String msg = "Sorry, Your resume has been rejected. Better luck next time";
			StudentExperience studentExperience = repo.getStudentById(studentId);
			Mailer.send(studentExperience.getIntstudent().getEmailId(), subject, msg);
			if(repo.deleteStudent(studentExperience))
				return SUCCESS;
			else
				return ERROR;
		}catch (Exception e){
			e.printStackTrace();
		}
		return ERROR;
	}
	
	public String getFullDetailsById(){
		repo = new StudentRepository();
		StudentExperience studentExperience = repo.getStudentById(studentId);
		if(repo.deleteStudent(studentExperience))
			return SUCCESS;
		else
			return ERROR;
	}
	
	
//	public String updateStudentDetailsRedirect(){
//		return SUCCESS;
//	}
//	
//	public String updateStudentDetails(){
//		repo = new StudentRepository();
//		if(repo.updateStudent(getStudent()))
//			return SUCCESS;
//		else
//			return ERROR;
//	}
	
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}
	
}
