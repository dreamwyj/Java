package com.atguigu.java;
/*
 * 面向对象的特征二：继承性
 * 一，继承的好处
 * 1.减少了代码的冗余，提高了代码的复用性
 * 2.便于功能的扩展
 * 3.为之后的多态性的使用，提供了前提。
 * 二，继承性的格式： class A extends B{}
 *  A:子类，派生类，subclass
 *  B:父类，超类，基类，superclass
 *  
 *  2.1 体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有结构，属性，方法。
 *  特别：父类声明为private的属性或方法，子类继承父类以后，仍然认为获取父类中私有的结构。
 *  只是因为封装性的影响，使得子类不能直接调用父类的结构而已。
 *  2.2 子类继承父类以后，还可以声明自己特有的属性和方法，实现功能的拓展。
 *  子类和父类的关系，不同于自己和集合的关系。
 *  extends:延展，扩展
 *  三，Java中关于继承的规定
 *  1.一个类可以被多个子类继承
 *  2.Java中类的单继承性，一个类只能有一个父类
 *  3.子父类是相对的概念。
 *  4.子类直接继承的父类称为：直接父类，间接继承的父类称为：间接父类
 *  5.子类继承父类以后，就获取了直接父类以及所有间接父类声明的属性和方法
 *  
 *  四，
 *  1.如果没有显示的声明一个类的父类的话，则此类继承于java.lang.Object类
 *  2.所有java类（除java.lang.Object类之外）都直接或间接的继承于java.lang.Object类
 *  3.意味着所有JAVA类具有java.lang.Object类声明的功能。
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		//p1.age = 1;
		p1.eat();
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		s1.name = "Tom";
		s1.setAge(10);
		System.out.println(s1.getAge());
		s1.breath();
		Creature c = new Creature();
		c.breath();
	}

}
