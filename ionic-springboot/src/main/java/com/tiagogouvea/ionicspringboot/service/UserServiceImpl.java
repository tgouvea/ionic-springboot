package com.tiagogouvea.ionicspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiagogouvea.ionicspringboot.entity.User;
import com.tiagogouvea.ionicspringboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public Page<User> listAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return repository.findAll(pages);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}

	@Override
	public User findOne(String id) {
		return repository.findOne(id);
	}

	@Override
	public User findByName(String name) {
		return repository.findByNameLikeIgnoreCase(name);
	}

	@Override
	public User findByEmail(String email) {
		return repository.findByEmail(email);
	}

}
