package com.atguigu.exer;

public class RecursionTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
			
		}
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		int sum2 = test.getmul(100);
		int sum3 = test.f(10);
		int sum4 = test.Fibonacci(10);
		System.out.println(sum4);
		
	}
	// 计算 1 - n 之间所有自然数的和
	public int getSum(int n){
		if(n==1)
			return 1;
		else
			return n + getSum(n - 1);
		
	}
	// 计算 1 - n 之间所有自然数的乘积
		public int getmul(int n){
			if(n==1)
				return 1;
			else
				return n * getSum(n - 1);
			
		}
	//已知有一个数列:f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
	//	其中n是大于0的整数，求f(10)的值。
		public int f(int n){
			if(n == 0)
				return 1;
			else if(n==1)
				return 4;
			else
				return f(n - 1)*2 + f(n - 2);
			
		}
		//例4:斐波那契额
		public int Fibonacci(int u) {
			if(u == 0)
				return 0;
			else if(u == 1)
				return 1;
			else
				return f(u-1) + f(u-2);
			
		}
		//例5:汉诺塔问题
		
		//例6:快排

}
