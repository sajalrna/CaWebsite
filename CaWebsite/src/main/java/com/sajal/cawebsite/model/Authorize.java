package com.sajal.cawebsite.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Authorize implements Serializable {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String role;

}
