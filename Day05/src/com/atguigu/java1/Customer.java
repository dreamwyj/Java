package com.atguigu.java1;

public class Customer {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//自动生成的equals（）
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	// 自动实现
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	
	//手动实现equals重写
	// 重写原则：比较两个对象的实体内容是否相同
//	public boolean equals(Object obj) {
//		System.out.println("Customer equals()...");
//        if (this == obj) {
//			return true;
//		}
//        if (obj instanceof Customer) {
//			Customer customer = (Customer)obj;
//			// 比较两个对象属性是否都相同
////			if(this.age == customer.age && this.name.equals(customer))
////				return true;
////			else {
////				return false;
////			}
//			return this.age == customer.age && this.name.equals(customer.name);
//		}else {
//			return false;
//		}
//        
//    }
//	@Override
//	public String toString() {
//		return "Customer[name = " + name + ",age = " + age + "]";
//	}

}
