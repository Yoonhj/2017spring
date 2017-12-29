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
	 			<h1>add </h1>
	 			<p>입력 내용 작성 ㄱ</p>
	 		</div>
	 	</div>
	</div>
	
		<div class="row">
	 	<div class="col-md-12">
	 	
 <!-- form start -->	
<form class="form-horizontal" method="post" action="./insert">

  <div class="form-group">
    <label for="sabun" class="col-sm-2 control-label">sabun</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="sabun" name="sabun" placeholder="sabun">
    </div>
  </div>
 
  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name"  placeholder="name">
    </div>
  </div>
  
   <div class="form-group">
    <label for="nalzza" class="col-sm-2 control-label">nalzza</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nalzza" name="nalzza" placeholder="nalzza">
    </div>
  </div>
  
   <div class="form-group">
    <label for="pay" class="col-sm-2 control-label">pay</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="pay" name="pay" placeholder="pay">
    </div>
  </div>
 
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">작성하기</button>
       <button type="submit" class="btn btn-default">취소</button>
    </div>
  </div>
</form>
<!-- form end -->


	 	</div>
	</div>
	
</div>
</body>
</html>