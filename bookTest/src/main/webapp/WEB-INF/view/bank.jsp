<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
			<h1> 출력하고 싶은 금액을 적으시오</h1>
			
			<form method="post" action="/result">
			은행명 : <input type="text" name="bank"> <br>
			잔액 : <input type="text" name="money"> <br>
			<button>출금</button>
			</form>

</body>
</html>