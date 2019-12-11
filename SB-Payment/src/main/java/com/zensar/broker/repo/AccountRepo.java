package com.zensar.broker.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.zensar.broker.dto.AccountDTO;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<AccountDTO, Long> {

}
