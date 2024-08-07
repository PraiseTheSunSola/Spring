package com.example.bookTest.control;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {
	private String bookTitle;// 책 제목
	private String bookAuthor; // 저자
	private String bookCost; // 가격
	private String bookPage; // 페이지수
	private String publisher; // 출판사 
}
