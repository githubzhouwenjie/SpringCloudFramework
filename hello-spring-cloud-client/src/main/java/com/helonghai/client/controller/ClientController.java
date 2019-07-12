package com.helonghai.client.controller;

import com.helonghai.client.utils.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientController")
public class ClientController {

	@Value("${server.port}")
	private String serverport;

	@RequestMapping("/test")
	public String test() {
		System.out.println(this.serverport);
		return serverport;
	}

	//测试全部异常
	@RequestMapping("/aop/test")
	public Result aop(int id) {
		if(id==0){
			throw new ArithmeticException();
		}
		return Result.succeed("成功");
	}

}
