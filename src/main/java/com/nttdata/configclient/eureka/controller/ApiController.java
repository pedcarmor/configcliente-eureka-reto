package com.nttdata.configclient.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/suma/{a}/{b}")
	public Integer suma(@PathVariable final Integer a,@PathVariable final Integer b) {
		return a + b;
	}
	
	@GetMapping("/resta/{a}/{b}")
	public Integer resta(@PathVariable final Integer a,@PathVariable final Integer b) {
		return a - b;
	}
	
	@GetMapping("/multiplicacion/{a}/{b}")
	public Integer multiplicacion(@PathVariable final Integer a,@PathVariable final Integer b) {
		return a * b;
	}
}
