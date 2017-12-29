<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

  <!-- Bootstrap -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../resources/js/bootstrap.min.js"></script>
</head>
<body>


<!-- 상단 배너 메뉴 -->


<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
	     <div class="navbar-header ">
	        
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
     	 </button>
     	 <a class="navbar-brand" href="#">븻쿅</a>
     	 
	 </div>
	       	 
     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav ">
        <li class=""><a href="../">HOME <span class="sr-only">(current)</span></a></li>
       
        <li class="active">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Guest <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="../guest">글목록</a></li>
           		 <li role="separator" class="divider"></li>
            <li><a href="../guest/add">글쓰기</a></li>
            	 <li role="separator" class="divider"></li>
 
          </ul>
        </li>
      </ul>
      </div>
	     
	  
   
     	 <!-- 내용 -->
 <div class="container">
    <div class="row">
  		<div class="col-sm-12">
  		<div class="jumbotron">
  <h1>detail 페이지</h1>
  <p> ${bean.sabun } 의 상세상세</p>
  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
</div>

div class="row">
  		<div class="col-sm-12"> 
  		<p class="bg-info">
  				<span>사번</span>
  				<span>${bean.sabun }</span>
  			</p>
  			<p class="bg-info">
  				<span>이름</span>
  				<span>${bean.name }</span>
  			</p>
  			<p class="bg-info">
  				<span>날짜</span>
  				<span>${bean.nalzza }</span>
  			</p>
  			<p class="bg-info">
  				<span>페이</span>
  				<span>${bean.pay }</span>
  			</p>
  			<p>
  				<a href="/ex03/guest/${bean.sabun }/edit">수정</a>
  				<a href="/ex03/guest/${bean.sabun }/delete">삭제</a>
  			</p>
		</div>
 </div>





  		</div>
  	</div>
  	
  	<div class="row">
  		<div class="col-sm-12"> 하단 카피라이터입니다...  </div>
  	</div>
  	
 </div>
    	
    	
    	
    	
    	
    	
  </div>
</nav>

</body>
</html>