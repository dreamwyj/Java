package com.atguigu.java;

import org.junit.Test;

/*
 * 一，异常体系结构
 * java.lang.Throwable
 * 		-----java.lang.Error:一般不编写针对性的代码进度信息
 * 		-----java.lang.Exception:可以进行异常处理
 * 			> 编译时异常(checked)
 * 				>IOException
 * 					>FileNotFoundException
 * 				>ClassNotFoundException
 * 			>运行时异常(unchecked,RuntimeException)
 * 				>NullPointerException
 * 				>ArrayIndexOutOfBoundException
 * 				>ClassCastException
 * 				>NumberFormatException
 * 				>InputMismatchException
 * 				>ArithmeticException
 * 异常处理
 * 一旦出现异常，生成对应异常对象，并将此对象抛出。一旦抛出以后，其后代吗不再执行。
 * 处理方式：throws try-catch-finally
 * try{
 *   //可能出现的异常代码
 * }catch(异常类型1 变量名1){
 * // 处理异常的方式1
 * }catch(异常类型2 变量名2){
 *  // 处理异常的方式2
 * }
 *  ...
 *  finally{
 *  // 一定执行
 *  }
 *  说明：
 *  1.finally可选
 *  2.try将可能出现异常的代码包起来，在执行过程中一旦生成异常，会生成异常对象，
 *  会与catch括号写的异常对象匹配，匹配成功就进行异常处理，如果没有finally，将会继续执行
 *  后面的代码，则在catch外面声明变量，在catch里面进行赋值。
 *  3.如果catch有子父类关系，一般子类写在父类上面
 *  4.catch常用方法，1. String getMessage(),2.printStackTrace()
 *  5.在try里面定义的变量在外面不能用
 *  try-catch-finally 处理编译时异常，运行时仍可能报错。
 *  6.try-catch-finally 可以嵌套
 *  
 *  finally 
 *  1.finally中声明的是一定会执行的代码，
 *  即使catch有异常，try,catch中有return的情况
 *  2.像数据库连接，
 *  输入输出流，网络编程Socket等资源，JVM是不能自动的回收的，需要自己动手进行资源的释放。
 *  此时资源的释放需要声明在finally中
 *  体会：1.try-catch-finally 将编译时异常延迟到运行时出现。
 *   	 2.针对编译时异常，一定进行异常的处理
 */
public class Exception {
	
	
	//IndexOutOfBoundException
	@Test
	public void Test2() {
		// ArrayIndexOutOfBoundException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		
		//StringIndexOutOfBoundsException
		try {
			String string = "abc";
			System.out.println(string.charAt(3));
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// NullPointerException
	@Test
	public void test1() {
//		int[] arr = null;
//		System.out.println(arr[3]);
		
//		String string = "abc";
//		string = null;
//		System.out.println(string.charAt(0));
	}

}
