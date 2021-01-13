package com.atguigu.exer;
/*
 * 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩 score(int)。 
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。 
 * 问题一:打印出3年级(state值为3)的学生信息。 
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
	public static void main(String[] args){
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
		// 创建测试对象
		StudentTest test = new StudentTest();
		test.print(stu);
		System.out.println("查找三年级的学生成绩：");
		test.SearchState(stu,3);
		test.sort(stu);
		System.out.println("排序后：");
		test.print(stu);
		
	} 	
		/**
		 * 
		 * @Description 遍历Student[]数组的操作
		 * @author Olivia
		 * @date 2021年1月6日下午7:52:06
		 * @param stu
		 */
		public void print(Student[] stu){
			for(int i = 0;i < stu.length;i++) {
				System.out.println(stu[i].info());
			}
		}
		//查找
		/**
		 * 
		 * @Description 查找Student数组中指定年级的学生信息
		 * @author Olivia
		 * @date 2021年1月6日下午7:49:38
		 * @param stu  要查找的数组
		 * @param state  要找的年级
		 */
		public void SearchState(Student[] stu,int state) {
			for(int i = 0;i < stu.length;i++) {
				if(stu[i].state == 3) {
					System.out.println(stu[i].info());
				}
			}
		}
		/**
		 * 
		 * @Description 给Student数组排序
		 * @author Olivia
		 * @date 2021年1月6日下午7:51:27
		 * @param stu
		 */
		public void sort(Student[] stu) {
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
		}
}

class Student {
	int number;
	int state;
	int score;

	String info() {
		return "学号" + number + "年级" + state + "成绩" + score;

	}
}