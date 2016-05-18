package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/")
public class HelloWorldContentController {
	
		
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC with out xml");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC with out xml");
		return "angular";
	}
	
	
	@RequestMapping(value="/springcontent",
			method=RequestMethod.GET,produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody UserDetails getUser() {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("Narayana");
		userDetails.setEmailId("Narayana@gmail.com");
		return userDetails;
	}

}
