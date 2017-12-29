<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add~</title>
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
	 			<h1>detail </h1>
	 			<p>상세내용</p>
	 		</div>
	 	</div>
	</div>
	
		<div class="row">
	 	<div class="col-md-12">
	 		<div class="page-header">
	 			<h2>${bean.name } <small> 사번 ${bean.sabun }님의 정보</small></h2>
	 			<p>날짜: ${bean.nalzza }</p>
	 			<p>금액: ${bean.pay }</p>
	 			
	 			<div class="btn-group btn-group-justified" role="group" aria-label="...">
		 			<p><a role="button" class="btn btn-primary" href="./edit?idx=${bean.sabun }">수정</a></p>
		 			<p><a role="button" class="btn btn-primary" href="./delete?idx=${bean.sabun }">삭제</a></p>
		 		</div>
	 		</div>

	 	</div>
	</div>
	
</div>
</body>
</html>