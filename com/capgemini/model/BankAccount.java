package com.capgemini.model;

public class BankAccount {

	private long accountId;
	private String accountType;
	private String accountHolderName;
	private double accountbalance;
	
	public BankAccount(String accountHolderName, String accountType, double accountbalance) {
		super();
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountbalance = accountbalance;
	}

	public BankAccount(long accountId, String accountType, String accountHolderName, double accountbalance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountbalance = accountbalance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + ", accountbalance=" + accountbalance + "]";
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	 
	
}
