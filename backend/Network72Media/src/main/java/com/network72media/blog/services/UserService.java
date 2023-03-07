package com.network72media.blog.services;

import java.util.List;

import com.network72media.blog.entities.User;
import com.network72media.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto	updateUser(UserDto user,Integer userId);
	UserDto	getUserById(Integer userId);
	List<UserDto> getAllUser();
	
	void deletUser(Integer userId);
	
}
