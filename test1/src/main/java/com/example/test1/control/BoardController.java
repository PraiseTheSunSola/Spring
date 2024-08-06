package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.WriteDto;

@Controller
public class BoardController {

	@GetMapping("/board")
	public ModelAndView boardHome() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardList");
		
		return mav;
	}
	
	@GetMapping("/boardWrite") 
		public String writePage() {
			
		
			return "board/write";
			
		}
	
	
	// 페이지 뿐만 아니라 페이지에 담긴 데이터들도 제공하려면 ModelAndView 이용 
	
	@PostMapping("/write")
		public ModelAndView writePage(@ModelAttribute WriteDto writeDto ) {
		
			ModelAndView mv = new ModelAndView("board/view");
			mv.addObject("data", writeDto); // 제목 작성자 내용 비번이 writeDto에 들어있음
			return mv;
	}
		

	
} // end
	
	
	
	
	
	
	
	

