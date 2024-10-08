<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>도서관리</title>

<link rel="stylesheet" href="/css/default.css">

</head>
<body>

	
	
	<!-- 
		클래스명
		
		컨트롤 : CoffeControl
		서비스 : CoffeService
		DTO : CoffeDto
		DAO : CoffeDao
	
	 -->
	 
	

	<div id="wrap">
		<h2> 도서관리 </h2>
		
		<div id="mainTitle">
		 <h3>등록 도서 목록</h3>
		 <a href="/bookWrite" id="enroll">도서등록</a>
	  </div>
	  <div id="bookListWrap">
	   <ul id="bookList">
	      <c:forEach var="row" items="${list }">
	      <li class="blist">
	       <span class="title">
	       <a href="/book/view?id=${row.bookId }"> ${row.bookTitle } </a>
	       </span>
	       <span class="auth">${row.bookAuthor}</span>
	       <span class="bookCode">${row.bookId }</span>
	       <span class="category">${row.publisher }</span>
	     </li> 
	     </c:forEach>
	     
	     <li class="blist">
	       <span class="title">아르토리우스의 검술 훈련</span>
	       <span class="auth">아르토리우스</span>
	       <span class="bookCode">ㄱㅅ45687</span>
	       <span class="category">검술</span>
	     </li> 
	     
	     <li class="blist">
	       <span class="title">인간성의 상실</span>
	       <span class="auth">인간성</span>
	       <span class="bookCode">ㅇㄱㅅ874864</span>
	       <span class="category">철학</span>
	     </li> 
	     
	     <li class="blist">
	       <span class="title">투메르지하세계 탐험</span>
	       <span class="auth">투메르인</span>
	       <span class="bookCode">ㅊ46ㅌ66452</span>
	       <span class="category">탐험</span>
	     </li> 
	     
	     <li class="blist">
	       <span class="title">왜 도네이션을 하는가?</span>
	       <span class="auth">형준</span>
	       <span class="bookCode">ㅌㄴ35431</span>
	       <span class="category">에세이</span>
	     </li> 
	      
	      
	   </ul>
	   	  
	  </div>
	</div>

</body>
</html>