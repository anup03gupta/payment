package com.zensar.broker.serviceImpl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.broker.bean.PaymentRequest;
import com.zensar.broker.bean.PaymentResponse;
import com.zensar.broker.service.SearchEngineService;

@Service
public class ServiceEngineImpl implements SearchEngineService {
	
	
	

	@Override
	public void searchEngine(PaymentRequest paymentRequest, PaymentResponse response,
			HttpServletResponse httpResponse) {
		
		
	}

}
