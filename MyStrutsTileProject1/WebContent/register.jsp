<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register me</title>
</head>
<body>

<s:form action="registerProcess" method="get">
	<s:textfield name="lBean.strFullName" label="Full Name" />
	<s:textfield name="lBean.strUserName" label="Username" />
	<s:password name="lBean.strPassword" label="Password" />
	<s:submit value="Register" />
</s:form>
</body>
</html>