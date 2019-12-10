package com.zensar.broker.bean;

import java.io.Serializable;

public class BrokerResponse implements Serializable{
	
	private static final long serialVersionUID = 3193995275938685005L;
	private BrokerError error;
	private Object data;
	private boolean versionUpdated = true;
	private String userMessage;	
	
	public BrokerError getError() {
		return error;
	}

	public void setError(BrokerError error) {
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

}
