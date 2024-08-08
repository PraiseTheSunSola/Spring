package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.Dto.CoffeDto;
import com.example.bookTest.service.CoffeService;


@Controller
public class CoffeControl {

	@Autowired
	private CoffeService coffes;
	
	@GetMapping("/coffe")
	public ModelAndView home() {
		ModelAndView cf= new ModelAndView("coffe/index");
		
		List<CoffeDto> list = coffes.selectAll();
		cf.addObject("Menu", list);
		
		return cf;
	}
	
	
	@GetMapping("/coffeReg") 
		public String coffeMenu() {
			return "coffe/coffeForm";
		}
	
	
	@PostMapping("/coffeSave")
	public String menuSave(@ModelAttribute CoffeDto coffeDto) {
		coffes.coffeSave(coffeDto);
		return "redirect:/coffe";
	}
	
	
	
	
	
	}
	

