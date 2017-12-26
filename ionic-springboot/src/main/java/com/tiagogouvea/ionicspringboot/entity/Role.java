package com.tiagogouvea.ionicspringboot.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Document
public class Role implements GrantedAuthority{

	private static final long serialVersionUID = -1584138243576024089L;

	private String id;
	
	private String name;
	
	public Role(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public String getAuthority() {
		return this.name;
	}




	
}
