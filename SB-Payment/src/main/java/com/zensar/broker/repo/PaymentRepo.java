package com.zensar.broker.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.PaymentDTO;

@Repository
public interface PaymentRepo extends PagingAndSortingRepository<PaymentDTO, Long> {
	
}
