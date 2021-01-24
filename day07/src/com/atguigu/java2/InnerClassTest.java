package com.atguigu.java2;
/*
 * 类的内部成员之五：内部类
 * 1.Java中允许一个类A声明在类B中，则类A就是内部类，类B就是外部类。
 * 
 * 2.内部类的分类：成员内部类(静态，非静态) vs 局部内部类（方法内，代码块类，构造器内）
 * 
 * 3.成员内部类
 * 		一方面，作为外部类的成员。
 * 				> 调用外部类的结构
 * 				> 可以被static修饰
 * 				> 可以被4种不同的权限修饰
 * 
 * 		另一方面，作为一个类
 * 				> 类可以定义属性，方法，构造器等
 * 				> 可以被final修饰，表示此类不能被继承，不使用final,可以被继承
 * 				> 可以被abstract修饰。
 * 
 * 4.关注如下的3个问题
 * 		4.1 如何实例化成员内部类的对象
 * 		4.2 如何在成员内部类中区分调用外部类的结构
 * 		4.3 开发中，局部内部类的使用 见《InnerClassTest1.java》
 * 总结：成员内部类和局部内部类，在编译以后，都会生成字节码文件。
 * 格式： 成员内部类：外部类$内部类名.class
 * 		局部内部类：外部类$数字 内部类名.class
 */
public class InnerClassTest {
	public static void main(String[] args) {
		//创建Dog实例（静态的成员内部类）
		Person.Dog dog = new Person.Dog();
		dog.show();
		// 创建Bird实例（非静态的成员内部类）
//		Person.Dog dog = new Person.Dog();
		Person person = new Person();
		Person.Bird bird = person.new Bird();
		bird.sing();
		System.out.println();
		bird.display("黄鹂");
		
	}

}

class Person{
	String name = "小明";
	int age;
	
	public void eat() {
		System.out.println("人：吃饭");
	}
	
	// 静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("卡拉是条狗");
		}
		
		
	}
	// 非静态成员内部类
	class Bird{
		String name = "杜鹃";
		
		public Bird() {
			
		}
		public void sing() {
			System.out.println("我是一只小小鸟");
			Person.this.eat();// 调用外部类的非静态属性
		}
		
		public void display(String name) {
			System.out.println(name);// 方法的形参
			System.out.println(this.name);// 内部类的属性
			System.out.println(Person.this.name);// 外部内的属性
		}
		
	}
	public void method() {
		// 局部内部类
		class AA{
			
		}
	}
	{
		// 局部内部类
		class BB{
			
		}
	}
	public Person() {
		// 局部内部类
		class CC{
			
		}
	}
	
	
}