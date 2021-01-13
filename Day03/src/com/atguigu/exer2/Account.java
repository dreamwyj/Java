package com.atguigu.exer2;

public class Account {
	private int id; //账户
	private double balance; //余额
	private double annualInterestRate; //利率
	
	public Account(int id, double balance, double annualInterestRate) {
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//  提示:在提款方法 withdraw 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提
	public void withdraw (double amount){//取钱
		if(balance - amount >= 0) {
			balance -= amount;
			System.out.println("取钱" + amount + "成功");
		}
		else
			System.out.println("取钱失败，余额不足");
	}
	
	public void deposit (double amount){//存钱
		balance += amount;
		System.out.println("存钱" + amount +"成功");
	}
	

}
