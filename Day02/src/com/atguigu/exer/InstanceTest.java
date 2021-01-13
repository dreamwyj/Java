package com.atguigu.exer;
/**
 * 一，理解“万物万物皆对象”
 * 1.在Java语言范畴中，将功能，结构等封装到类中，通过类的实例化，来调用具体的功能结构
 *  	
 * 2.涉及Java语言与前端HTML，后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类，对象
 * 二，内存解析说明
 * 引用类型的变量 只可能储存两类值：null 或 地址值（含变量的类型）
 * 三，匿名对象的使用
 * 1.理解：创建的对象，没有显示的赋给一个变量名，即为匿名对象
 * 2.特征：匿名对象只能调用一次。
 * 3.使用
 * @Description 
 * @author Olivia Email:2736737597@qq.com
 * @version
 * @date 2021年1月7日下午2:50:59
 * 
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		// 匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
		new Phone().price = 1999;
		new Phone().showPrice();
		PhoneMall mall = new PhoneMall();
		//mall.show(p);
		 mall.show(new Phone());
	}
}
 class PhoneMall{
	 public void show(Phone phone) {
		 phone.sendEmail();
		 phone.playGame();
		 
	 }
 }
class Phone{
	double price;
	
	public void sendEmail(){
		System.out.println("发送邮件");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}
	public void showPrice() {
		System.out.println("手机价格为： " + price);
	}
}
