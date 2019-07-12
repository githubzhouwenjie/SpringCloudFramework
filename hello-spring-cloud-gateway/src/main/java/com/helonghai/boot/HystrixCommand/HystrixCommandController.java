package com.helonghai.boot.HystrixCommand;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
public class HystrixCommandController {
	
	
	/*
	 * 单个服务短路
	 */
	@RequestMapping("hystrixTimeout")
	public void hystrixTimeout() {
		System.out.println("authorization-service触发了断路器");
	}

	/**
	 * 断路器
	 */
	@HystrixCommand(commandKey="authHystrixCommand")
	public void authHystrixCommand() {
		System.out.println("authorization-service触发了");
	}
	
	
}
