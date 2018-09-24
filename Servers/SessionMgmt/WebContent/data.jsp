<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<%
HttpSession session2=request.getSession(false);
String name=(String) session2.getAttribute("name");
%>
<h2>Welcome to Session</h2>
<br>
<h3>Name of User:-<%=name%></H3><br>
<h3>Session ID:-<%=session2.getId()%></h3><br>
</body>
</html>