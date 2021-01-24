package com.atguigu.exer;


public class SingleTest1 {
	public static void main(String[] args) {
		
	}

}
// 饿汉设计模式
class Bank {
	private Bank() {
		
	}
	static Bank bank = new Bank();
	
	public static Bank getBank() {
		return bank;
	}
	
}