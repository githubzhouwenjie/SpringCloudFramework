package com.helonghai.tx.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagerServer
public class HelloSpringCloudTxManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudTxManagerApplication.class, args);
	}

}
