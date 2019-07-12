package com.helonghai.tc.client.service.impl;

import com.helonghai.tc.client.entity.User;
import com.helonghai.tc.client.mapper.ClientTwoMapper;
import com.helonghai.tc.client.service.ClientTwoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class ClientTwoImpl implements ClientTwoService{

	@Resource
	private User user;

	@Resource
	private ClientTwoMapper clientTwoMapper;

	@Override
	//@LcnTransaction //分布式事务注解
	@Transactional(rollbackFor = Exception.class)
	public String sayHiFromClientOne() {
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		user.setName("何隆海");
		user.setIsDelete(0);
		
		clientTwoMapper.insertUser(user);
		//int a = 1 / 0;
		// TODO Auto-generated method stub
		return "ok-B";
	}

}
