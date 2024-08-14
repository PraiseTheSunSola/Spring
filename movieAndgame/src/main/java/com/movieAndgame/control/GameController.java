package com.movieAndgame.control;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameMemberDto;
import com.movieAndgame.Dto.MovieMember;

@Controller
@RequestMapping("/game")
public class GameController {

	// localhost/game/index 매핑
	@GetMapping("/index")
	public String home(Model model) {
		
		return "game/index";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("gameMember" , new GameMemberDto());		
		return "game/member/login";
	}
	
	// 회원가입 페이지 요청
	@GetMapping("/signUp")
	public String signUp(Model model) {
		model.addAttribute("gameMemberDto" , new GameMemberDto());
		return "game/member/join";
	}
	
	//회원가입 작성 후 요청
	@PostMapping("/signUp")
	public String signup(@Valid GameMemberDto gameMemberDto,
		BindingResult bindingResult , Model model) {
	 if(bindingResult.hasErrors()) {
		 System.out.println("유효하지 않은 값이 입력되었다.");
		 
		 return "game/member/join";
	 
	 }
		return "redirect/game/join";
	}
}