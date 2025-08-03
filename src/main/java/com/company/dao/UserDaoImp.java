package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtils;

public class UserDaoImp implements UserDao{

	@Override
	public boolean isValid(String username, String password){
		// TODO Auto-generated method stub
		String query = "select * from user where username = ? and password = ?";
		try(Connection conn = DBUtils.getConnection();
			PreparedStatement statement = conn.prepareStatement(query)){
			
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			
			return set.next();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		
		String query = "insert into user(username,password,email) values (?,?,?)";
		
		try( Connection conn = DBUtils.getConnection();
				PreparedStatement preparedStatement = conn.prepareStatement(query)){
			
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			
			int rows = preparedStatement.executeUpdate();
			
			return rows > 0;
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

}
