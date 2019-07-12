package com.helonghai.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudGatewayApplication.class, args);
	}
	
	/*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //basic proxy
                .route(r -> r.path("/baidu")
                        .uri("http://baidu.com:80/")
                ).build();
    }*/

}

