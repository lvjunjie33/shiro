package com.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.pojo.Module;
import com.springboot.pojo.RoleInfo;
import com.springboot.pojo.UserInfo;

@Mapper
public interface UserMapper {
	UserInfo findByUserName(String userName);
	List<UserInfo> findByUserRole(int userID);
	List<UserInfo> findByModel(int userID);
}
