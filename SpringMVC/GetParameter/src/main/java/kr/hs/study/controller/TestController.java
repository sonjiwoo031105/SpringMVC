package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.println(a + b + c);
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c[] = request.getParameterValues("c");
		System.out.println("a: " + a + "b: " + b);
		for(String value:c) {
			System.out.println("c:"+value);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.println(a+b+c);
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4form(){
		return "test4-form";
	}
	
	@PostMapping("/test4")
	public String test4(WebRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		System.out.println("userid: " + id + "password : " + pw);
		return "result";
	}
	
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		System.out.println("a:"+a);
		System.out.println("b:" +b);
		System.out.println("c:"+c);

		return "result";
	}
}
