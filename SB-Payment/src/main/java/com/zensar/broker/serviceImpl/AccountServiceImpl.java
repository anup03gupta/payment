package com.zensar.broker.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public Iterable<AccountDTO> getAccounts(Integer pageNo, Integer pageSize, String sortBy, String order) {
		Sort sort = ((order.equalsIgnoreCase("DESC") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending()));
		
		Pageable paging = PageRequest.of(pageNo, pageSize, sort);
		Page<AccountDTO> pagedResult = accountRepo.findAll(paging);
		
		return ((pagedResult.hasContent()) ? pagedResult.getContent() : new ArrayList<AccountDTO>());
	}

	@Override
	public Iterable<BeneficiaryDTO> getBeneficiariesbyAccountId(Long id, Integer pageNo, Integer pageSize, String sortBy, String order) {
		Sort sort = ((order.equalsIgnoreCase("DESC") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending()));
		
		Pageable paging = PageRequest.of(pageNo, pageSize, sort);
		Page<BeneficiaryDTO> pagedResult = beneficiaryRepo.findByFromAccountId(id, paging);
		
		return ((pagedResult.hasContent()) ? pagedResult.getContent() : new ArrayList<BeneficiaryDTO>());
	}
}
