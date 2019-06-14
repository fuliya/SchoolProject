package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration() {
		return "Student_Registration";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	/*
	 * @RequestMapping("/welcome") public ModelAndView firstPage() { return new
	 * ModelAndView("welcome"); }
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login");
	    return modelAndView;
	}
}
      