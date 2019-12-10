package com.boot.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*@RequestMapping("home1")
	public String home() {
		return "home1.jsp";
	}*/
	
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String name) {
		ModelAndView md = new ModelAndView();
		//md.addObject("home");
		md.setViewName("home");
		md.addObject("username", name);
		return md;
	}
	
}
