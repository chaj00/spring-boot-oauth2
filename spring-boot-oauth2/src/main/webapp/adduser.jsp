<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����� ���</h1>
	<div>
		<form action="/api/create" method="post" > 
			<label for="username">���̵�</label>
			<input type="text" id="username" name="username">
			
			<label for="password">��ȣ</label>
			<input type="text" id="password" name="password">
			
			<input type="submit" value="���">
		</form>
	</div>
</body>
</html>