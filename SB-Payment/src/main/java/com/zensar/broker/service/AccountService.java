package com.zensar.broker.service;

import org.springframework.stereotype.Service;

import com.zensar.broker.dto.AccountDTO;
import com.zensar.broker.dto.BeneficiaryDTO;

@Service
public interface AccountService {

	public Iterable<AccountDTO> getAccounts(Integer pageNo, Integer pageSize, String sortBy, String order);
	
	public Iterable<BeneficiaryDTO> getBeneficiariesbyAccountId(Long id, Integer pageNo, Integer pageSize, String sortBy, String order);

}
