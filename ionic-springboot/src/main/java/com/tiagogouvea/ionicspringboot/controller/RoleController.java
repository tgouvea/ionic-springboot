package com.tiagogouvea.ionicspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiagogouvea.ionicspringboot.entity.Role;
import com.tiagogouvea.ionicspringboot.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Role findOne(@PathVariable String id) {	
		return roleService.findOne(id);
	}
	
	@RequestMapping(value="/name/{name}", method = RequestMethod.GET)
	public Role findByName(@PathVariable String name) {	
		return roleService.findByName(name);
	}
	
	@RequestMapping(value="/{page}/{count}", method = RequestMethod.GET)
	public Page<Role> listAll(@PathVariable int page, @PathVariable int count) {	
		return roleService.listAll(page,count);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Role save(@RequestBody Role role) {	
		return roleService.save(role);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Role update(@RequestBody Role role) {	
		return roleService.update(role);
	}

	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {	
		roleService.delete(id);
	}
	

}
