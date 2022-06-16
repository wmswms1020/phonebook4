<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정</h1>
	
	<h2>수정폼</h2>
	
	<p>전화번호를 수정하려면<br>
		아래항목을 기입하고 "수정" 버튼을 클릭하세요
	</p>
	
	<form action="/phonebook4/update" method="get">
		이름(name) <input type="text" name="name" value="${personVo}"><br>
		핸드폰(hp) <input type="text" name="hp" value="${personVo}"><br>
		회사(company) <input type="text" name="company" value="${personVo}"><br>
		
		<button type="submit">수정</button>
	</form>
	
</body>
</html>