package com.test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// call http://192.168.0.11:8001/rest/all
@Controller
@RequestMapping(path="/rest")
public class UserController {

	@Autowired
	UserRepository repository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addUser(@RequestParam String name,@RequestParam String email) {
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		repository.save(user);
		return "Data SAVED";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getUser(){
		return repository.findAll();
	}
}
