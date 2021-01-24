package com.atguigu.exer2;
/*
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断其半径是否相等；利用
toString()方法输出其半径。
 */
public class GeometricTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(3,"red",45);
		Circle circle2 = new Circle(3,"green",45);
		Circle circle3 = new Circle(5,"green",45);
		
		System.out.println(circle1.equals(circle3));
		
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.toString());
		
		if(circle2.getColor().equals(circle3.getColor()))
			System.out.println("颜色相同");
		else {
			System.out.println("颜色不同");
		}
	}
	

}
