package com.zensar.broker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.broker.bean.StandardResponse;
import com.zensar.broker.service.AccountService;

@RestController
@EnableAutoConfiguration
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("v1/account")
	public StandardResponse getAccounts() {
		
		StandardResponse res = new StandardResponse();
		res.setData(accountService.getAccounts());
		return res;
	}
	
	@GetMapping("v1/account/{id}/beneficiary")
	public StandardResponse getBeneficiaries(@PathVariable("id") Long id) {
		
		StandardResponse res = new StandardResponse();
		res.setData(accountService.getBeneficiariesbyAccountId(id));
		return res;
	}
}
