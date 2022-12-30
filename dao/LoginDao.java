package com.training.servlet.dao;



import java.util.List;

import com.training.servlet.model.User;

public interface LoginDao {
	
	List<User> getUsers();

}