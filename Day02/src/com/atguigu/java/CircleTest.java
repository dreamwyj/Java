package com.atguigu.java;

public class CircleTest{
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 8;
		//方法一：
		//System.out.println(circle.findArea());
		//方法二：
		circle.findArea();
		
	}
	
	
}//
class Circle{
	double radius;
	// 方法一
//	public double findArea() {
//		return radius*radius*Math.PI;
//		
	// 方法二
	public void findArea() {
		System.out.println(radius*radius*Math.PI);
	}
//	}

}
