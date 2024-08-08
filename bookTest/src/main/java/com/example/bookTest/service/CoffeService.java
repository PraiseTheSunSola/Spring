package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.Dao.CoffeDAO;
import com.example.bookTest.Dto.CoffeDto;

@Service
public class CoffeService {

	private final CoffeDAO coffeDAO;
	
	@Autowired
	public CoffeService(CoffeDAO coffeDAO) { // dto 데이터를 데이터베이스에 저장해야하니 DAO에 전달해줌
		this.coffeDAO=coffeDAO;
	}
	
	
	public List<CoffeDto> selectAll() {
		return coffeDAO.select();
	}
	
	public void coffeSave(CoffeDto coffeDto) {
		
		if(coffeDto !=null) { 
			
			coffeDAO.save(coffeDto);
		}
	}
	
	
}
