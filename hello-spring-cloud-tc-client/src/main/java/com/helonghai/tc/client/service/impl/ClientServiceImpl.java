package com.helonghai.tc.client.service.impl;

import com.helonghai.tc.client.entity.CertificatesType;
import com.helonghai.tc.client.feign.Feign;
import com.helonghai.tc.client.mapper.ClientMapper;
import com.helonghai.tc.client.service.ClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class ClientServiceImpl implements ClientService{

	@Resource
	private CertificatesType certificatesType;

	@Resource
	private ClientMapper clientMapper;

	@Resource
	private Feign feign;
	
	@Override
	//@LcnTransaction //分布式事务注解
	@Transactional(rollbackFor = Exception.class)
	public String openTest() {
		certificatesType.setCreateTime(new Date());
		certificatesType.setUpdateTime(new Date());
		certificatesType.setName("何隆海");
		certificatesType.setIsDelete(0);
		clientMapper.insertOpen(certificatesType);
	
		String result = feign.sayHiFromClientOne();
		
		int a = 1 / 0;
		// TODO Auto-generated method stub
		return result + " > " + "ok-A";
	}

}
