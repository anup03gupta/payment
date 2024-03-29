package com.zensar.broker.exception;

public class BrokerException extends Exception{

	private static final long serialVersionUID = 2868145903681200131L;

	public BrokerException() {
		super();
	}
	
	public BrokerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BrokerException(String message, Throwable cause) {
		super(message, cause);
	}

	public BrokerException(String message) {
		super(message);
	}

	public BrokerException(Throwable cause) {
		super(cause);
	}
}

