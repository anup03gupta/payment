package com.zensar.broker.bean;

import java.io.Serializable;

public class BrokerError implements Serializable {
	private static final long serialVersionUID = -4166064560040839678L;
	private String errorMessage;
	private String errorCause;
	
	public BrokerError(String message, String cause) {
		this.errorMessage =  message;
		this.errorCause = cause;
	}

	public BrokerError() {
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCause() {
		return errorCause;
	}

	public void setErrorCause(String errorCause) {
		this.errorCause = errorCause;
	}
}
