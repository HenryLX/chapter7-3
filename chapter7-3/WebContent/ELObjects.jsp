<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% pageContext.setAttribute("username", "pageContext"); %>
	<hr>
表达式\${pageScope.username}的值为：${pageScope.username} <br />
	表达式\${requestScope.username}的值为：${requestScope.username} <br /> 
	表达式\${sessionScope.username}的值为：${sessionScope.username} <br />
	表达式\${applicationScope.username}的值为：${applicationScope.username}<br /> 
     
	表达式\${username}的值为：${username} 
</body>
</html>