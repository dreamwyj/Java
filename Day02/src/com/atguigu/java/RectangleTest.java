package com.atguigu.java;

class Rectangle {
	public double method(double m,double n) {
		for(int i = 0;i < m ;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		double area = m*n;
		return area;
	}
	

}
public class RectangleTest{
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		double area = rec1.method(3,4);
		System.out.println("矩形的面积是："+area);
	}
	
	
}
