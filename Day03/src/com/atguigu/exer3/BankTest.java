package com.atguigu.exer3;

public class BankTest {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.addCustomer("Job", "Smith");
//		System.out.println("id:" + b.getNumOfCustomers());
//		System.out.println("name:" + b.getCustomer(0).getLastName() + " " +
//		b.getCustomer(0).getFirstName());
////		Customer c = new Customer(null, null)
//		Account account = new Account(1000);
////		b.getCustomer(0).getAccount() = account;
//		System.out.println("Account:" + b.getCustomer(0).getAccount().getBalance());
		// 连续操作
		b.getCustomer(0).setAccount(new Account(2000)); //用匿名对象调用
		b.getCustomer(0).getAccount().withdraw(500);
		double balance = b.getCustomer(0).getAccount().getBalance();
		System.out.println("客户: " + b.getCustomer(0).getFirstName() + " 的账户余额为: "
		+ balance);
		System.out.println("*********************");
		b.addCustomer("万里", "王");
		System.out.println("银行客户的个数为: " + b.getNumOfCustomers());
	}

}
