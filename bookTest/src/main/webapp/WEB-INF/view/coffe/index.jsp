<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/default.css">

</head>
<body>
	 
	 <div id="wrap">
		<h2> 메뉴 </h2>
		
		<div id="mainTitle">
		 <h3>등록 메뉴 목록</h3>
		 <a href="/coffeReg" id="enroll">메뉴등록</a>
	  </div>
	  <div id="bookListWrap">
	   <ul id="bookList">
	     <c:forEach var="row" items="${Menu }">
	     <li class="blist">
	        <span class="coffeCode">${row.coffeId }</span>
	       <span class="name">${row.item_name}</span>
	       <span class="price">${row.price }</span>
	       <span class="decaffein">${row.decaffein }</span>
	     </li> 
	     </c:forEach>
	     
	     
	     <li class="blist">
	       <span class="itemname">태양만세 하는법</span>
	       <span class="price">솔라</span>
	       <span class="decaffein">ㅌㅊㅁㅅ1234</span>
	     </li> 
	     

	      
	   </ul>
	   	  
	  </div>
	</div>
	 
</body>
</html>