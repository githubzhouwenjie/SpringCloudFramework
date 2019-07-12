package com.helonghai.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloSpringCloudClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudClientTwoApplication.class, args);
	}

}

