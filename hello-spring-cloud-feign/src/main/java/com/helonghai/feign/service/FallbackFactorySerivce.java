package com.helonghai.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helonghai.feign.service.impl.FallbackFactoryServiceImpl;


@Service
//@FeignClient(value = "service-client", fallbackFactory=FallbackFactoryServiceImpl.class)
public interface FallbackFactorySerivce {
	
    /**
     * fetch data by rule id
     * @return String
     */
	//@RequestMapping(value = "/clientContrller/test",method = RequestMethod.GET)
    //String sayHiFromClientOne();

}
