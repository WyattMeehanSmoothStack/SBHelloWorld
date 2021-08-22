package com.ss.helloworldspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}
