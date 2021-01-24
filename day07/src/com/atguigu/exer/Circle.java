package com.atguigu.exer;

public class Circle extends GeomertricObject{
	
	private double radius;
	
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
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
