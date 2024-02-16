package com.book.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.book.demo.repository.RoleRepository;
import com.book.demo.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String registerGet() {
		return "register";
	}
}
