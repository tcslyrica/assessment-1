package com.assessment.accountType;
import java.util.Date;
public class CurrentAccount {

	private int balance;
	private String ownerName;
	private String account_type;
	private Date create_date;
	private boolean account_status;
	private Long overdraftBalance;
	public CurrentAccount(int balance, String ownerName, String account_type, Date create_date, boolean account_status,
			Long overdraftBalance) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.account_type = account_type;
		this.create_date = create_date;
		this.account_status = account_status;
		this.overdraftBalance = overdraftBalance;
	}
	public int getBalance() {
		return balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getAccount_type() {
		return account_type;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public boolean isAccount_status() {
		return account_status;
	}
	public Long getOverdraftBalance() {
		return overdraftBalance;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public void setAccount_status(boolean account_status) {
		this.account_status = account_status;
	}
	

	}

