package com.helonghai.tc.client.contrller;

import com.helonghai.tc.client.service.ClientTwoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/clientTwoController")
public class ClientTwoController {

	@Resource
	private ClientTwoService clientTwoService;
	
	@RequestMapping("/test2")
	public String test() {
		return clientTwoService.sayHiFromClientOne();
	}

}
