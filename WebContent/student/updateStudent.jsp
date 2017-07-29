<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<s:form action="/student/updateStudentDetails" method="POST">
		<s:textfield label="Student ID" key="studentId" value="%{studentId}" readonly="true"  />
		<s:textfield label="First Name" key="firstname" value="%{firstname}" />
		<s:textfield label="Last Name" key="lastname" value="%{lastname}" />
		<s:textfield label="Email Id" key="emailId"  value="%{emailId}" />
		<s:submit />
	</s:form>
</body>
</html>