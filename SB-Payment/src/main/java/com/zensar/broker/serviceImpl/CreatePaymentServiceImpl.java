package com.zensar.broker.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.broker.bean.CreateNewPaymentRequest;
import com.zensar.broker.dao.CreatePaymentDao;
import com.zensar.broker.dto.AccountDTO;
import com.zensar.broker.dto.BeneficiaryDTO;
import com.zensar.broker.dto.PaymentDTO;
import com.zensar.broker.repo.AccountRepo;
import com.zensar.broker.repo.BeneficiaryRepo;
import com.zensar.broker.repo.PaymentRepo;
import com.zensar.broker.service.CreatePaymentService;

@Service
public class CreatePaymentServiceImpl implements CreatePaymentService {

	@Autowired
	CreatePaymentDao createPaymentDao;

	@Autowired
	PaymentRepo paymentRepo;

	@Autowired
	AccountRepo accountRepo;

	@Autowired
	BeneficiaryRepo beneficiaryRepo;

	@Override
	public List<AccountDTO> getAccountDetails() {
		return createPaymentDao.getAccountDetails();
	}

	@Override
	public Iterable<PaymentDTO> getAllPayments(Integer pageNo, Integer pageSize, String sortBy, String order) {
		Sort sort = ((order.equalsIgnoreCase("DESC") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending()));

		Pageable paging = PageRequest.of(pageNo, pageSize, sort);
		Page<PaymentDTO> pagedResult = paymentRepo.findAll(paging);
		
		return ((pagedResult.hasContent()) ? pagedResult.getContent() : new ArrayList<PaymentDTO>());
	}

	@Transactional
	@Override
	public String createNewPayment(CreateNewPaymentRequest payment) {

		PaymentDTO newPayment = new PaymentDTO();
		newPayment.setAmount(payment.getAmount());
		newPayment.setBatchDescription(payment.getVarialeReference());
		newPayment.setBatchId(payment.getBeneficiaryId());
		newPayment.setStatus("Success");
		newPayment.setValueDate(LocalDate.now());

		AccountDTO fromAccount = accountRepo.findById(payment.getFromAccountId()).get();
		if (fromAccount.getAmountAvaiable() < payment.getAmount()) {
			return "Insufficient balance.";
		}

		newPayment.setFromAccount(fromAccount.getAccountName());
		newPayment.setFromAccountId(fromAccount);

		BeneficiaryDTO beneficiaryDTO = beneficiaryRepo.findById(payment.getBeneficiaryId()).get();
		AccountDTO toAccount = beneficiaryDTO.getToAccount();
		newPayment.setToAccountId(toAccount);

		paymentRepo.save(newPayment);

		fromAccount.setAmountAvaiable((fromAccount.getAmountAvaiable() - payment.getAmount()));
		accountRepo.save(fromAccount);

		toAccount.setAmountAvaiable((toAccount.getAmountAvaiable() + payment.getAmount()));
		accountRepo.save(toAccount);

		return "Transaction successful.";
	}

}
