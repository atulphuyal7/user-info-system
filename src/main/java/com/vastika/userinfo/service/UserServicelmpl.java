package com.vastika.userinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.userinfo.model.User;
import com.vastika.userinfo.repository.UserRepository;

@Service
public class UserServicelmpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.saveUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

}
