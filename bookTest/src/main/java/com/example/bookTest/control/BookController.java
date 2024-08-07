package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv= new ModelAndView("index");
		
		return mv;
	}
	
	@GetMapping("/bookWrite")
	public ModelAndView write() {
		ModelAndView mv = new ModelAndView("book/bookForm");
		mv.addObject("count", 5);
		
		
		return mv;
	}
	
	@PostMapping("/enroll")
	public String write(@ModelAttribute BookDto bookDto) {
		// form 태그 안에 입력한 값은 BookDto 클래스의 객체에 저장 되어있다.
		// 데이터베이스에 저장하려면 BookDto객체를 DAO에 넘겨서 저장하면 된다.
		// 컨트롤 -> service -> DAO 
		return "index";
	}

}
