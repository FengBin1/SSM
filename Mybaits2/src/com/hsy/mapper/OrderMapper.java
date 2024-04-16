package com.hsy.mapper;

import java.util.List;

import com.hsy.pojo.TOrderCustomer;
import com.hsy.pojo.TorderAndUser;

public interface OrderMapper {

	//定义一个方法用来完成订单关联用户的操作
	public abstract List<TOrderCustomer> findOrderAndUser()throws Exception;
	public abstract List<TorderAndUser> findOrderAndUserMap()throws Exception;
}
