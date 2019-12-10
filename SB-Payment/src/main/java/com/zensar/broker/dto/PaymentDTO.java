package com.zensar.broker.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "payment")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "batch_id")
	private Long batchId;

	@Column(name = "desc")
	private String batchDescription;
	
	@Column(name = "valuedate")
	private LocalDate valueDate;
	
	@Column(name = "from_account")
	private String fromAccount;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.LAZY )
	@JoinColumn(name = "from_account_id")
	private AccountDTO fromAccountId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.LAZY )
	@JoinColumn(name = "to_account_id")
	private AccountDTO toAccountId;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "status")
	private String status;

	
	public PaymentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDTO(long batchId, LocalDate dateCreated, LocalDate valueDate, String batchReference,
			String fromAccount, Double amount, String currency, Integer instructions, String status) {
		super();
		this.batchId = batchId;
		this.valueDate = valueDate;
		this.fromAccount = fromAccount;
		this.amount = amount;
		this.status = status;
	}
	
	public PaymentDTO(Long id, Long batchId, String batchDescription, LocalDate valueDate, String fromAccount,
			AccountDTO fromAccountId, AccountDTO toAccountId, Double amount, String status) {
		super();
		this.id = id;
		this.batchId = batchId;
		this.batchDescription = batchDescription;
		this.valueDate = valueDate;
		this.fromAccount = fromAccount;
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.amount = amount;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getBatchDescription() {
		return batchDescription;
	}

	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}

	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getFromAccountId() {
		return fromAccountId.getId();
	}

	public void setFromAccountId(AccountDTO fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public Long getToAccountId() {
		return toAccountId.getId();
	}

	public void setToAccountId(AccountDTO toAccountId) {
		this.toAccountId = toAccountId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
