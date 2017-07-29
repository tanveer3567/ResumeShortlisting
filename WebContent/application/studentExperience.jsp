<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<s:form action="addExperienceDetails" method="POST">
		<s:textfield type="integer" label="Student Id" key="studentId" value="%{studentRegId}" />
		<s:textfield type="integer" label="No of Years of experience" key="noy"/>
		<s:textfield type="integer" label="Current CTC" key="currentCTC"></s:textfield>
		<s:textfield label="Company Name" key="company1"/>
		<s:textfield label="Role" key="role1"/>
		<s:textfield type="date" label="Start Date" key="startDate1" />
		<s:textfield type="date" label="End Date" key="endDate1" />
		<s:textfield label="Company Name" key="company2"/>
		<s:textfield label="Role" key="role2"/>
		<s:textfield type="date" label="Start Date" key="startDate2" />
		<s:textfield type="date" label="End Date" key="endDate2" />
		<s:textfield label="Company Name" key="company3"/>
		<s:textfield label="Role" key="role3"/>
		<s:textfield type="date" label="Start Date" key="startDate3" />
		<s:textfield type="date" label="End Date" key="endDate3" />
		<s:select list="{'Btech','Mtech','BSc','Msc','MCA'}" label="Degree" key="degree"></s:select>
		<s:select list="{'Computer Science Engineering','Software Engineering','Information Technology'}" label="Group" key="groupType"></s:select>
		<s:textfield label="University/College" key="universityCollege" />
		<s:textfield label="Percentage" key="percentage1" />
		<s:textfield label="Intermediate" key="intermediate" />
		<s:textfield label="Percentage" key="percentage2" />
		<s:textfield label="School" key="school"/>
		<s:textfield label="Percentage" key="percentage3" />
		<s:submit />
	</s:form>
</body>
</html>