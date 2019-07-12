package com.helonghai.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientController")
public class ClientContrller {

	@Value("${server.port}")
	private String serverport;

	@RequestMapping("/test")
	public String test() {
		/*System.out.println("进来了");
		try{
	        Thread.sleep(1000000);
	    }catch ( Exception e){
	        e.printStackTrace();
	        System.out.println("出现异常");
	    }*/
		System.out.println(this.serverport);
		return serverport;
	}
	
}
