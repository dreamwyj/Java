package com.athuihu.exer1;
/*
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，
 * 调用compareTo方法比较两个类的半径大小。
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		ComparableCircle circle1 = new ComparableCircle(2);
		ComparableCircle circle2 = new ComparableCircle(3);
		
		if(circle1.compareTo(circle2)>0) {
			System.out.println("Circle1半径大");
		}
		else if(circle1.compareTo(circle2)<0) {
			System.out.println("Circle2半径大");
		}
		else {
			System.out.println("两个圆的半径相等");
		}
		
		ComparableRectangle rectangle1 = new ComparableRectangle(5, 3);
		ComparableRectangle rectangle2 = new ComparableRectangle(2, 3);
		if(rectangle1.compareTo(rectangle2)>0) {
			System.out.println("rectangle1半径大");
		}
		else if(rectangle1.compareTo(rectangle2)<0) {
			System.out.println("rectangle2面积大");
		}
		else {
			System.out.println("两个矩形的面积相等");
		}
	}
}
