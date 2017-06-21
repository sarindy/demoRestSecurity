package com.sarindy.restAdmin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAdmin {
	@RequestMapping("/admin/greeting")
	public String Greeting(){
		return "Hello Admin User";
	}

}
