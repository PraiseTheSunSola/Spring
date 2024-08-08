package com.example.bookTest.control;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto { // DTO는 사용자 데이터 처리하기 위한 클래스 
	private int bookId;
	private String bookTitle;// 책 제목
	private String bookAuthor; // 저자
	private int bookCost; // 가격
	private int bookPage; // 페이지수
	private String publisher; // 출판사 
}
