package com.zensar.broker.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.broker.bean.CreateNewPaymentRequest;
import com.zensar.broker.bean.PaymentRequest;
import com.zensar.broker.bean.PaymentResponse;
import com.zensar.broker.bean.StandardResponse;
import com.zensar.broker.dto.PaymentDTO;
import com.zensar.broker.service.CreatePaymentService;
import com.zensar.broker.service.SearchEngineService;
import com.zensar.broker.utils.CommonUtils;

@RestController
@EnableAutoConfiguration
public class PaymentSearchController {
	
	@Autowired
	SearchEngineService searchEngine;
	
	@Autowired
	CreatePaymentService paymentService;
	
	@PostMapping(path="/v1/search", consumes = MediaType.APPLICATION_JSON_VALUE)
	public PaymentResponse searchByParameter(@RequestBody PaymentRequest paymentRequest, HttpServletRequest httpRequest,
			HttpServletResponse httpResponse) {
		PaymentResponse response = new PaymentResponse();
		
		if(paymentRequest.getSearchParameter().isEmpty()) {
			CommonUtils.createError("Please provide at least one  search parameter.", "Please provide at least one  search parameter.", response,
					httpResponse, HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		else
			searchEngine.searchEngine(paymentRequest,response,httpResponse);
		
		return response;
	}
	
	@GetMapping(path="/v1/payments")
	public StandardResponse getAllPayments() {
		
		StandardResponse res = new StandardResponse();
		
		Iterable<PaymentDTO> allPayments = paymentService.getAllPayments();
		res.setData(allPayments);
		
		return res;
	}
	
	@PostMapping("/v1/payments")
	public StandardResponse createNewPayment(@RequestBody CreateNewPaymentRequest payment) {
		StandardResponse res = new StandardResponse();
		res.setMessage(paymentService.createNewPayment(payment));
		return res;
	}
}
