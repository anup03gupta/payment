package com.zensar.broker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.broker.dto.PaymentDTO;

@Service
public interface BrokerService {

	public List<PaymentDTO> getPaymentDetails();

}
