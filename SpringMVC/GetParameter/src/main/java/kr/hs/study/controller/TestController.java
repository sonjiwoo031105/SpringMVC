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
	
	@GetMapping("/test6")
	public String test6(@RequestParam (value="a") int aa, @RequestParam int b, @RequestParam String c[], @RequestParam (required=false) String d ) {
		System.out.println("a:"+aa);
		System.out.println("b:"+b);
		for(String value:c) {
			System.out.println("c:"+value);
		}
		return "result";
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam Map<String,String> map) {
		String a = map.get("a");
		String b = map.get("b");
		String c = map.get("c");
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		return "result";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam Map<String,String> map, @RequestParam List<String> c) {
		String a = map.get("a");
		String b = map.get("b");
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		for(String val:c) {
			System.out.println("c:"+val);
		}		
		return "result";
	}
	
	@GetMapping("/test9")
	public String test(modelDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
	
}
