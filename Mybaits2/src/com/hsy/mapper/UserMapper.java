package com.hsy.mapper;

import java.util.List;

import com.hsy.pojo.TUserAndOrders;

public interface UserMapper {

	public abstract List<TUserAndOrders> findUserAndOrders()throws Exception;
	public abstract List<TUserAndOrders> findUserAndOrderAndDetailsAndItem()throws Exception;
}
