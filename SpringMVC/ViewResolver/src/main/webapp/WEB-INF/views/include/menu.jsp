<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">

<title>Insert title here</title>
</head>
<body>
<a href="/test1?data1=1000&data2=2000">Param���� �ޱ�</a> &nbsp;&nbsp;
<a href="/test4">model�� �ޱ�</a>&nbsp;&nbsp;
<!-- ModelAndView: ���� �����ϴ� (Model) ��� + view�̸��� ���� (view) -->
<a href="/test5">modelAndView�� �ޱ�</a>&nbsp;&nbsp;
<a href="/test6?data1=1000&data2=2000&data3=3000">ModelAttribute �ڵ�����</a>
</body>
</html>