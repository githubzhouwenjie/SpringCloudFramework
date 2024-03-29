package com.helonghai.tc.client.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private Integer id;
	private String name;
	private Date createTime;
	private Date updateTime;
	private Integer isDelete;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	@Override
	public String toString() {
		return "CertificatesType [id=" + id + ", name=" + name + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", isDelete=" + isDelete + "]";
	}
	
	
	
}
