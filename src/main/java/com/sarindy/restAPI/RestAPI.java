package com.sarindy.restAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	
	@RequestMapping("/api/greeting")
	public String Greeting(){
		return "Hello API User";
	}

}
