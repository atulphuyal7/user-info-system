package com.vastika.userinfo.repository;

import java.util.List;

import com.vastika.userinfo.model.User;

public interface UserRepository {
	
	 void saveUser(User user);
	 
	 List<User> getAllUser();

}
  