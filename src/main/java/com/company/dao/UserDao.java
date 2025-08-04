package com.company.dao;

public interface UserDao {
	public boolean isValid(String username,String password);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String username);
}
