package com.atguigu.exer3;

public class Account {
	private double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	//存款
	public void desposit(double amt) {
		if(amt > 0) {
			balance += amt;
			System.out.println("存款金额:" + amt);
		}
	}
	//取钱
	public void withdraw(double amt) {
		if(balance - amt >= 0) {
			balance -= amt;
			System.out.println("取款金额:" + amt);
		}
			
		else
			System.out.println("余额不足");
	}

}
