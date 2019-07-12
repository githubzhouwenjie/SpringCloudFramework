package com.helonghai.tc.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;

@SpringBootApplication
@EnableDistributedTransaction
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.helonghai.tc.client.mapper")
public class HelloSpringCloudTcClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudTcClientTwoApplication.class, args);
	}

}
