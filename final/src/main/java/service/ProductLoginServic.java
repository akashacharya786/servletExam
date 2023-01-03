package service;

import java.util.List;

import model.Product;
import model.User;

public interface ProductLoginServic {
	boolean isValidUser(String username, String password);

	List<User> getUsers();
	List<Product> getProd();

}
