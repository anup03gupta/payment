package com.zensar.broker.bean;

public class PaymentResponse {
	
	private static final long serialVersionUID = 3193995275938685005L;
	private PaymentSearchError error;
	private Object data;
	private boolean versionUpdated = true;
	private String userMessage;
	
	
	public PaymentSearchError getError() {
		return error;
	}
	public void setError(PaymentSearchError error) {
		this.error = error;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public boolean isVersionUpdated() {
		return versionUpdated;
	}
	public void setVersionUpdated(boolean versionUpdated) {
		this.versionUpdated = versionUpdated;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	

}
