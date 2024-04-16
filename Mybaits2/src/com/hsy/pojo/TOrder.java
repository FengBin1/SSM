package com.hsy.pojo;

import java.util.Date;

public class TOrder {

	private int id;
	private String t_number;
	private Date createtime;
	private String note;
	private int user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_number() {
		return t_number;
	}
	public void setT_number(String t_number) {
		this.t_number = t_number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "TOrder [id=" + id + ", t_number=" + t_number + ", createtime=" + createtime + ", note=" + note
				+ ", user_id=" + user_id + "]";
	}
	
}
