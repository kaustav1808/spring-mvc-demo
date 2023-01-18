<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student From</title>
</head>
<body>
   <form:form action="processForm" modelAtttribute="student">
     First Name : <input type="text" name="firstName" value="firstName" />
     <br>
     Last Name : <input type="text" name="lastName" value="lastName" />
     <br>
     <input type="submit" />
   </form:form>

</body>
</html>