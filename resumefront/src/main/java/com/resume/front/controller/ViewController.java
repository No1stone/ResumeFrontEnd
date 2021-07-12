package com.resume.front.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

	private static final Logger log = LoggerFactory.getLogger(ViewController.class);

	@RequestMapping(value="/")
	public String login() {
	  
		log.info("index: ----{}");
		
	    return "index";
	}
	
	
	@RequestMapping(value="/kakao")
	public String login(@RequestParam("code") String code) {
	  
		log.info("kakaoCode: ----{}",code);
		
	    return "dashboard";
	
}
}

