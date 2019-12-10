package com.zensar.broker.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.PaymentDTO;

@Repository
public interface PaymentRepo extends CrudRepository<PaymentDTO, Long> {
	
}
