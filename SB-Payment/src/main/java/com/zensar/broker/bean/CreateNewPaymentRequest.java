package com.zensar.broker.bean;

public class CreateNewPaymentRequest {
	
	private Long fromAccountId;
	private Long beneficiaryId;
	private Double amount;
	private String varialeReference;
	private boolean urgent = false;
	private boolean notification = false;
	
	public CreateNewPaymentRequest() {
		super();
	}

	public CreateNewPaymentRequest(Long fromAccountId, Long beneficiatyId, Double amount, String varialeReference,
			boolean urgent, boolean notification) {
		super();
		this.fromAccountId = fromAccountId;
		this.beneficiaryId = beneficiatyId;
		this.amount = amount;
		this.varialeReference = varialeReference;
		this.urgent = urgent;
		this.notification = notification;
	}

	public Long getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public Long getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Long beneficiatyId) {
		this.beneficiaryId = beneficiatyId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getVarialeReference() {
		return varialeReference;
	}

	public void setVarialeReference(String varialeReference) {
		this.varialeReference = varialeReference;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}
}
