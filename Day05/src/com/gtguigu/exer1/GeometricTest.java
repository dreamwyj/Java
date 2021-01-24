package com.gtguigu.exer1;

public class GeometricTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricTest test = new GeometricTest();
		GeomertricObject o1 = new Circle(3, "红", 34);
		GeomertricObject o2 = new MyRectangle(3, 4, "绿", 54);
		test.displayGeometricObject(new Circle(3, "红", 34));
		test.displayGeometricObject(new MyRectangle(3, 4, "绿", 54));
		System.out.println(test.equalsArea(o1,o2));

	}
	public boolean equalsArea(GeomertricObject o1,GeomertricObject o2) {
//		GeomertricObject geomertricObject = new Circle(3, "红", 34);
//		GeomertricObject geomertricObject2 = new MyRectangle(3, 4, "绿", 54);
//		if(geomertricObject.findArea()== geomertricObject2.findArea())
//			return true;
//		else {
//			return false;
//		}
		return o1.findArea()== o2.findArea();
	}
	public void displayGeometricObject(GeomertricObject g) {
		System.out.println("面积：" + g.findArea());
	}

}
