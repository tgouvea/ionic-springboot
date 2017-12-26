package com.tiagogouvea.ionicspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tiagogouvea.ionicspringboot.entity.User;


public interface UserRepository extends MongoRepository<User, String>{
	
    User findByNameLikeIgnoreCase(String nome);
    
    User findByEmail(String email);

}
