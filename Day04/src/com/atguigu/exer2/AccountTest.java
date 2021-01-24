package com.atguigu.exer2;
/*
 * 写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利
率。
 * 写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。

balance的1.private变量通过set(),get()方法进行调用
		 2.改为protected变量
 */
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000, 4.5);
		account.withdraw(30000);
		System.out.println("您的账户余额为：" + account.getBalance());
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("您的账户余额为：" + account.getBalance() + "月利率：" + account.getMonthlyInterest()*100+"%");

		System.out.println("****************");
		CheckAccount checkAccount = new CheckAccount(1122, 20000, 4.5, 5000);
		checkAccount.withdraw(5000);
		System.out.println("您的余额为：" + checkAccount.getBalance());
		System.out.println("您的可透支额为：" + checkAccount.getOverdraft());
		System.out.println();
		checkAccount.withdraw(18000);
		System.out.println("您的余额为：" + checkAccount.getBalance());
		System.out.println("您的可透支额为：" + checkAccount.getOverdraft());
		System.out.println();
		checkAccount.withdraw(3000);
		System.out.println("您的余额为：" + checkAccount.getBalance());
		System.out.println("您的可透支额为：" + checkAccount.getOverdraft());
		
	}

}
