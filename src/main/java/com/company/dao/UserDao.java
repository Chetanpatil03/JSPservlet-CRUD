package com.company.dao;

import java.sql.SQLException;

public interface UserDao {
	public boolean isValid(String username,String password);
	public boolean addUser(User user);
}
