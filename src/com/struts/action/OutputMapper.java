package com.struts.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.struts.model.Company;
import com.struts.model.StudentExperience;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dbUtils.StudentRepository;
import com.struts.model.Application;;

public class OutputMapper extends ActionSupport implements ModelDriven<Application> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Application application = new Application();
	private StudentRepository  repo = null;
	private int studentRegId;
	
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public int getStudentRegId() {
		return studentRegId;
	}

	public void setStudentRegId(int studentRegId) {
		this.studentRegId = studentRegId;
	}

	public String getFullDetailsById(){
		repo = new StudentRepository();
		StudentExperience studentExperience = repo.getStudentById(studentRegId);
		if(studentExperience != null){
			if(Mapper(studentExperience))
				return SUCCESS;
		}
		return ERROR;
	}
	
	@SuppressWarnings("rawtypes")
	public boolean Mapper(StudentExperience studentExperience2) {
		boolean check = false;
		Company company1 = null;
		Company company2 = null;
		Company company3 = null;
		List companies = null;
		
		try{
			companies = Arrays.asList(studentExperience2.getIntexperience().getCompany().toArray());
		}catch (Exception e){
			e.printStackTrace();
		}
		application.setStudentId(studentExperience2.getIntstudent().getStudentId());
		application.setFirstname(studentExperience2.getIntstudent().getFirstname());
		application.setMiddlename(studentExperience2.getIntstudent().getMiddlename());
		application.setLastname(studentExperience2.getIntstudent().getLastname());
		application.setDateOfBirth(studentExperience2.getIntstudent().getDateOfBirth());
		application.setEmailId(studentExperience2.getIntstudent().getEmailId());
		application.setPhoneNumber(studentExperience2.getIntstudent().getPhoneNumber());
		application.setAddress(studentExperience2.getIntstudent().getAddress());
		application.setCity(studentExperience2.getIntstudent().getCity());
		application.setState(studentExperience2.getIntstudent().getState());
		application.setPincode(studentExperience2.getIntstudent().getPincode());
		application.setNoy(studentExperience2.getIntexperience().getNoy());
		application.setCurrentCTC(studentExperience2.getIntexperience().getCurrentCTC());
//		int i = 1;
//		for(Company company : companies){
//			if(i==1)
				company1 = (Company) companies.get(0);
//			else if(i==2)
				company2 = (Company) companies.get(1);
//			else if(i==3)
				company3 = (Company) companies.get(2);
//		}
		application.setCompany1(company1.getName());
		application.setRole1(company1.getRole());
		application.setStartDate1(company1.getStartDate());
		application.setEndDate1(company1.getEndDate());
		application.setCompany2(company2.getName());
		application.setRole2(company2.getRole());
		application.setStartDate2(company2.getStartDate());
		application.setEndDate2(company2.getEndDate());
		application.setCompany3(company3.getName());
		application.setRole3(company3.getRole());
		application.setStartDate3(company3.getStartDate());
		application.setEndDate3(company3.getEndDate());
		application.setDegree(studentExperience2.getIntexperience().getDegree());
		application.setGroupType(studentExperience2.getIntexperience().getGroupType());
		application.setPercentage1(studentExperience2.getIntexperience().getPercentage1());
		application.setIntermediate(studentExperience2.getIntexperience().getIntermediate());
		application.setPercentage2(studentExperience2.getIntexperience().getPercentage2());
		application.setSchool(studentExperience2.getIntexperience().getSchool());
		application.setPercentage3(studentExperience2.getIntexperience().getPercentage3());
		if(application != null){
			check = true;
			return check;
		}
		else
			return check;
	}

	@Override
	public Application getModel() {
		// TODO Auto-generated method stub
		return application;
	}

}
