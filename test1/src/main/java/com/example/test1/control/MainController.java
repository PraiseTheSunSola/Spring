package com.example.test1.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.LoginDto;
import com.example.test1.DTO.MemberDto;

import jakarta.servlet.http.HttpServletRequest;

// import jakarta.servlet.http.HttpServletRequest;는 아파치 서버가 가지고 있는거

@Controller
public class MainController {
	
	// JSP MVC 패턴 주소 맵핑
	// 주소패턴과 서블렛클래스 연결(web.xnl)
	// 주소패턴이 다양하면 서블렛클래스 갯수도 늘어난다.
	// 주소요청을 처리할 메서드 지정을 위해 Map, poperties 같은 주소와 메서드를
	// 1:1 지정하여 처리하기위한 객체 또는 파일이 필요하다.
	// 어떤 주소요청인지 파악하기 위한 코드와 실행 코드도 작성해야한다. 
	
	// 스프링에서의 주소 맵핑( 요청주소와 처리내용을 연결하는 작업 )
	// @Controller 클래스에 지정
	// 요청방식에 따른 주소 맵핑 -> @GetMapping("/")
	// 요청주소 처리할 메서드 정의와 반환값으로 보여줄 페이지 이름
	
	@GetMapping("/test")
	public String testFirst() {
		return "test";
	}
	
	@GetMapping("/sun.g")
	public String testTwo() {
		return "login";
	}
	
	@GetMapping("/signUp")
	public String testThree() {
		return"member/signUp";
	}
	
	// 요청하는 방식을 메서드로 했으니 마찬가지로 post로 하면 다르게 작동한다. 
	
	//form 데이터 받아오는 방법 1.
//	@PostMapping("/signUp")
//	public String signUpSave(@RequestParam("id") String id,
//		@RequestParam("pw") String pw, @RequestParam("tel") String tel,
//		@RequestParam("birth")String birth){
//		
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(tel);
//		System.out.println(birth);
//		
//		return "member/signUp";
//	}
	
	// 주소 요청: /signUp
	// 뷰 페이지: member/signUp.jsp
	// 뷰 페이지 내용: 아이디, 비밀번호, 연락처, 생년월일 입력
	
	
	
	
	// form 데이터 받아오는 방법 2. 범용이 아닌 특정 데이터만 받아올수 있음
	// 데이터 베이스 저장까지 생각하면 이 방법 괜춘 
	
//	@PostMapping("/signUp")
//	public String signUpSave(@ModelAttribute MemberDto memberDto) {
//		
//		System.out.println("두번째 방법:"+memberDto.getId());
//		
//		return "member/signUp";
//	}
	
	
	// form 데이터 받아오는 방법 3. 범용적으로 데이터 다 받아올순 있지만 db 운용이 번거로움 
	// 파라미터의 이름과 값을 저장한다. => Map으로 받아온다. 
	@PostMapping("/signUp")
	public String signUpSave(@RequestParam Map<String, String> pm) {
	
		System.out.println(" 세번째 방법: " + pm.get("id") );
		
		// input 태그의 name을 키로 받아옴 
		return "member/signUp";
	}

	// form 데이터 받아오기 실습
	// 내용 : 로그인을 위해 로그인 페이지에서 아이디와 비밀번호를 입력하고
	// 		 로그인 버튼을 클릭한다. 
	
	// DTO 클래스 : LoginDto
	// 뷰 페이지 : login.jsp - 로그인 from 페이지
	// 			 loginResult.jsp - 로그인 후 보여줄 페이지
	// 		loginResult.jsp에 <a href="/test"> 페이지 이동 </a> 넣기
	
	// 요청 주소 및 방식 : 로그인페이지 - GET방식 , /login
	// 				   로그인처리 - POST방식,  /login

	@GetMapping("/login")
	public String loginPage() {
		
		return "login";
	}
	
	
	@PostMapping("/login")
	public String loginPage(@ModelAttribute LoginDto loginDto) {
		
		System.out.println(loginDto.getId());
		System.out.println(loginDto.getPw());
		
		return "loginResult";
	}
	
	//요청방식에 따른 주소 맵핑 -> @GetMapping("/")
	// 요청주소 처리할 메서드 정의와 반환값으로 보여줄 페이지 이름
	
	@GetMapping("/") // () 안에 /만 넣으면 사이트 메인을 보여주겠다는것 처음 위치 
	public ModelAndView home() {
		String title="우타는 영원히 잠들어있는 것입니까 오다센세?";
		ModelAndView mv = new ModelAndView("index"); //ModelAndView객체 생성하면서
											  // 뷰페이지 입력
		
		mv.addObject("pageTitle", title);
		return mv;
	}
	

	
} // end 


	// 자바빈을 사용하는데 있어서 반드시 지켜야하는 것들

	// 클래스의 인스턴스변수는 input의 name과 일치 시켜준다.
	// 클래스의 기본생성자 메서드가 필요하다.
	// 인스턴스변수의 get, set 메서드
	// 인스턴스변수의 제어자는 private
	
	


