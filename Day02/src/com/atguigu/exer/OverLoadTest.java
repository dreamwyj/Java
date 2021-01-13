package com.atguigu.exer;
/*
 * 方法的重载
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。 
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。 
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 3.定义三个重载方法max()，
 * 第一个方法求两个int值中的最大值，
 * 第二个方 法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值， 
 * 并分别调用三个方法。
 */
public class OverLoadTest {
	// 1.如下的三个方法构成重载:
	public int mOL(int x){
		return x*x;
	}
	public int mOL(int x,int y) {
		return x*y;
	}
	public void mOL(String str) {
		System.out.println(str); 
	}
	
	// 2.
	public int max(int i,int j){
		return (i > j )? i : j;
		
	}
	public double max(double d1, double d2) {
		return (d1 > d2)? d1 : d2;
	}
	public double max(double d1,double d2,double d3) {
		double max = (d1 > d2)? d1 : d2;
		return (max > d3)? max : d3;
		
	}
	
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		int z = test.mOL(5);
		int answer = test.mOL(4,7);
		System.out.println("z:" + z);
		System.out.println("answer:" + answer);
		test.mOL("放轻松！");
		
	}

}
