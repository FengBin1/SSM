package com.hsy.pojo;

import java.util.Date;

public class TItem {

	private int id;
	private String name;
	private int price;
	private String detail;
	private Date createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "TItem [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", createtime="
				+ createtime + "]";
	}
	
}
