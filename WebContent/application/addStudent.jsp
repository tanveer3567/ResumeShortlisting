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
	<s:set name="stateList" var="AP,UP,MP"/>
	<s:form action="addStudentDetails.action" method="POST">
		<s:textfield label="First Name" key="firstname" requiredLabel="true"/>
		<s:textfield label="Middle Name" requiredLabel="false"/>
		<s:textfield label="Last Name" key="lastname" requiredLabel="true" />
		<s:textfield type="date" label="Date of birth" key="dateOfBirth" requiredLabel="true"/>
		<s:textfield label="Email Id" key="emailId" requiredLabel="true" />
		<s:textfield type="integer" label="Mobile Number" key="phoneNumber" requiredLabel="true"/>
		<s:textarea rows="5" cols="50" label="Address" key="address" requiredLabel="true"/>
		<s:select list="{'Andaman and Nicobar Islands','Andhra Pradesh','Arunachal Pradesh',
						'Assam','Bihar','Chandigarh','Chhattisgarh','Dadra and Nagar Haveli','Daman and Diu',
						'National Capital Territory of Delhi','Goa','Gujarat','Haryana','Himachal Pradesh','Jammu and Kashmir',
						'Jharkhand','Karnataka','Kerala','Lakshadweep','Madhya Pradesh','Maharashtra','Manipur','Meghalaya',
						'Mizoram','Nagaland','Odisha','Puducherry','Punjab','Rajasthan','Sikkim','Tamil Nadu','Telangana','Tripura',
						'Uttar Pradesh','Uttarakhand','West Bengal'}" label="State" key="state" requiredLabel="true"></s:select>
		<s:textfield label="City" key="city" requiredLabel="true"/>
		<s:textfield type="integer" label="Pin code" key="pincode" requiredLabel="true" />
		<s:submit />
	</s:form>
</body>
</html>