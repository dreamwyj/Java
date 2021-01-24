package com.atguigu.exer2;

public class Circle {
	private double radius;
	
	protected Circle(){
		radius = 1;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return radius*radius*Math.PI;
	}
	

}
