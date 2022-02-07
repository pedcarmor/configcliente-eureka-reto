package com.nttdata.configclient.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path="/myvalue")
	public String myValue() {
		return this.myValue;
	}
	
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
