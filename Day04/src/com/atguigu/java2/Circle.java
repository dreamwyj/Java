package com.atguigu.java2;

public class Circle {
	private double radius; //半径
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return radius*radius*Math.PI;
	}

}
