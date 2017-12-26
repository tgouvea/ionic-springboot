package com.tiagogouvea.ionicspringboot.service;

import org.springframework.data.domain.Page;

import com.tiagogouvea.ionicspringboot.entity.User;

public interface UserService {
	
	public User save(User user);
	
	public User update(User user);
	
	public Page<User> listAll(int page, int count);
	
	public void delete(String id);
	
	public User findOne(String id);
	
	public User findByName(String name);
	
	public User findByEmail(String email);

}
