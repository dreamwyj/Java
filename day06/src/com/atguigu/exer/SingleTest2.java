package com.atguigu.exer;

public class SingleTest2 {
	public static void main(String[] args) {
		
	}

}

// 懒汉式
class Book{
	
	private Book() {
		
	}
	
	static Book book = null;
	public static Book getBank() {
		if (book == null) {
			book = new Book();
			
		}
		return book;
		
	}
}