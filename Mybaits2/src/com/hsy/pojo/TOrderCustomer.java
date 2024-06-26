package com.hsy.pojo;

import java.util.Date;

public class TOrderCustomer extends TOrder{
	private int id;
	private String name;
	private Date birthday;
	private String sex;
	private String address;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TOrderCustomer [id=" + id + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + ", toString()=" + super.toString() + "]";
	}
	
	
}
