package com.sarindy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarindy.model.Role;
import com.sarindy.model.User;
import com.sarindy.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/initRole")
	public String InitialRole() {
		Role role = new Role();
		role.setRole("ADMIN");
		userService.saveRole(role);
		role.setRole("API");
		userService.saveRole(role);
		role.setRole("USER");
		userService.saveRole(role);
		return "Default Roles Created";
	}

	@RequestMapping("/initAdmin")
	public String InitialAdmin() {
		User user = new User("Sarindy", "Ouk", "admin@dnynn.com", "123456", 1);
		userService.saveUser(user, "ADMIN");
		return "Admin Created";
	}

	@RequestMapping("/initApi")
	public String InitialApi() {
		User user = new User("Sarindy", "Ouk", "api@dnynn.com", "123456", 1);
		userService.saveUser(user, "API");

		return "API Created";
	}

	@RequestMapping("/initUser")
	public String InitialUser() {
		User user = new User("Sarindy", "Ouk", "user@dnynn.com", "123456", 1);
		userService.saveUser(user, "USER");
		return "User Created";
	}

}
