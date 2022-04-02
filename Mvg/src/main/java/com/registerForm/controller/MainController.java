package com.registerForm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.registerForm.model.User;
import com.registerForm.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService erepoimpl;

	// Goto index Page
	@RequestMapping("/")
	public String view() {
		System.out.println("arun1111");
		return "index";
	}

	// Goto Register Page
	@RequestMapping("/register")
	public String view1()

	{
		System.out.println("arun");
		return "registerPage"; //
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User emp) { //
		erepoimpl.save(emp);
		System.out.println("user");
		return "register_success";

	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String view4(Model m) {
		List list = erepoimpl.findAll();
		m.addAttribute("data", list);
		return "Displaypage";
	}
}
