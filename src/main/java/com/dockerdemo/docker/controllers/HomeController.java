package com.dockerdemo.docker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/docker")
public class HomeController {

	
	@GetMapping(value="/home")
	@ResponseBody
	public String displayHomePage()
	{
		return "we got the request";
	}
}
