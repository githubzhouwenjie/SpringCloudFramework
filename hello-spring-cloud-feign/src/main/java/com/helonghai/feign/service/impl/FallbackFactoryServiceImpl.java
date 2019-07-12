package com.helonghai.feign.service.impl;

import com.helonghai.feign.service.FallbackFactorySerivce;

import feign.hystrix.FallbackFactory;

public class FallbackFactoryServiceImpl implements FallbackFactory<FallbackFactorySerivce>{

	@Override
	public FallbackFactorySerivce create(Throwable cause) {
		// TODO Auto-generated method stub
		return new FallbackFactorySerivce() {
		/*	@Override
			public String sayHiFromClientOne() {
				// TODO Auto-generated method stub
				return "";
			}*/
			
		};
	}


}
