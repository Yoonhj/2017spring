<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> list page</h1>
	
	<table>
		<tr>
			<th>사번</th>			
			<th>이름</th>			
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<!-- 스트럿츠 jstl을 만들어냈듯이 스프링 jstl이 있는데 범용성땜에 일반 jstl쓴다고
		근데 스트럿츠에서 그런걸 썼다고....? -->
		<c:forEach items="${list}" var="bean">
		<tr>
			<td><a href="">${bean.sabun }</a></td>
			<td><a href="">${bean.name}</a></td>
			<td><a href="">${bean.nalzza}</a></td>
			<td><a href="">${bean.pay}</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>