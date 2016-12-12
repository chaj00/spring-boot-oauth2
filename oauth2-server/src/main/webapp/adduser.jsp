<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 등록</h1>
	<div>
		<form name=userform action="/create" method="post" > 
			<label for="username">아이디</label>
			<input type="text" id="username" name="username">
			
			<label for="email">이메일</label>
			<input type="text" id="email" name="email">
			
			<label for="password">암호</label>
			<input type="password" id="password" name="password">
			
			<input type="submit" value="등록">
		</form>
	</div>
</body>
</html>