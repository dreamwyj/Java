package com.athuihu.exer1;
/*
 * 
 */
public class ComparableRectangle extends Rectangle implements CompareObject{

	public ComparableRectangle(int length, int width) {
		super(length, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		if (o instanceof Rectangle) {
			ComparableRectangle rectangle1 = (ComparableRectangle)o;
			int area1 = this.findArea();
			int area2 = rectangle1.findArea();
			int delt = area1 - area2;
			return delt;
		}
		return -1;
	}
	
	public int findArea() {
		return getLength()*getWidth();
	}
}
