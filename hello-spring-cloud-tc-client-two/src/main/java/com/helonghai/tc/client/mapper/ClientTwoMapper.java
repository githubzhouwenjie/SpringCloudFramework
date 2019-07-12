package com.helonghai.tc.client.mapper;

import org.springframework.stereotype.Repository;

import com.helonghai.tc.client.entity.User;

@Repository
public interface ClientTwoMapper {
	
	void insertUser (User user);

}
