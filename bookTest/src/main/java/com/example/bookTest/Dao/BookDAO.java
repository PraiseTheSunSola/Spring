package com.example.bookTest.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.control.BookDto;



@Repository // 서블렛 클래스 보다 더 쉽고 자유롭게 사용할 수 있음. 이걸 적어준느 것만으로 애노테이션은 자주 사용된다. 
public class BookDAO {
	// 메이븐 사이트가서 레퍼지토리 가져올거임 
	
	private final JdbcTemplate jt;
	
	@Autowired // 이걸 사용해야 자바빈으로 등록된걸 알아서 불러와서 jdbcTemplate의 정보를 불러온다. 
	public BookDAO( JdbcTemplate jdbcTemplate) {
		this.jt = jdbcTemplate;
	}
	
	// book 테이블 전체 데이터 가져오기 - 첫화면에 목록으로 출력하기 위해
	
	public List<BookDto> select() { 
		String sql="select * from book";
		
		List<BookDto> list = jt.query(sql, new BookDtoRowMapper() );
		
		return list;
	}
	
	public void insert(BookDto bookDto) { // 도서정보 데이터베이스에 저장 
		
		String sql="insert into book(book_title, book_author," + 
					"book_cost, book_page, publisher) values(?,?,?,?,?)";
		
		jt.update(sql , bookDto.getBookTitle(), bookDto.getBookAuthor(),
				bookDto.getBookCost(), bookDto.getBookPage(),
				bookDto.getPublisher());
	}
	
	public class BookDtoRowMapper implements RowMapper<BookDto>{
		
		@Override
		public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookDto bookDto = new BookDto();
			bookDto.setBookAuthor(rs.getString("book_author"));
			bookDto.setBookCost(rs.getInt("book_cost"));
			bookDto.setBookPage(rs.getInt("book_page"));
			bookDto.setBookTitle(rs.getString("book_title"));
			bookDto.setPublisher(rs.getString("book_id"));
			return bookDto;
		}
	}
}
