package com.tiagogouvea.ionicspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiagogouvea.ionicspringboot.entity.User;
import com.tiagogouvea.ionicspringboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public User findOne(@PathVariable String id) {	
		return userService.findOne(id);
	}
	
	@RequestMapping(value="/name/{name}", method = RequestMethod.GET)
	public User findByName(@PathVariable String name) {	
		return userService.findByName(name);
	}
	
	@RequestMapping(value="/email/{email}", method = RequestMethod.GET)
	public User findByEmail(@PathVariable String email) {	
		return userService.findByEmail(email);
	}
	
	@RequestMapping(value="/{page}/{count}", method = RequestMethod.GET)
	public Page<User> listAll(@PathVariable int page, @PathVariable int count) {	
		return userService.listAll(page,count);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User save(@RequestBody User user) {	
		return userService.save(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User update(@RequestBody User user) {	
		return userService.update(user);
	}

	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {	
		userService.delete(id);
	}
	

}
