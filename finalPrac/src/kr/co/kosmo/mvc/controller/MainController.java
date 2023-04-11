package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	//Aop가 적용되어서 /main/index.jsp에서 ${today} 사용 가능 !
	@RequestMapping(value= {"/","/main"})
	public ModelAndView main() {
		//return "main/index";
		ModelAndView mav = new ModelAndView("main/mainbody");
		return mav;
	}

//===========================================================	
	//회원가입 페이지 이동(멤버 or 호스트)
	@GetMapping(value = "/chooseSignup")
	public ModelAndView chooseSignup() {
		ModelAndView mav = new ModelAndView("main/chooseSignupForm");
		return mav;
	}
	
//===========================================================	
	//로그인 페이지 이동(멤버 or 호스트)
	@GetMapping(value = "/chooseLogin")
	public ModelAndView chooseLogin() {
		ModelAndView mav = new ModelAndView("main/chooseLoginForm");
		return mav;
	}
	
}
