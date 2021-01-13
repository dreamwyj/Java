package com.atguigu.exer;

public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle t = new TriAngle();
		t.setBase(6);
		t.setHeight(8);
		System.out.println("底边长为:"+t.getBase() + "\n高为:" + t.getHeight());
		TriAngleTest test = new TriAngleTest();
		System.out.println("三角形面积为：" + test.areaTri(t.getHeight(), t.getBase()));
		
	}
	public int areaTri(int height,int base) {
		return height*base/2;
	}
	

}
