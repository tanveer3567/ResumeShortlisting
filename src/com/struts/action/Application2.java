package com.struts.action;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dbUtils.StudentRepository;
import com.struts.model.Company;
import com.struts.model.Experience;
import com.struts.model.Student;
import com.struts.model.StudentExperience;
import com.struts.model.Application;

public class Application2 extends ActionSupport implements ModelDriven<Experience> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StudentRepository  repo = new StudentRepository();
	private Experience experience = new Experience();
	private Student student = new Student();
	private int studentRegId;
	
	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStudentRegId() {
		return studentRegId;
	}

	public void setStudentRegId(int studentRegId) {
		this.studentRegId = studentRegId;
	}

//	@Override
//	public StudentExperience getModel() {
//		// TODO Auto-generated method stub
//		return studentExperience;
//	}
	

	
	
	public String addExperienceDetails(){
		try{
			Company company1 = new Company(experience.getCompany1(), experience.getRole1(), experience.getStartDate1(), experience.getEndDate1());
			Company company2 = new Company(experience.getCompany2(), experience.getRole2(), experience.getStartDate2(), experience.getEndDate2());
			Company company3 = new Company(experience.getCompany3(), experience.getRole3(), experience.getStartDate3(), experience.getEndDate3());
			experience.getCompany().add(company1);
			experience.getCompany().add(company2);
			experience.getCompany().add(company3);
			if(repo.createExperience(experience)){
				return SUCCESS;
			}
			else
				return ERROR;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public void validate(){
		if(getExperience().getNoy()>35)
			addFieldError("noy", "No of year years of experience cannot be grater than 35");
		if(getExperience().getCurrentCTC()>100)
			addFieldError("currentCTC", "Provide CTC in lakhs and it cannot be greater than 100");
		if(StringUtils.isEmpty(getExperience().getDegree()))
			addFieldError("Degree", "Degree cannot be empty");
		if(StringUtils.isEmpty(getExperience().getGroupType()))
			addFieldError("groupType", "Group cannot be empty");
		if(StringUtils.isEmpty(getExperience().getUniversityCollege()))
			addFieldError("universityCollege", "University / College cannot be empty");
		if(getExperience().getPercentage1()>100)
			addFieldError("percentage1", "Percentage1 cannot be more than 100");
		if(StringUtils.isEmpty(getExperience().getIntermediate()))
			addFieldError("intermediate", "Intermediate cannot be empty");
		if(getExperience().getPercentage2()>100)
			addFieldError("percentage1", "Percentage2 cannot be more than 100");
		if(StringUtils.isEmpty(getExperience().getSchool()))
			addFieldError("school", "School cannot be empty");
		if(getExperience().getPercentage3()>100)
			addFieldError("percentage1", "Percentage3 cannot be more than 100");
	}
	
	@Override
	public Experience getModel() {
		// TODO Auto-generated method stub
		return experience;
	}
	
	
	
}
