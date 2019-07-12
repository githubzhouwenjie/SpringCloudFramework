package com.helonghai.tc.client.mapper;

import org.springframework.stereotype.Repository;

import com.helonghai.tc.client.entity.CertificatesType;

@Repository
public interface ClientMapper {
	
	void insertOpen(CertificatesType certificatesType);

}
