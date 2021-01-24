package com.atguigu.java4;
/*
 * super关键字的使用
 * 1.super理解为父类的
 * 2.super可以用来调用：属性，方法，构造器
 * 
 * 3.super的使用，调用属性和方法
 * 
 * 3.1 在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，
 * 显示的调用父类中声明的属性或方法。但通常情况下，习惯省略“super”
 * 3.2 特殊情况：当子类和父类中定义了同名的属性时，想在子类中调用父类中声明的属性，
 * 则必须显式的使用“super.属性”的方式，表明调用的是父类中声明的属性。
 * 3.3 特殊情况：当子类重写了父类当中的方法以后，想在子类中调用重写的方法时，
 * 则必须显示的使用“super.方法”的方式，表明调用的是父类中被重写的方法。
 * 
 * 4.super调用构造器
 * 4.1可以在子类构造其中显式的使用“super(形参列表)"的方式调用父类中声明的指定构造器。
 * 4.2“super(形参列表)”的使用，必须声明在子类构造器的首行。
 * 4.3 在类的构造器中，针对于“this(形参列表)”或“super(形参列表)”只能二选一，不能同时出现
 * 4.4在构造器的首行，没有显示的声明“this(形参列表)”或“super(形参列表)”，
 * 默认是父类的空参构造器。
 * 4.5在类的多个构造其中，至少有一个类的构造器中使用了"super(形参列表)"，
 * 调用父类中的构造器。
 */
public class SuperTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.show();
		System.out.println();
		student.study();
		Student student2 = new Student("Tom",22,"IT");
		student2.show();
	}

}
