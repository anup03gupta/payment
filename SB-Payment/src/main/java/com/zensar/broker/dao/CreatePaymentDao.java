package com.zensar.broker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.AccountDTO;


@Repository
public interface CreatePaymentDao {

	public List<AccountDTO> getAccountDetails();

}
