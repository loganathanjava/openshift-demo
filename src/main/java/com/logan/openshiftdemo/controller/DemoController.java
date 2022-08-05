package com.logan.openshiftdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

	@GetMapping("/")
	public ModelAndView ping() {
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	
}
