package com.athuihu.exer1;
/*
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，
 * 用来比较两个圆的半径大小。
 */


public class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
		if (o instanceof Circle) {
			ComparableCircle circle1 = (ComparableCircle)o;
//			int delt = this.getRadius()- circle1.getRadius();
//			return delt;
			return this.getRadius().compareTo(circle1.getRadius());
		}
		return -1;
	}

}
