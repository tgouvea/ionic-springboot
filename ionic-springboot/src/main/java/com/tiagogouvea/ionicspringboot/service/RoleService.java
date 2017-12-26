package com.tiagogouvea.ionicspringboot.service;

import org.springframework.data.domain.Page;

import com.tiagogouvea.ionicspringboot.entity.Role;

public interface RoleService {
	
	public Role save(Role Role);
	
	public Role update(Role Role);
	
	public Page<Role> listAll(int page, int count);
	
	public void delete(String id);
	
	public Role findOne(String id);
	
	public Role findByName(String name);

}
