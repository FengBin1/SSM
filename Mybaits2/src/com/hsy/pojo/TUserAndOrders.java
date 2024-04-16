package com.hsy.pojo;

import java.util.List;

public class TUserAndOrders extends TUser{

	private List<TOrder> orders;

	public List<TOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<TOrder> orders) {
		this.orders = orders;
	}
	private List<TOrderAndOrderdetails> toaos;

	public List<TOrderAndOrderdetails> getToaos() {
		return toaos;
	}

	public void setToaos(List<TOrderAndOrderdetails> toaos) {
		this.toaos = toaos;
	}
	
	
}
