package org.henry.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value={"/" , "/home**"} , method=RequestMethod.GET)
	public String nonAdminHome(){
		return "userHome";
	}
	
	@RequestMapping(value="/admin**" , method=RequestMethod.GET)
	public String adminHome(){
		return "adminHome";
	}
	
}
