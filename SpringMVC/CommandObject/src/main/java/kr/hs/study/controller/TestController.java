package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.modelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		System.out.println(data1 + data2 );
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2form(){
		return "test2-form";
	}
	
	/*
	 * @PostMapping("/test2") public String test2(@ModelAttribute modelDTO dto) {
	 * //자동으로 ModelDTO의 객체가 만들어진다(Model DTO dto = new ModelDTO()) String id =
	 * dto.getData1("id"); String pw = dto.getData2("passwd");
	 * System.out.println("userid: " + id + "password : " + pw); return "result"; }
	 */
	
	@GetMapping("/test3")
	public String test3(HttpServletRequest request) {
		String a = request.getParameter("data1");
		String b[] = request.getParameterValues("data2");
		System.out.println("a: " + a );
		for(String value:b) {
			System.out.println("b:"+value);
		}
		return "result";
	}
	
	
	
	
}
