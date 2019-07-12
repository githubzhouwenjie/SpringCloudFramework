package com.helonghai.feign.service.impl;

import org.springframework.stereotype.Service;

import com.helonghai.feign.service.FeignService;

@Service
public class FeignSerivceImpl implements FeignService{

	@Override
	public String sayHiFromClientOne() {
		// TODO Auto-generated method stub
		return "网络异常，请重新刷新!";
	}

}
