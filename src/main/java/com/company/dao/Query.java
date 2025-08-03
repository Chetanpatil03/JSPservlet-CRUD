package com.company.dao;

public class Query {
	static String insert = "insert into user(username,password,email) values (?,?,?)";
	static String select = "select * from user where username = ? and password = ?";
}
