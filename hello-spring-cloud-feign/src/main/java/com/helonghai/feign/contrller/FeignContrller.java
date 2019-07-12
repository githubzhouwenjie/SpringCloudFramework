package com.helonghai.feign.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helonghai.feign.service.FallbackFactorySerivce;
import com.helonghai.feign.service.FeignService;

/**
 * Demo class
 *
 * @author hlh
 * @date 2019/03/06
 */
@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
@RestController
@RequestMapping("/feignContrller")
public class FeignContrller {
	
	@Autowired
	private FeignService feignService;
	
	/*@Autowired
	private FallbackFactorySerivce fallbackFactorySerivce;*/

	@RequestMapping("/test")
	public String test() {
		return feignService.sayHiFromClientOne();
	}
	
	/*@RequestMapping("/fallbackFactorySerivce")
	public String tes() {
		return fallbackFactorySerivce.sayHiFromClientOne();
	}*/
	
}
