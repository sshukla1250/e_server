package com.eserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RestController
@RequestMapping("/message")
public class EServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String getServiceInfo() {
		return "service name: Eserver application";
	}
	

}
