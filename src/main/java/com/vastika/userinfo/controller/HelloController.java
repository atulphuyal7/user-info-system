package com.vastika.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value = "/greet")
	public String sayHello() {
		return "hello";
	}

	@RequestMapping(value = "/hi")
	public String sayHi() {
		return "hello";
	}
}