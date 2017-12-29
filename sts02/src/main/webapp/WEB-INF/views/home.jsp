<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home~</title>
<!-- 부트스트랩 쓰려면 임포트를 해야하는데 문제는 -->

<!-- Bootstrap -->
    <!-- <link href="resources/css/bootstrap.min.css" rel="stylesheet"> -->
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
   <!--  <script src="resources/js/bootstrap.min.js"></script>-->
   <script src="js/bootstrap.min.js"></script>
    
    
    
</head>
<body>

<div class="container">
	<div class="row">
	 	<div class="col-md-12">
	 		<div class="jumbotron">
		 			<h1>home.jsp 메인 </h1>
		 			<p>테이블 내용 출력</p>
		 		<p><a class="btn btn-primary btn-lg" href="./add" role="button">글쓰기</a></p>
		 												<!-- ^확장명 노필요. ./add나 /add 면 ㅇㅋ -->
			</div>
	 	</div>
	</div>
	
	<div class="row">
	 	<div class="col-md-12">
	 		<table class="table">
	 			<tr>
	 				<th>ㅅㅂ</th>
	 				<th>ㅇㄹ</th>
	 				<th>ㄴㅉ</th>
	 				<th>ㄱㅇ</th>
	 			</tr>
	 <c:forEach items="${list }" var="bean">			
	 			<tr>
	 				<td><a href="./detail?idx=${bean.sabun }">${bean.sabun }</a></td>
	 				<td><a href="./detail?idx=${bean.sabun }">${bean.name }</a></td>
	 				<td><a href="./detail?idx=${bean.sabun }">${bean.nalzza }</a></td>
	 				<td><a href="./detail?idx=${bean.sabun }">${bean.pay }</a></td>
	 			</tr>
	 </c:forEach>			
	 		</table>
	 	</div>
	</div>
</div>
	
</body>
</html>