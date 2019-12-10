package com.zensar.broker.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.BeneficiaryDTO;

@Repository
public interface BeneficiaryRepo extends CrudRepository<BeneficiaryDTO, Long> {
	
	Iterable<BeneficiaryDTO> findByFromAccountId(Long accountId);
	
}