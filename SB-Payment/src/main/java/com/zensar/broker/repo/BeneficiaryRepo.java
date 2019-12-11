package com.zensar.broker.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.BeneficiaryDTO;

@Repository
public interface BeneficiaryRepo extends PagingAndSortingRepository<BeneficiaryDTO, Long> {
	
	Page<BeneficiaryDTO> findByFromAccountId(Long accountId, Pageable paging);
}