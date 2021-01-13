package com.atguigu.exer2;

public class Girl {
	private String name;
	private int age;
	
	Girl(){
		
	}
	Girl(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void marry(Boy boy) {
		System.out.println("我想嫁给 "+ boy.getName());
		boy.marry(this);//调用本对象
	}
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author Olivia
	 * @date 2021年1月11日上午10:49:30
	 * @param girl
	 * @return 正数，当前对象大；负数，当前对象小
	 */
	public int compare(Girl girl) {
//		if(this.age > girl.age) {
//			return 1;
//		}else if(this.age < girl.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		return this.age - girl.age;
//		
	}
	

}
