package com.helonghai.tc.client.feign.fusing;

import org.springframework.stereotype.Component;

import com.helonghai.tc.client.feign.Feign;

@Component
public class Fusing implements Feign{

	@Override
	public String sayHiFromClientOne() {
		
		return "服务2失败";
		// TODO Auto-generated method stub
	}

}
