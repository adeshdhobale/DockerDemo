package com.docker.FristDocker.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WlcomeRestController {

	@GetMapping(value="/welcome")
	public String welcome()
	{
		return "welcome to the docker containers";
	}
}
