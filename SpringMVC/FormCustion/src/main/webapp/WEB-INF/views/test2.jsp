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
�̸�:<form:input path="user_name" /><br>
���̵�: <form:input path="user_id" /><br>
��й�ȣ: <form:input path="user_pw" /><br>
�����ȣ: <form:input path="user_postcode" /><br>
�ּ�: <form:input path="user_addr1" /><br>
���ּ�: <form:input path="user_addr2" /><br>
<input value="login" type="submit">
</form:form>
</body>
</html>