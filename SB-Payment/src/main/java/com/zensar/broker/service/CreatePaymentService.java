package com.zensar.broker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.broker.bean.CreateNewPaymentRequest;
import com.zensar.broker.dto.AccountDTO;
import com.zensar.broker.dto.PaymentDTO;

@Service
public interface CreatePaymentService {

	public List<AccountDTO> getAccountDetails();
	
	public Iterable<PaymentDTO> getAllPayments();
	
	public String createNewPayment(CreateNewPaymentRequest payment);
}
