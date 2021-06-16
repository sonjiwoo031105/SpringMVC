package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.DataDTO;
import kr.hs.study.model.dto.LoginDTO;
import kr.hs.study.model.dto.modelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		System.out.println(data1 + data2 );
		//view의 test1.jsp파일을 실행한다.
		return "test1";
	}
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	
	@PostMapping("/test3")
	public String test3(LoginDTO dto, Model model) {
		model.addAttribute("id",dto.getUserID());
		model.addAttribute("pw",dto.getUserPass());
		return "test3";
	}
	@GetMapping("/test4")
	public String test4(Model model) {
		model.addAttribute("a","100");
		model.addAttribute("b","2000");
		
		return "test4";
	}
	@GetMapping("/test5")
	public ModelAndView test5(ModelAndView mv) {
		mv.addObject("id", "kim");
		mv.addObject("password","1111");
		mv.setViewName("test5");
		return mv;
	}
	@GetMapping("/test6")
	public String test6(@ModelAttribute("test") DataDTO dto) {
		                //내부적으로 new연산으로 객체가 만들어지면서, setter로 값이 자동으로 주입됨
		                //객체이름 자동적으로 dataDTO가 된다
		
		return "test6";
	}
	
}
