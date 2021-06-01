package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "/WEB-INF/views/index.jsp";
	}

	/*
	 * @RequestMapping(value="/test1", method=RequestMethod.GET) public String
	 * test1() { return "test1"; }
	 * 
	 * @RequestMapping(value="/test2", method=RequestMethod.GET) public String
	 * test2() { return "test2"; }
	 * 
	 * @RequestMapping(value="/sub1/test3", method=RequestMethod.GET) public String
	 * test3() { return "sub1/test3"; }
	 * 
	 * @RequestMapping(value="/sub1/test4", method=RequestMethod.GET) public String
	 * test4() { return "sub1/test4"; }
	 */
	@RequestMapping(value="/test5", method=RequestMethod.GET)
	public String test5() {
		//return "WEB-INF/views/test6.jsp" 상대경로 기준위치: 현재 나의 위치 sub1/WEB-INF/views/test6
		return "/WEB-INF/views/test5.jsp"; //절대경로 root부터(webapp부터) 시작
	}
	@RequestMapping(value="/sub1/test7", method=RequestMethod.GET)
	public String test7() {
		return "/WEB-INF/views/sub1/test7.jsp"; //절대경로 root부터(webapp부터) 시작
	}
}
