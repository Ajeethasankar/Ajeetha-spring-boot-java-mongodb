package com.examplergistration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MvcController {
	 
	 @Autowired
	    private UserRepository repository;
	 
	 	 @RequestMapping("/register")
		 		public String showForm(Model model) {
	 		List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
			User emp = new User();
			model.addAttribute("user", emp);
			model.addAttribute("professionList", professionList);
			return "register_form";
		}
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public String register(@ModelAttribute User user1) {
	       		 repository.save(user1);
	       	  System.out.println("user");
	        return "register success";
	        
	    }
	
	
}


