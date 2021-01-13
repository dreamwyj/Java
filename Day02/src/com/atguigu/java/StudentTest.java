package com.atguigu.java;

public class StudentTest {
	
	public static void main(String[] args) {
		// 声明 Student 类型的数组
		Student[] stu = new Student[20];
		
		for(int i = 0;i < stu.length;i++){
			// 给数组元素赋值
			stu[i] = new Student();
			stu[i].number = i+1;
			// 年级：[1,6]
			stu[i].state = (int)(Math.random()*(6-1+1)+1);
			// 成绩：[0,100]
			stu[i].score = (int)(Math.random()*(100-0+1)+0);
		}	
		for(int i = 0;i < stu.length;i++) {
			//System.out.println("学号:" + stu[i].number + "年级:" + stu[i].state + "成绩:" + stu[i].score);
			System.out.println(stu[i].info());
		}
		System.out.println("3年级学生信息：");
		for(int i = 0;i < stu.length;i++) {
			if(stu[i].state == 3)
				System.out.println(stu[i].info());
		}
		System.out.println("按学生成绩排序：");
		for(int i = 0;i < stu.length-1;i++) {
			for(int j = 0;j < stu.length-1-i;j++) {
				if(stu[j].score < stu[j+1].score){
					// 如果需要换顺序，交换的是数组的元素，Student对象
					Student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j + 1] = temp;
				}		
			}	
		}
		for(int i = 0;i < stu.length;i++) {
			System.out.println(stu[i].info());
		}
		}
	}


class Student{
	int number;
	int state;
	int score;
	
	String info(){
		return "学号" + number + "年级" + state + "成绩" + score;
		
		
	}
}