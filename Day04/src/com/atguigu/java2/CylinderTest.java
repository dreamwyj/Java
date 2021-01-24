package com.atguigu.java2;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(6);
		cylinder.setLength(4);
		System.out.println(cylinder.findArea());
		// 重写前
//		System.out.println(cylinder.findVolume());
		// 重写后
		double area = cylinder.findArea();
		System.out.println("圆柱的表面积：" + area);
	}
	

}
