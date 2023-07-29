package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	// fake user list
	
	List<User> list = List.of(
			new User(101L,"Khushi","7825485485"),
			new User(102L,"Nisha","7866485485"),
			new User(103L,"Dhara","7898485485"),
			new User(104L,"Pooja","7825587485")
			);

	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
