package com.vastika.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping(value = {"/", "home"})
	public String getHomepage() {
		return "home";
  	}
}
