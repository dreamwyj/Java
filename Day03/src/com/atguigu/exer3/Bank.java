package com.atguigu.exer3;

public class Bank {
//	private Customer[] cus = new Customer[9];
	private Customer[] customers = new Customer[9]; // 存放多个客户的数组
	private int numberOfCustomer; // 记录客户的个数

	public Bank() {
		
	}
	// 添加客户
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);
		
		customers[numberOfCustomer++] = cust;
		//numberOfCustomer++;
	}
	// 获取客户个数
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	// 获取指定位置上的客户
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomer) {
			return customers[index];
	}
		else {
			return null;
		}
			
}
}
