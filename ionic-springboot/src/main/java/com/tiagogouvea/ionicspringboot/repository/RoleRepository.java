package com.tiagogouvea.ionicspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiagogouvea.ionicspringboot.entity.Role;

public interface RoleRepository extends MongoRepository<Role, String>{

	Role findByName(String name);
	
}
