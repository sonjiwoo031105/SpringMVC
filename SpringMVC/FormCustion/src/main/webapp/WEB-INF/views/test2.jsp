<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="loginDTO" action="/result">
이름:<form:input path="user_name" /><br>
아이디: <form:input path="user_id" /><br>
비밀번호: <form:input path="user_pw" /><br>
우편번호: <form:input path="user_postcode" /><br>
주소: <form:input path="user_addr1" /><br>
상세주소: <form:input path="user_addr2" /><br>
<input value="login" type="submit">
</form:form>
</body>
</html>