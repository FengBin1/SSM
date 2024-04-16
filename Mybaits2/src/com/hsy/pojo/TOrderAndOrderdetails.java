package com.hsy.pojo;

import java.util.List;

public class TOrderAndOrderdetails extends TOrder{

	private List<TOrderdetailAndItem> toais;

	public List<TOrderdetailAndItem> getToais() {
		return toais;
	}

	public void setToais(List<TOrderdetailAndItem> toais) {
		this.toais = toais;
	}
	
}
