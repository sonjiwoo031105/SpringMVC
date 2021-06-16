<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/test1">
이름: <input type="text" name="user_name"><br>
아이디: <input type="text" name="user_id"><br>
비밀번호: <input type="password" name="user_pw"><br>
우편번호: <input type="text" name="user_postcode"><br>
주소: <input type="text" name="user_addr1"><br>
상세주소: <input type="text" name="user_addr2">
<input value="login" type="submit">
</form>
</body>
</html>