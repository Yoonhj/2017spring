<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>detail</h1>
	
	<div>
		<span>사번</span>
		<span>${bean.sabun }</span>
	</div>
	<div>
		<span>이름</span>
		<span>${bean.name}</span>
	</div>
	<div>
		<span>날짜</span>
		<span>${bean.nalzza}</span>
	</div>
	<div>
		<span>금액</span>
		<span>${bean.pay}</span>
	</div>
	<div>
		<a href="edit.do?idx=${bean.sabun}">수정</a>
		<a href="del.do?idx=${bean.sabun}">삭제</a>
	</div>
</body>
</html>