package com.zensar.broker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.broker.dto.AccountDTO;
import com.zensar.broker.dto.BeneficiaryDTO;
import com.zensar.broker.repo.AccountRepo;
import com.zensar.broker.repo.BeneficiaryRepo;
import com.zensar.broker.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	BeneficiaryRepo beneficiaryRepo;
	
	@Override
	public Iterable<AccountDTO> getAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Iterable<BeneficiaryDTO> getBeneficiariesbyAccountId(Long id) {
		return beneficiaryRepo.findByFromAccountId(id);
	}
}
