package com.wag.seg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wag.seg2.controller")
public class LoadBalancerCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerCheckApplication.class, args);
	}

}
