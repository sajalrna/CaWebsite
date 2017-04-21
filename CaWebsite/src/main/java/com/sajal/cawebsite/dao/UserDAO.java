package com.sajal.cawebsite.dao;

import com.sajal.cawebsite.model.User;

public interface UserDAO {

	public boolean save(User user);
	
	public boolean validate(String username, String password);

}
