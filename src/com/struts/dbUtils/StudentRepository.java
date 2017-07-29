package com.struts.dbUtils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.struts.model.Company;
import com.struts.model.Experience;
import com.struts.model.Student;
import com.struts.model.StudentExperience;
import com.struts.model.User;


public class StudentRepository {

	public SessionFactory buildSessionFactory;
	public Session session;

	public StudentRepository() {
		buildSessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public void establishConnections(){
	
		try {
			session = buildSessionFactory.openSession();
			session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try{
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public ArrayList<Student> getAllStudents(){
		ArrayList<Student> studentList = new ArrayList<Student>();
		try{
			establishConnections();
			Query query = session.createQuery("from Student");
			studentList = (ArrayList<Student>) query.list();
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return studentList;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public int getStudentId(String emailId,long phoneNumber){
		int studentId=-1;
		try{
			establishConnections();
			Query query1 = session.createQuery("from Student s where s.emailId = :eID and s.phoneNumber = :pNo");
			query1.setString("eID", emailId);
			query1.setLong("pNo", phoneNumber);
			ArrayList<Student> stundetList = (ArrayList<Student>) query1.list();
			if(stundetList.size() > 0){
				for(Student student: stundetList){
					studentId=student.getStudentId();
				}
			}
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return studentId;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public StudentExperience getStudentById(int studentRegId){
		Student student = null;
		StudentExperience studentExperience = null;
		Experience experience = new Experience();
		try{
			establishConnections();
			student = session.get(Student.class, studentRegId);
			experience = session.get(Experience.class, studentRegId);
//			Query query = session.createQuery("from Comapny c where c.studentId = :studId").setParameter("studId", studentRegId);
//			ArrayList<Company> list = (ArrayList<Company>) query.list();
//			experience.setCompany(list);
			int size = experience.getCompany().size();
			studentExperience = new StudentExperience(student,experience);
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return studentExperience;
	}
	
	public int createStudent(Student student){
		int studentId = -1;
		Serializable save = null;
		try{
			establishConnections();
			save = session.save(student);
			closeConnection();
			if(save != null){
				studentId = getStudentId(student.getEmailId(), student.getPhoneNumber());
			}
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return studentId;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Student getStudentByIdForTemp(int studentId){
		Student student = null;
		try{
			establishConnections();
			ArrayList<Student> sList = (ArrayList<Student>) session.createQuery("from Student s where s.studentId = :studId").setParameter("studId", studentId).list();
			for(Student tempStudent : sList){
				student = tempStudent;
			}
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return student;
	}
	
	public boolean createExperience(Experience experience){
		boolean experienceCreated = false;
		Serializable save = null;
		try{
			Student student = getStudentByIdForTemp(experience.getStudentId());
			establishConnections();
			if(student != null){
				experience.setStudent(student);
				save = session.save(experience);
				if(save != null){
					experienceCreated = true;
				}
			closeConnection();
			}
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return experienceCreated;
	}
	
//	public boolean updateStudent(Student student){
//		boolean studentUpdated = false;
//		try{
//			establishConnections();
//			String sqlQuery = "update student set first_name = '"+student.getFirstname()+"', last_name = '"+student.getLastname()+"', email = '"+student.getEmailId()+"' where id="+student.getStudentId();
//			int record = stmt.executeUpdate(sqlQuery);
//			if(record > 0){
//				studentUpdated = true;
//			}
//		} catch(Exception e){
//			e.printStackTrace();
//		} finally{
//			closeConnection();
//		}
//		return studentUpdated;
//	}
	
	@SuppressWarnings("deprecation")
	public boolean deleteStudent(StudentExperience studentExperience){
		boolean studentUpdated = false;
		try{
			establishConnections();
			Student intstudent = studentExperience.getIntstudent();
			Experience intexperience = studentExperience.getIntexperience();
			session.delete(intexperience);
			session.delete(intstudent);
			studentUpdated = true;
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return studentUpdated;
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public boolean login(User user){
		boolean loginSuccessfull = false;
		try{
			establishConnections();
			Query query = session.createQuery("from User_Details where username = :uname and password = :pword");
			query.setString("uname", user.getUsername());
			query.setString("pword", user.getPassword());
			ArrayList<User> userList = (ArrayList<User>) query.list();
			if(userList.size() >0){
				loginSuccessfull = true;
			}
			closeConnection();
		} catch(Exception e){
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return loginSuccessfull;
	}
}

