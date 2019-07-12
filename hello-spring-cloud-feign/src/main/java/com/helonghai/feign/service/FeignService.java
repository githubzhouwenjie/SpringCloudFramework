package com.helonghai.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helonghai.feign.service.impl.FeignSerivceImpl;

@Service
@FeignClient(value = "service-client", fallback = FeignSerivceImpl.class)
public interface FeignService {

    /**
     * fetch data by rule id
     * @return String
     */
	@RequestMapping(value = "/clientController/test",method = RequestMethod.GET)
    String sayHiFromClientOne();
	
}
