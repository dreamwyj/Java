package com.atguigu.exer;

public class ValueTransferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);
		ValueTransferTest test = new ValueTransferTest();
		test.swap(data);
		System.out.println("m = " + data.m + ", n = " + data.n);
		

	}
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}
	class Data{
		int m;
		int n;
	}


