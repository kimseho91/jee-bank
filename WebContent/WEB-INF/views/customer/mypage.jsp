<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
마이페이지
<h2>환영합니다. ${customer.name}님</h2>
		<h3>	아이디 ${customer.id}</h3><br/>
		<h3>	비번 ${customer.pw}</h3><br/>
		<h3>	주민번호 ${customer.ssn}</h3><br/>
		<h3>	신용도 ${customer.credit}</h3><br/>
</body>
</html>