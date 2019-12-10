package com.zensar.broker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.PaymentDTO;

@Repository
public interface BrokerDao {

	List<PaymentDTO> getPaymentDetails();

}
