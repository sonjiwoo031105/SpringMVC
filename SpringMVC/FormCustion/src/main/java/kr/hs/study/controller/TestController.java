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

import kr.hs.study.model.dto.LoginDTO;

@Controller
public class TestController {
	@GetMapping("test1")
	public String test1(LoginDTO dto) { //∞¥√º¿Ã∏ß: loginDTO
		dto.setUser_name("±Ë");
		dto.setUser_id("kim");
		dto.setUser_pw("1111");
		dto.setUser_postcode("1234");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("546 road");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(LoginDTO dto) {
		dto.setUser_name("lee");
		dto.setUser_id("lee_id");
		dto.setUser_pw("1111");
		dto.setUser_postcode("1234");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("546 road");
		return "test2";
	}
	
}
