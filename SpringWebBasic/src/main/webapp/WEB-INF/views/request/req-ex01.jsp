<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		이거 돼??
		
	</p>
	
	<h2>Request 컨트롤러를 이용한 요청 처리 작업중</h2>
	
	<form action="/basic/request/basic01">
	<!-- form action태그는 폼 데이터를 받아 처리하는 웹페이지의 URI를 설정한다. -->
		<input type="submit" value="GET 요청!">
	</form>
	
	<form action="/basic/request/basic01" method="post">
		<input type="submit" value="POST 요청!">
	</form>

</body>
</html>