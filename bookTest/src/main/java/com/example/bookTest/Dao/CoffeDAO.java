package com.example.bookTest.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.Dto.CoffeDto;

@Repository // 데이터 베이스 다루는 클래스라서 이걸 씀 
public class CoffeDAO {
	
	private final JdbcTemplate coffe;
	
	@Autowired
	public CoffeDAO( JdbcTemplate jdbcTemplate) {
		this.coffe = jdbcTemplate;
	}

	public List<CoffeDto> select() {
		String sql="select * from coffe";
		
		List<CoffeDto> list = coffe.query(sql, new CoffeDtoRowMapper());
		
		return list;
	}
	
	
	
	
	
	public void save(CoffeDto coffeDto) {
		
		String sql="insert into coffe(item_name, price," + "decaffein) "
				+ "values(?,?,?)";
		
		coffe.update(sql, coffeDto.getItem_name(),coffeDto.getPrice(),
				coffeDto.getDecaffein());
	}
	
	public class CoffeDtoRowMapper implements RowMapper<CoffeDto> {

		@Override
		public CoffeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			CoffeDto coffeDto = new CoffeDto();
			coffeDto.setCoffeId(rs.getInt("coffe_id"));
			coffeDto.setItem_name(rs.getString("item_name"));
			coffeDto.setPrice(rs.getInt("price"));
			coffeDto.setDecaffein(rs.getInt("decaffein"));
			
			
			return coffeDto;
		}
		
	}
	
	
	
}
