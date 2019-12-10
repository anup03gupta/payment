package com.zensar.broker.bean;

public class PaymentRequest {

	private static final long serialVersionUID = -7577460334199687761L;
	private Object data;
	private String searchParameter;
	
	
	public String getSearchParameter() {
		return searchParameter;
	}
	public void setSearchParameter(String searchParameter) {
		this.searchParameter = searchParameter;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
