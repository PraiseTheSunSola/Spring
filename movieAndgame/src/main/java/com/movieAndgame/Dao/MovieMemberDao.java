package com.movieAndgame.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.MovieMember;

@Mapper
public interface MovieMemberDao {

	public int insert(MovieMember movieMember); // 회원가입 데이터 저장 
	public List<String> findAllEmail(); // 전부 가져올것이어서 매개변수 필요없음
	public MovieMember login(MovieMember movieMember); // 로그인 처리 
	
} 
