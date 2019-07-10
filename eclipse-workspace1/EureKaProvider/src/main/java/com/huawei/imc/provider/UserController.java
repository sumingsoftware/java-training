package com.huawei.imc.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getUser")
	public String getUser() {
		return "I am user list.";
	}
}
