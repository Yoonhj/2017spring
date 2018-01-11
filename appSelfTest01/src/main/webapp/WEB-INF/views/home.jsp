<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile-1.4.5.css">
<script type="text/javascript" src="resources/js/jquery-1.12.4.min.js"></script>


<script type="text/javascript">

$(document).ready(function(){ //도큐먼트가 완료됨
	console.log('document 레디 시점1');
	
});

$(document).on("mobileinit", function(){
	
	console.log('document 모바일 인잇 시점');
	//모바일 제이쿼리 들어가기 전에 얘가 들어가야 발동가능
	$.mobile.defaultPageTransition="slide"; //공통적으로 트랜지션을 슬라이드로 줘버릴 수 있음
	
	$.mobile.loadingMessage="글자로도 로딩 표시 가능!";
	
/* 	$(document).on("pagebeforeload", function(){ //
		console.log('페이지 로드전에!');
	});
	
	$(document).on("pageload", function(){
		console.log('페이지 로드에!');
	});
	
	$(document).on("pageloadfailed", function(){
		console.log('페이지 로드 실패에!');
	}); */
	
	
	$(document).on("pagebeforeload", function(event, data){ //
		console.log('페이지 로드전에!', data.dataUrl);
	});
	
	$(document).on("pageload", function(event, data){
		console.log('페이지 로드에!', data.dataUrl);
	});
	
	$(document).on("pageloadfailed", function(event, data){
		console.log('페이지 로드 실패에!', data.dataUrl);
	});
	
	$(document).on("pagecreate", function(){
		console.log('페이지 생성시');
	});
	
	
	$(document).on("pageinit", function(){
		console.log('페이지 인잇');
	});
	
	$(document).on("pagebeforecreate", function(){
		console.log('페이지 생성전');
	});
		
	$(document).on("pageremove", function(){
		console.log('페이지 지우기');
	});
	

	$(document).on("pagehide", function(event, ui){
		console.log('페이지 숨김',  ui.nextPage);
	});

	$(document).on("pagebeforehide", function(event, ui){
		console.log('페이지 숨기기 전', ui.nextPage);
	});
	
	$(document).on("pageshow", function(event, ui){
		console.log('페이지 보여주기', ui.nextPage);
	});
	
	$(document).on("pagebeforeshow", function(event, ui){
		console.log('페이지 보여주기 전', ui.nextPage);
	});
	
	
	
	
});

</script>


<script type="text/javascript" src="resources/js/jquery.mobile-1.4.5.js"></script>


<script type="text/javascript">
	
	$(document).ready(function(){ //도큐먼트가 완료됨
		console.log('document 레디 시점2');
		
	});

	
</script>


</head>
<body>
	<div data-role="page" id="index">
		<div data-role="header">
			<h1>jqm</h1>
		</div>
		<div data-role="content">
			<ul data-role="listview">
				<li>
					<a href="ex01">ex01</a>
				</li>
				<li>
					<a href="ex02">ex02</a>
				</li>
				<li>
					<a href="ex03">ex03</a>
				</li>
				<li>
					<a href="ex04">ex04</a>
				</li>
				<li>
					<a href="ex05">ex05</a>
				</li>
				<li>
					<a href="ex06">ex06</a>
				</li>
				<li>
					<a href="ex07">ex07</a>
				</li>
				<li>
					<a href="ex06.jsp">err</a>
				</li>
			</ul>
		</div>
		<div data-role="footer"></div>
	
	</div>
</body>
</html>