package com.zensar.broker.bean;

public class Payment {
	
	private int paymentId;
	private String paymentDetails;
	private double amount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
