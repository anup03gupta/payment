package com.zensar.broker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.broker.bean.StandardResponse;
import com.zensar.broker.service.AccountService;

@CrossOrigin(origins = "*")
@RestController
@EnableAutoConfiguration
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("v1/account")
	public StandardResponse getAccounts(
			@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String order) {
		
		StandardResponse res = new StandardResponse();
		res.setData(accountService.getAccounts(pageNo, pageSize, sortBy, order));
		return res;
	}
	
	@GetMapping("v1/account/{id}/beneficiary")
	public StandardResponse getBeneficiaries(@PathVariable("id") Long id,
			@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String order) {
		
		StandardResponse res = new StandardResponse();
		res.setData(accountService.getBeneficiariesbyAccountId(id, pageNo, pageSize, sortBy, order));
		return res;
	}
}
