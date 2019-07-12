package com.helonghai.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 如果使用 GitLab 作为仓库的话，git.uri 需要在结尾加上 .git，GitHub 则不用
 * http://ip:port/{application}/{profile}[/{label}]
 * http://ip:port/{application}-{profile}.yml
 * http://ip:port/{label}/{application}-{profile}.yml
 * http://ip:port/{application}-{profile}.properties
 * http://ip:port/{label}/{application}-{profile}.properties
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@RefreshScope
public class HelloSpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudConfigApplication.class, args);
    }

}
