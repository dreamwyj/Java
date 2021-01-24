package com.atguigu.java;

import java.util.Date;

//import com.sun.org.apache.bcel.internal.generic.NEW;

/*
 * 面向对象特征值三：多态性
 * 
 * 1.理解：可以理解为一个事物的多种形态
 * 2.何为多态性：
 * 		对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类引用）
 * 
 * 3.多态的使用：虚拟方法调用
 * 有了对象的多态性以后，在编译期，只能调用父类中声明的方法，但在运行期间，
 * 实际上调用的是子类重写父类的方法。编译：看左边。执行：看右边。
 * 
 * 4.多态性使用前提：1.类的继承关系	2.方法的重写
 * 5.对象的多态性只使用方法，不适用于属性。（编译和运行都看左边）
 * 
 * 多态是编译时行为还是运行时行为
 * 运行时行为
 * 
 * 子类能否获取父类中的private权限的属性或方法（可以）
 * get,set()方法，将private方法放在共有的方法里。
 * 调用共有的方法。
 */

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		//*******************
		System.out.println("*******");
		// 对象的多态性，父类的引用指向子类的对象
		Person p2 = new Man();
		// 多态的使用，当调用子父类同名同参数的方法时，实际上调用的是子类重写父类的方法
		// ---虚拟方法的调用
		p2.eat();
		p2.walk();
		
//		p2.earnMoney();
		Man m1 = (Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		if (p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.err.println("**woman**");
		}
		if (p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.err.println("**Man**");
		}
		if (p2 instanceof Person) {
			System.out.println("**Person**");
		}
		if(p2 instanceof Object) {
			System.out.println("**Object**");
		}
//		// 问题一：编译时通过，运行时不通过
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
//		
//		// 问题二：编译通过，运行通过
//		Object object = new Woman();
//		Person person = (Person)object;
//		
//		// 问题三：编译不过
//		Man m5 = new Woman();
//		
//		String str = new Date();
//		Object o = new Date();
//		String str1 = (String)o;
		
		
	}

}
