package com.training.servlet.service;

import java.util.List;

import com.training.servlet.dao.LoginDao;
import com.training.servlet.dao.LoginDaoImpl;
import com.training.servlet.model.User;

public class LoginServiceImpl implements LoginService {
	LoginDao dao = new LoginDaoImpl();
	@Override
	public boolean isValidUser(String username, String password) {
		
		boolean isValid = false;
		List<User> userList = dao.getUsers();
		for (User user : userList) {
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				isValid = true;
			}
		}
		return isValid;
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = dao.getUsers();
		return userList;
	}
}
