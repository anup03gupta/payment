package com.zensar.broker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.broker.bean.BrokerResponse;
import com.zensar.broker.service.BrokerService;

@RestController
@EnableAutoConfiguration
public class BrokerController {
	
	@Autowired
	BrokerService brokerService;
	
	@GetMapping(path="v1/loadMFData")
	public BrokerResponse loadBrokerData() {		
		BrokerResponse brokerResponse = new BrokerResponse();
		
		brokerResponse.setData(brokerService.getPaymentDetails());
		
		/*
		 * try {
		 * 
		 * 
		 * } catch(BrokerException be) {
		 * 
		 * }
		 */
		return brokerResponse;
		
	}

}
