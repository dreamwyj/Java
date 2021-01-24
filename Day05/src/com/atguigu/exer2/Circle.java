package com.atguigu.exer2;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle() {
		super();
		radius = 1.0;
//		color = "white";
//		weight = 1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
		
	}
	public Circle(double radius,String color,double weight) {
		super(color, weight);
		this.radius = radius;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// 求圆的面积
	public double findArea() {
		return radius*radius*Math.PI;
	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Circle) {
			Circle circle = (Circle)obj;
			return this.radius == circle.radius;
		}
		return false;
	}
	
	public String toString() {
		return "Circle[radius =" + this.getRadius() + "]";
	}

}
