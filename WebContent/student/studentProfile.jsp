<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Personal Details</h2> <hr/>
	Student ID : <s:property value="application.getStudentId()"/> <br/>
	Name : <s:property value="application.firstname"/>&nbsp<s:property value="application.lastname"/> <br/>
	Date of birth : <s:property value="application.dateOfBirth"/> <br/>
	Email ID : <s:property value="application.emailId"/>
	Phone Number : <s:property value="application.phoneNumber"/> <br/>
	Address : <s:property value="application.address"/> <br/>
	City : <s:property value="application.city"/>
	State : <s:property value="application.state"/> <br/>
	Pin code : <s:property value="application.pincode"/> <br/>
	<h2>Professional Details</h2> <hr/>
	No of years of experience : <s:property value="application.noy"/>
	Current CTC : <s:property value="application.currentCTC"/> <br/> <br/>
	<table cellspacing="5" cellpadding="5" border="2">
		<tr>
			<th>Company</th>
			<th>Role</th>
			<th>Start Date</th>
			<th>End Date</th>
		</tr>
		<tr>
			<td><s:property value="application.company1"></s:property></td>
			<td><s:property value="application.role1"/></td>
			<td><s:property value="application.startDate1" /></td>
			<td><s:property value="application.endDate1"/></td>
		</tr>
		<tr>
			<td><s:property value="application.company2"></s:property></td>
			<td><s:property value="application.role2"/></td>
			<td><s:property value="application.startDate2" /></td>
			<td><s:property value="application.endDate2"/></td>
		</tr>
		
		<tr>
			<td><s:property value="application.company3"></s:property></td>
			<td><s:property value="application.role3"/></td>
			<td><s:property value="application.startDate3" /></td>
			<td><s:property value="application.endDate3"/></td>
		</tr>
	</table> <br/>
	<h2>Education Details</h2> <hr/>
	Degree : <s:property value="application.degree"/>,
	Group : <s:property value="application.groupType"/>, 
	Percentage : <s:property value="application.percentage1"/> <br/>
	Intermediate : <s:property value="application.intermediate"/>, 
	Percentage : <s:property value="application.percentage2"/> <br/>
	School : <s:property value="application.school"/>,
	Percentage 3 : <s:property value="application.percentage3"/>
	<hr>
	<s:url action="deleteStudentDetails" var="urlTag1">
			<s:param name="studentId" value="studentId"></s:param>
	</s:url>
	<s:a href="%{urlTag1}">DELETE</s:a>
</body>
</html>