package com.training.servlet.service;

import java.util.List;

import com.training.servlet.model.User;

public interface LoginService {
	boolean isValidUser(String username, String password);
	List<User> getUsers();


}
