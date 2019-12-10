package com.zensar.broker.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary")
public class BeneficiaryDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "ben_code")
	private Long beneficiaryCode;
	
	@ManyToOne
	private AccountDTO fromAccount;
	
	@ManyToOne
	private AccountDTO toAccount;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "statement_references")
	private String statementReferences;

	public BeneficiaryDTO() {
		super();
	}
	
	public BeneficiaryDTO(Long id, Long beneficiaryCode, AccountDTO fromAccount, AccountDTO toAccount, String status,
			String statementReferences) {
		super();
		this.id = id;
		this.beneficiaryCode = beneficiaryCode;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.status = status;
		this.statementReferences = statementReferences;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBeneficiaryCode() {
		return beneficiaryCode;
	}

	public void setBeneficiaryCode(Long beneficiaryCode) {
		this.beneficiaryCode = beneficiaryCode;
	}

	public AccountDTO getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(AccountDTO fromAccount) {
		this.fromAccount = fromAccount;
	}

	public AccountDTO getToAccount() {
		return toAccount;
	}

	public void setToAccount(AccountDTO toAccount) {
		this.toAccount = toAccount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatementReferences() {
		return statementReferences;
	}

	public void setStatementReferences(String statementReferences) {
		this.statementReferences = statementReferences;
	}
}
