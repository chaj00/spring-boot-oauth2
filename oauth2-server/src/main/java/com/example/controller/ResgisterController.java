package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Controller
public class ResgisterController {
	
	private StandardPasswordEncoder passwordEncoder = new StandardPasswordEncoder();
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public String createUser(@ModelAttribute("userform") User user, Model model){
				
		String rawPassword = user.getPassword();
		String encodedPassword = new StandardPasswordEncoder().encode(rawPassword);
		user.setPassword(encodedPassword);
		user.setActivated(true);
		
		userRepository.save(user);
		
		return "Hello";
		
		
	}

}
