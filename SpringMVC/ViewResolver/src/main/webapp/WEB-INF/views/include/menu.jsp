<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">

<title>Insert title here</title>
</head>
<body>
<a href="/test1?data1=1000&data2=2000">Param으로 받기</a> &nbsp;&nbsp;
<a href="/test4">model로 받기</a>&nbsp;&nbsp;
<!-- ModelAndView: 값을 세팅하는 (Model) 기능 + view이름을 지정 (view) -->
<a href="/test5">modelAndView로 받기</a>&nbsp;&nbsp;
<a href="/test6?data1=1000&data2=2000&data3=3000">ModelAttribute 자동주입</a>
</body>
</html>