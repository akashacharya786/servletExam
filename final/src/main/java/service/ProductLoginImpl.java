package service;

import java.util.List;

import dao.LoginDao;
import dao.LoginDaoImpl;
import model.Product;
import model.User;

public class ProductLoginImpl implements ProductLoginServic{
	
	LoginDao DAO = new LoginDaoImpl();
	
	@Override
	public boolean isValidUser(String username, String password) {
		boolean isValid = false;
		List<User> userList = DAO.getUsers();
		
		for(User user:userList) {
			if(user.getUserName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
				isValid = true;
			}
		}
		
		return isValid;
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = DAO.getUsers();
		return userList;
	}

	@Override
	public List<Product> getProd() {
		List<Product> prodList = DAO.getProd();
		return prodList;
	}
	

}
