package com.training.firstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping()
	public String saydefault() {
		return "Hello web";
		
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello web";
		
	}
	
	@GetMapping("/helloweb")
	public HelloWeb sayHelloWithObject() {
		HelloWeb helloWeb = new HelloWeb();
		helloWeb.setId(1);
		helloWeb.setMessage("Hello web!");
		return helloWeb;
		
	}
}
