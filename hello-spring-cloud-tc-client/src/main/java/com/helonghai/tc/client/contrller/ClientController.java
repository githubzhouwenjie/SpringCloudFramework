package com.helonghai.tc.client.contrller;

import com.helonghai.tc.client.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/clientController")
public class ClientController {

	@Resource
	private ClientService clientService;
	
	@RequestMapping("/test")
	public String test() {
		return clientService.openTest();
	}

}
