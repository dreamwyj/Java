package com.atguigu.exer;

public class Graduate extends Student{
	public String major = "IT";
	public String getInfo() {
		return "Name:" + name + "\nage:" + age + "\nschool:" + 
	school + "\nmajor:" + major;
	}

}
