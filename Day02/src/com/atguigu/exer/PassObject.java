package com.atguigu.exer;
/*
 * 定义一个类PassObject，在类中定义一个方法printAreas()，
 * 该方法的定义 如下:public void printAreas(Circle c, int time) 
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。 
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 在main方法中调用printAreas()方法，调 用完毕后输出当前半径值。

 */
public class PassObject {
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject test = new PassObject();
		System.out.println("Radius" + "\t\tArea");
		test.printAreas(c,5);
		
	}
	public void printAreas(Circle c, int time){
		for(int i = 1;i <= time;i++){
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
			
			
		}
		
	}

}
