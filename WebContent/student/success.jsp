<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.struts.action.studentDetails" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<%
		HttpSession httpSession= request.getSession();
		String username = httpSession.getAttribute("username").toString();
	%>
	<center><h3>Welcome <%= username %></h3></center>
	<a target="_blank" href="/StrutsDemoProject/student/redirect.jsp">logout</a>
	
	<table>
		<tr>
			<th>Student ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<s:iterator value="allStudents" status="thestudent">
			<tr>
				<td><s:property value="studentId"/></td>
				<td><s:property value="firstname"/></td>
				<td><s:property value="lastname"/></td>
				<td><s:property value="emailId"/></td>
				<td>
					<s:url action="getFullDetailsById" var="urlTag1">
						<s:param name="studentRegId" value="studentId"></s:param>
					</s:url>
					<s:a href="%{urlTag1}">View Profile</s:a>
					<s:url action="deleteStudentDetails" var="urlTag2">
						<s:param name="studentId" value="studentId"></s:param>
					</s:url>
					<s:a href="%{urlTag2}">DELETE</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>