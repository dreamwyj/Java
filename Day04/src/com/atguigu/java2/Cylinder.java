package com.atguigu.java2;

public class Cylinder extends Circle {
	private double length;//高
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
		length = 1.0;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	//返回圆柱的体积
	public double findVolume() {
		double volume = Math.PI * getRadius() * getRadius()* getLength();
		return volume;
	}
	
	
	public double findArea() {//返回圆柱表面积
		return Math.PI * getRadius() * getRadius() * 2 + getRadius()*2*getLength();		
	}

}
