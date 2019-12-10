package com.zensar.broker.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "account")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "accountno")
	private Long accountNo;
	
	@Column(name = "accountname")
	private String accountName;
	
	@Column(name = "branchno")
	private Integer branchNO;
	
	@Column(name = "branchname")
	private String branchName;
	
	@Column(name = "amount")
	private Double amountAvaiable;
	
	@Column(name = "status")
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fromAccountId")
	private Set<PaymentDTO> myPaidPayments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "toAccountId")
	private Set<PaymentDTO> myReceivedPayments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "toAccount")
	private Set<BeneficiaryDTO> myBeneficiaries;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fromAccount")
	private Set<BeneficiaryDTO> meAsBeneficiaries;
	
	public AccountDTO() {
		super();
	}

	public AccountDTO(Long id, Long accountNo, String accountName, Integer branchNO, String branchName,
			Double amountAvaiable, String status) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.branchNO = branchNO;
		this.branchName = branchName;
		this.amountAvaiable = amountAvaiable;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getBranchNO() {
		return branchNO;
	}

	public void setBranchNO(Integer branchNO) {
		this.branchNO = branchNO;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getAmountAvaiable() {
		return amountAvaiable;
	}

	public void setAmountAvaiable(Double amountAvaiable) {
		this.amountAvaiable = amountAvaiable;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
