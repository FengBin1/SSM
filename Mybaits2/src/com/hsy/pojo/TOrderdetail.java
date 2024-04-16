package com.hsy.pojo;

public class TOrderdetail {

	private int id;
	private int order_id;
	private int item_id;
	private int item_num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getItem_num() {
		return item_num;
	}
	public void setItem_num(int item_num) {
		this.item_num = item_num;
	}
	@Override
	public String toString() {
		return "TOrderdetail [id=" + id + ", order_id=" + order_id + ", item_id=" + item_id + ", item_num=" + item_num
				+ "]";
	}
	
}
