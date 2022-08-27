package com.yigitozdemir.DatabaseSample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yigitozdemir.DatabaseSample.model.User;
import com.yigitozdemir.DatabaseSample.model.repository.UserRepository;

@Controller
public class MainController {
	@Autowired
	private UserRepository repository;
	
	@RequestMapping("/")
	@ResponseBody
	public String index(Model model) {
		return "hello from my world";
	}
	
	@RequestMapping("/view")
	public String view(Model model) {
		User user = repository.findById(1);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("userName", user.getUsername());
		return "index";
	}
	
	@RequestMapping("/view2")
	public String view2() {
		return "index2";
	}
}
