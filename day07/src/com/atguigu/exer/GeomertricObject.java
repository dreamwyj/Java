package com.atguigu.exer;

public abstract class GeomertricObject {
	protected String color;
	protected double weight;
	
	protected GeomertricObject(String color,double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract double findArea();

}
