package com.atguigu.exer;

import java.util.Scanner;

//import java.util.Scanner;
/*
 * 从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。 
 * 成绩>=最高分-10 等级为’A’ 
 * 成绩>=最高分-20 等级为’B’ 
 * 成绩>=最高分-30 等级为’C’
其余 等级为’D’
提示:先读入学生人数，根据人数创建int数组， 存放学生成绩。
 */
public class ArrayTest {

	public static void main(String[] args) {
		int num,max=0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		num = input.nextInt();
		
		int[] grade = new int[num];
		System.out.println("请输入" + num + "个成绩");
		for(int i=0; i < grade.length; i++) {
			grade[i] = input.nextInt();
			if(max < grade[i])
			{
				max = grade[i];
			}
		}
		for(int i=0; i < grade.length; i++) {
			//System.out.println(grade[i]);
			int score = (max-grade[i])/10;
			char fame;
			switch (score) {
			case 0: fame = 'A';break;
			case 1: fame = 'B';break;
			case 2: fame = 'C';break;
			default: fame = 'D';}
			System.out.println("student "+i+" scores is "+grade[i]+" is "+fame);
				
				
			
			
			}
		}
		
		
	}


