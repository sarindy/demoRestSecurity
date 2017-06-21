package com.sarindy.restUser;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUser {
	@RequestMapping("/user/greeting")
	public String Greeting(){
		return "Hello User User";
	}

}
