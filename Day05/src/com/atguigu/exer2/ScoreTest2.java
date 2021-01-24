package com.atguigu.exer2;

import java.util.Scanner;
import java.util.Vector;

/*利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），
 * 找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
 * 而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素：Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 * 
 */
public class ScoreTest2 {
	public static void main(String[] args) {
		// 1.实例化Scanner,用于从键盘获取学生成绩
		Scanner scan = new Scanner(System.in);

		// 2.创建Vector对象，Vector v = new Vector();相当于原来的数组
		Vector vector = new Vector();

		// 3.通过for(;;)或while(true)方式给Vector添加元素
		int maxScore = 0;
		for (;;) {
			System.out.println("请输入学生成绩（以负数代表输入结束）");
			int score = scan.nextInt();
			if (score < 0) {
				break;
			}
			if (score > 100) {
				System.out.println("输入数据非法，请重新输入！");
				continue;
			}
			// 3.1添加操作：v.addElement(Object obj)
			// jdk 5.0之前
//			Integer inScore = new Integer(score);
//			vector.addElement(inScore);// 多态
			// jdk 5.0之后
			vector.addElement(score);//自动装箱
			// 4.获取学生成绩的最大值
			if (score > maxScore) {
				maxScore = score;
			}

		}
		char level;
		// 5.遍历Vector，得到每个学生的成绩，并与最大值比较，得到每个学生的等级。
		for(int i = 0;i < vector.size();i++) {
			Object object = vector.elementAt(i);
			//jdk 5.0之前
//			Integer inScore = (Integer)object;
////			int score = inScore.intValue();
			//jdk 5.0之后
			int score = (int)object;
			if (maxScore - score <= 10) {
				level = 'A';
			}else if (maxScore - score <= 20) {
				level = 'B';
			}else if (maxScore - score <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("Student-" + i + " score is " + score + ",level is " + level);
			
			
		}
	}

}
