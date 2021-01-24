package com.atguigu.java;

import java.util.Iterator;

/*
 * 抽象类的应用：模版方法的设计模式
 */
public class TemplateTest {
	public static void main(String[] args) {
		SubTemplate template = new SubTemplate();
		template.spendTime();
	}

}

abstract class Template{
	// 计算某段代码所需要花费的时间
	public void spendTime() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		code();//不确定的部分，易变的部分
		
		long end = System.currentTimeMillis();
		
		System.out.println("花费的时间为：" + (end - start));

	}
	public abstract void code();
}
class SubTemplate extends Template{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j == 0) {
					flag = false;
					break;
				}
				
				
			}
			if (flag) {
				System.out.println(i);
			}
		}
		
	}
	
}
