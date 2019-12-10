package com.zensar.broker.bean;

public class PaymentSearchError {
	
	private static final long serialVersionUID = -4166064560040839678L;
	private String errorMessage;
	private String errorCause;
	
	public PaymentSearchError(String message, String cause) {
		this.errorMessage =  message;
		this.errorCause = cause;
	}

	public PaymentSearchError() {
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
