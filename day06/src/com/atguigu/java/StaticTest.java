package com.atguigu.java;


/*
 * static关键字的使用
 * 1.static可以用来修饰：属性，方法，代码块，内部类
 * 2.使用static修饰属性:静态变量
 * 		2.1 属性：按是否使用static修饰，分为静态属性 vs 非静态属性（实例变量）
 * ---> 实例变量：当创建了类的多个对象，每个对象都独立拥有一套类中的非静态属性，
 * 当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。
 * ---> 静态变量：创建了类的多个对象，多个对象共享一个静态变量。当通过某一个对象修改静态变量时，
 * 会导致其他对象调用此静态变量时是修改过的。
 * 3.使用static修饰方法:
 *  	3.1 static修饰属性的其他说明：
 *  		1.静态变量随着类的加载而加载，可以通过“类.静态变量”的方式进行调用。
 *  		2.静态变量的加载早于对象的创建
 *  		3.由于类只会加载一次，则静态变量在内存中也只会加载一份，存在方法区的静态域中。
 *  		4.	  	类变量  		实例变量
 *  		类		yes			no
 *  		对象		yes			yes
 *		3.2.静态属性举例：System.out； Math.PI ;
 *4.使用static修饰方法，静态方法
 *		1.随着类的加载而加载，可以通过“类.静态方法”的方式进行调用。
 *		2.	（静态方法）类方法  	非静态方法	
 *  	类		yes					no
 *  	对象		yes					yes
 *  	3.静态方法中，只能调用静态的方法或属性
 *  	非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性。
 * 5.static 注意点：
 * 	 5.1 在静态的方法内，不能使用this关键字，super关键字
 * 6.在开发中，如何确定一个属性是否要声明为static的？
 * 		-> 属性是可以被多个对象所共享的，不会随着对象的不同而不同。
 * 
 * 	 在开发中，如何确定一个方法是否要声明为static的?
 * 		-> 操作属性的方法，通常设置为static的
 * 		-> 工具类中的方法，习惯上声明static的。Math,Arrays,Collections
 */
public class StaticTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Chinese.nationString = "中国";
				Chinese c1 = new Chinese();
				c1.nameString = "姚明";
				c1.age = 40;

				Chinese c2 = new Chinese();
				c2.nameString = "马龙";
				c2.age = 30;
				c1.nationString = "CNN";
				System.out.println(c2.nationString);
	} 
		
	

}
// 中国人
class Chinese{
	String nameString;
	int age;
	static String nationString;
	
	public void eat() {
		System.out.println("中国人吃中餐");
		//调用非静态结构
		this.info();
		System.out.println("name:" + nameString);
		//调用静态结构
		walk();
		System.out.println("nation:" + nationString);
	}
	
	public static void show() {
		System.out.println("我是一个中国人！");
		// 不能调用非静态的结构
//		eat();
//		nameString = "Tom";
		// 可以调用静态结构
		System.out.println(Chinese.nationString);
		walk();
	}
	
	public void info() {
		System.out.println("name:" + nameString +",age:" + age);
	}
	public static void walk() {
		System.out.println("人走路");
	}
}
