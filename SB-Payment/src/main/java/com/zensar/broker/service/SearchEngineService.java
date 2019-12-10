package com.zensar.broker.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.zensar.broker.bean.PaymentRequest;
import com.zensar.broker.bean.PaymentResponse;

@Service
public interface SearchEngineService {

	void searchEngine(PaymentRequest paymentRequest, PaymentResponse response, HttpServletResponse httpResponse);

}
