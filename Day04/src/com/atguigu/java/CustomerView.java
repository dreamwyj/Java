package com.atguigu.java;



/**
 * 
 * @Description 为主模块，负责菜单的显示和处理用户操作
 * @author oliviau Email:2736737597@qq.com
 * @version
 * @date 2021年1月11日下午9:00:26
 *
 */
public class CustomerView {
	public static void main(String[] args) {
		CustomerList list = new CustomerList();
		list.add("张三", "男", 18, "18971358589", "2891789@qq.com");
		list.add("李三", "女", 8, "18234358589", "28913639@qq.com");
		list.add("王二", "男", 45, "41812378589", "89@qq.com");
		list.add("胡歌", "男", 68, "518971358589", "2669@qq.com");
		list.add("范冰冰", "女", 78, "518971358589", "1789@qq.com");
		list.add("易烊千玺", "男", 98, "618971358589", "91789@qq.com");
		list.add("王菲", "女", 58, "518971358589", "891789@qq.com");
		list.add("谢霆锋", "男", 48, "818971358589", "62891789@qq.com");
		list.add("张柏芝", "女", 38, "718971358589", "52891789@qq.com");
		list.inquire();
		list.delete(2);
		list.inquire();
	}

}
