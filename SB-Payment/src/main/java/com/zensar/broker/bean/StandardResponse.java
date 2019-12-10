package com.zensar.broker.bean;

public class StandardResponse {
	
	private static final long serialVersionUID = 3193995275938685005L;
	private Object data;
	private String message;
	private boolean versionUpdated = true;
	private Error error;
	
	
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String userMessage) {
		this.message = userMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
