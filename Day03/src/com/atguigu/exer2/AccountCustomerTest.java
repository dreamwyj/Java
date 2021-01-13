package com.atguigu.exer2;
/*
 * (1) 创建一个 Customer ，名字叫 Jane Smith, 
 * 		他有一个账号为 1000，余额为 2000 元，年利率为 1.23% 的账户。 
 * (2) 对 Jane Smith 操作。存入 100 元，再取出 960 元。再取出 2000 元。 
 * 		打印出 Jane Smith 的基本信息
 */
public class AccountCustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer("Jane","Smith");
		Account a = new Account(1000,2000,0.0123);
		//AccountCustomerTest test = new info(c);
		c.setAccount(a);
		AccountCustomerTest test = new AccountCustomerTest();
		test.info(c);
		(c.getAccount()).deposit(100);
		test.info(c);
		(c.getAccount()).withdraw(960);
		test.info(c);
		(c.getAccount()).withdraw(2000);
		test.info(c);
		System.out.println("Customer  [" + c.getLastName() + ", " + c.getFirstName()
		+ "] has a account: id is " + c.getAccount().getId() + ", annualInterestRate is "
		+ c.getAccount().getAnnualInterestRate()*100 + "%, balance is " 
		+ c.getAccount().getBalance());
		
	}
	public void info(Customer c){
		System.out.println("现在账户信息：");
		System.out.println("\tid\t\tname\t\tbalance\t\tannualInterestRate");
		System.out.println("\t" + (c.getAccount()).getId() + "\t\t" +c.getFirstName() 
						+ " " + c.getLastName()+ "\t" +
						(c.getAccount()).getBalance() + "\t\t" 
						+ (c.getAccount()).getAnnualInterestRate()*100 + "%");
	}

}
