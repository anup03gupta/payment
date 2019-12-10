package com.zensar.broker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.broker.dao.BrokerDao;
import com.zensar.broker.dto.PaymentDTO;
import com.zensar.broker.service.BrokerService;

@Service
public class BrokerServiceImpl implements BrokerService {

	@Autowired
	BrokerDao brokerDao;

	@Override
	public List<PaymentDTO> getPaymentDetails() {
		return brokerDao.getPaymentDetails();
	}

}
