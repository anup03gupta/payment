package com.zensar.broker.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.broker.dao.CreatePaymentDao;
import com.zensar.broker.dto.AccountDTO;

@Repository
public class CreatePaymentDaoImpl implements CreatePaymentDao {

	@Override
	public List<AccountDTO> getAccountDetails() {
		List<AccountDTO> accountList = new ArrayList<>();
		
		//AccountDTO accountDTO1 = new AccountDTO(new Long(12345),"Test Current Act1",51001,"Standard Bank3", 500.0);
		
		return accountList;
	}

}
