package com.vastika.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vastika.userinfo.model.User;
import com.vastika.userinfo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/add_user", method = RequestMethod.GET)
	  public String getUserFrom() {
		return "addUser";
	}
	
	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user) {
		userService.saveUser(user);
		return "addUser";
	}
	
	@RequestMapping(value = "/list_user", method = RequestMethod.GET)
	  public String getUserList(Model model) {
		model.addAttribute("user", userService.getAllUser());
		return "listUser";
}
}
