package com.tiagogouvea.ionicspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tiagogouvea.ionicspringboot.entity.Role;
import com.tiagogouvea.ionicspringboot.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository repository;

	@Override
	public Role save(Role Role) {
		return repository.save(Role);
	}

	@Override
	public Role update(Role Role) {
		return repository.save(Role);
	}

	@Override
	public Page<Role> listAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return repository.findAll(pages);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}

	@Override
	public Role findOne(String id) {
		return repository.findOne(id);
	}

	@Override
	public Role findByName(String name) {
		return repository.findByName(name);
	}

}
