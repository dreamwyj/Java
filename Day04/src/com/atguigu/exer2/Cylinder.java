package com.atguigu.exer2;

public class Cylinder extends Circle {
	
	private double length;
	
	public Cylinder() {
		super();
		length = 1;
		
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}

	public double findVolume() {
		return super.findArea()*length;
	}
	public double findArea() {
		return super.findArea()*2 + length*2*super.getRadius()*Math.PI;
	}
}
