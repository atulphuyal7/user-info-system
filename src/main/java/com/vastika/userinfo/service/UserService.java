package com.vastika.userinfo.service;

import java.util.List;

import com.vastika.userinfo.model.User;

public interface UserService {

	 void saveUser(User user);
	 
	 List<User> getAllUser();
}
