package com.rd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rd.domain.User;
import com.rd.repository.UserRepository;

@Controller
@RequestMapping("/create")
public class ResgisterController {
	private List<User> users = new ArrayList<User>();	
	
	private StandardPasswordEncoder passwordEncoder = new StandardPasswordEncoder();
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(method= RequestMethod.POST)
	public String createUser(User user){
		String test;
		userRepository.save(user);
		return "Hello";
		
		
	}
	
		/*@RequestMapping(method = RequestMethod.POST)
	    @ResponseBody
	    public String register() {
	        return "Secure Hello!";
	    }
*/

}
