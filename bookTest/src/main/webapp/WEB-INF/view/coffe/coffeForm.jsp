<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 주문 작성</title>
<link rel="stylesheet" href="/css/write.css">
</head>
<body>

		<div id="wrap">
			<a href="/">HOME</a>
			<h3 id= "enrollCount">${count } 주문완료</h3>
		
		
		<form method="post" action="/coffeSave">
				<div id= "formWrap">
				  <div class="inputField">
					<label for="coffeTitle">메뉴 이름 </label>
					<input type="text" name="item_name" id="item_name">
				  </div>
				   <div class="inputField">
					<label for="coffeprice">가격</label>
					<input type="number" name="price" id="price">
				  </div>
				   <div class="inputField">
					<label for="decaffein">디카페인 </label>
					<input type="radio" name="decaffein" value="0" checked>카페인
					<input type="radio" name="decaffein" value="1">디카페인
				  </div>
				  <button id="bt">주문</button>
				  </div>
		  </form>
		  
	</div>	

</body>
</html>