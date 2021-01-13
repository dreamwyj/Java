package com.atguigu.p2.bean;

public class Customer {
	
	private String name; // 客户姓名
	private char sex; // 性别
	private int age;	// 年龄
	private String phone; // 电话号码
	private String email; //电子邮箱
	
	
	
	public Customer() {
		
	}

	public Customer(String name, char sex, int age, String phone, String email) {
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	

}
