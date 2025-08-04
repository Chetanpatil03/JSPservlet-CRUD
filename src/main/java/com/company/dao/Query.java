package com.company.dao;

public class Query {
	static String insert = "insert into user(username,password,email) values (?,?,?)";
	static String select = "select * from user where username = ? and password = ?";
	static String update = "update user set email = ? ,password = ? where username = ?";
	static String delete = "delete from user where username = ?";

}
