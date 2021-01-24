package com.atguigu.exer2;
/*
 * 写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
deposit()。
 */
public class Account {
	private int id;
//	private double balance;// 余额
	protected double balance;// 余额
	private double annualInterestRate;//年利率
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate/100;
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestrate) {
		this.annualInterestRate = annualInterestrate;
	}
	// 返回月利率
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	// 取款
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return;
		}
		
		System.out.println("余额不足！");
		
	}
	// 存款
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		
	}

}
