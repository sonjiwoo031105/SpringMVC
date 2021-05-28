package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sub2")
public class TestController {	
	@RequestMapping(value="/test5", method=RequestMethod.GET)
	public String test1() {
		return "/sub2/test5";
	}
	@RequestMapping(value="/test6", method=RequestMethod.GET)
	public String test2() {
		return "/sub2/test6";
	}
	
}
