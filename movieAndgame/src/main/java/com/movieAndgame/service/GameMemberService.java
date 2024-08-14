package com.movieAndgame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieAndgame.Dao.GameMemberDao;
import com.movieAndgame.Dto.GameMemberDto;

@Service
public class GameMemberService {

	@Autowired
	private GameMemberDao gameMemberDao;
	
	public void signUpSave(GameMemberDto gameMemberDto) {
		gameMemberDao.insert(gameMemberDto);
	}
}
