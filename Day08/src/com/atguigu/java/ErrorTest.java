package com.atguigu.java;
/*
 * Error:
 * Java虚拟机无法解决的严重问题。如JVM系统内部错误，资源耗尽等严重情况
 * 一般不编写针对性的代码进行处理。
 * 
 */
public class ErrorTest {
	public static void main(String[] args) {
		// 1.栈溢出:java.lang.StackOverflowError
//		main(args);
		// 2.堆溢出:java.lang.OutOfMemoryError
//		Integer[] arr = new Integer[1024*1024*1024];
	}

}
