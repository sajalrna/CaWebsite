package com.sajal.cawebsite.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component("user")
public class User implements Serializable {

	@Id
	private String id;

	private String username;

	private String password;

	private String email;

	private boolean enabled;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
