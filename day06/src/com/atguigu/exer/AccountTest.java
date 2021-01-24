package com.atguigu.exer;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account acct1 = new Account();
		Account acct2 = new Account("qwerty",2000);
		
		Account.setInteresRate(0.012);
		Account.setMinMoney(100);
		
		System.out.println(acct1);
		System.out.println(acct2);
		
		System.out.println(acct1.getInteresRate());
		System.out.println(acct1.getMinMoney());
	}

}
