package com.atguigu.exer2;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(8, "dhska");
		Order order2 = new Order(8, "dhska");
		System.out.println(order1.equals(order2));
	}

}
