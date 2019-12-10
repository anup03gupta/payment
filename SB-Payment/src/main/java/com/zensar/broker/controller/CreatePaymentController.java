package com.zensar.broker.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.broker.bean.PaymentRequest;
import com.zensar.broker.bean.PaymentResponse;
import com.zensar.broker.service.CreatePaymentService;

@RestController
@EnableAutoConfiguration
public class CreatePaymentController {

	@Autowired
	CreatePaymentService createPaymentService;
	
	@PostMapping(path="/v1/getAccountDetails", consumes=MediaType.APPLICATION_JSON_VALUE)
	public PaymentResponse getAccountDetails(@RequestBody PaymentRequest paymentRequest,
			HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		PaymentResponse response = new PaymentResponse();
		
		
		response.setData(createPaymentService.getAccountDetails());
		return response;
	}

}
