package com.zensar.broker.utils;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.zensar.broker.bean.PaymentResponse;
import com.zensar.broker.bean.PaymentSearchError;

@Component
public class CommonUtils {
	
	public static void createError(String errormessage, String cause, PaymentResponse zentsResponse,
			HttpServletResponse response, int status) {
		PaymentSearchError searchError = new PaymentSearchError();
		searchError.setErrorMessage(errormessage);
		searchError.setErrorCause(cause);
		zentsResponse.setError(searchError);
		response.setStatus(status);
	}

}
