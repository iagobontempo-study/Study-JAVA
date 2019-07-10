package entities;

import exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit() {
		
	}
	
	public void withdraw(double withdraw) throws DomainException{
		if (withdraw > withdrawLimit) {
			throw new DomainException("The ammount exceeds withdraw limit");
		} else if (withdraw > balance) {
			throw new DomainException("The ammount exceeds balance limit");
		}
		balance -= withdraw;
	}
	
}
