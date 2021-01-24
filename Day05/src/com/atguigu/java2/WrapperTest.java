package com.atguigu.java2;
/*
 * 包装类的使用：
 * 1.Java提供了8种基本数据类型对应的包装类，
 * 使得基本数据类型的变量具有类的特征
 * 
 * 2.掌握的：基本数据类型，包装类，Strings三者之间的相互转换。
 * 
 */

import org.junit.Test;

import com.sun.jdi.Type;

public class WrapperTest {
	
	//String类型 ---> 基本数据类型，包装类
	// 调用包转类的parseXXX(String s)
	@Test
	public void test5() {
		String str1 = "123";
		// 错误的情况
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
		//可能会报NumberFormatException
		int num2 = Integer.parseInt(str1);
		System.out.println(num2);
		
		String str2 = "true1";
		boolean flag = Boolean.parseBoolean(str2);
		System.out.println("******" + flag);
	}
	
	//基本数据类型，包装类 ---> String类型
	// 调用String重载的valueOf(Xxx xxx)
	@Test
	public void test4() {
		
		int num1 = 10;
		// 方式1：链接运算
		String str1 = num1 + "";
		// 方式2:调用String的valueOf(XX)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);//"12.3"
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
	@Test
	public void test3() {
		// 自动装箱：基本数据类型 ---> 包装类
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		// 自动拆箱:包装类 ---> 基本数据类型
		System.out.println(in1.toString());
		int num3 = in1;
	}
	
	// 包装类 -----> 基本数据类型:调用包装类的 XXXvalue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Float float1 = new Float(12.3);
		float float2 = float1.floatValue();
		System.out.println(float2);
	}
	
	// 基本数据类型 -----> 包装类，调用包装类的构造器
	@Test
	public void test1() {
		
		int num1 = 10;
//		System.out.println(in1.toString());
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2);
		
//		// 报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in2);
		
		Float float1 = new Float(12.3f);
		Float float2 = new Float("12.3");
		System.out.println(float1 + " " +float2);
		
		Boolean boolean1 = new Boolean(true); //true
		Boolean boolean2 = new Boolean("true"); //false
		System.out.println(boolean1 + " " + boolean2);
		
		Order order = new Order();
		System.out.println(order.isMale);// false
		System.out.println(order.isFemale);// null
	}

}
class Order{
	
	boolean isMale;
	Boolean isFemale;
}
