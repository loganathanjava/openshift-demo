package com.logan.openshiftdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String ping() {
		return "Demo service is working properly: " + System.currentTimeMillis();
	}
	
}
