package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Sweden!";
	}

	@RequestMapping(value = "/sayHello/{name}", method = RequestMethod.GET)
	public String greeting(@PathVariable String name) {
		// String name now has the value from the url return String.format(“Hello, %s.”,
		// name);
		
		return String.format("Hello, %s.", name);
	}
}
