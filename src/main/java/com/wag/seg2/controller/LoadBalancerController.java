package com.wag.seg2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerController {
	
	@GetMapping(path = "/data")
	public String getValue() {
		return " load balancer works";
	}

}
