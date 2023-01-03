package com.vicky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoadMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadMicroserviceApplication.class, args);
	}

}
