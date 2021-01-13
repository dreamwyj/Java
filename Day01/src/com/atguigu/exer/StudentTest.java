package com.atguigu.exer;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stus = new Student[20];
		for(int i = 0 ;i < stus.length ;i++) {
			stus[i] = new Student();
			stus[i].number = i + 1;
			stus[i].state = (int)(Math.random()*(6-1+1)+1);
			stus[i].score = (int)(Math.random()*100+0);
		}
		// 打印生成的学生表
		for(int i = 0;i < stus.length;i++) {
			System.out.println(stus[i].info());
		}
		// 搜索年级为三的学生表
		System.out.println("3年级学生成绩:");
		SearchTest(stus,3);
		// 冒泡排序学生表
		sort(stus);
		System.out.println("按成绩排序后:");
		print(stus);
				
		

	}
    public static void print(Student[] stus) {
		for(int i = 0;i < stus.length;i++) {
			System.out.println(stus[i].info());
		}
		
	}
    public static void SearchTest(Student[] stus,int state) {
    	for(int j = 0;j < stus.length;j++) {
			if(stus[j].state == 3) {
				System.out.println(stus[j].info());
			}
		}
    }
    public static void sort(Student[] stus) {
    	for(int i = 0;i < stus.length - 1;i++) {
			for(int j = 0;j < stus.length - i -1;j++) {
				
				if(stus[j].score < stus[j+1].score) {
					Student temp = new Student();
					temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
					
				}
				
			}
		}
    }

}

class Student{
	int number;
	int state;
	int score;
	
	public String info() {
		return "学号:" + number + "年级:" + state + "成绩:" + score;
	}
	
	
}
