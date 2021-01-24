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
public class ScoreTest {
	public static void main(String[] args) {
		// 1.实例化Scanner，用于从键盘获取学生成绩
		Scanner scan = new Scanner(System.in);

		// 2.创建Vector对象：Vector v=new Vector();
		Vector vector = new Vector();
		// 3.通过for(;;)或while(true)方式：给Vector中添加数组
		int max = 0;

		for (int i = 0;; i++) {
			int score = scan.nextInt();
			if (score < 0) {
				break;
			}

			vector.addElement(score);
			Object object = vector.elementAt(i);
			if (max < score) {
				max = (int) object;
			}
		}
//		System.out.println(max);
		for (int i = 0; i < vector.size() - 1; i++) {
			Object object2 = vector.elementAt(i);
			System.out.print((int)object2 + " ");
			int delt = (max - (int)object2)/10;
			switch (delt) {
			case 0:
				System.out.println("A");
				break;
			case 1:
				System.out.println("B");
				break;
			case 2:
				System.out.println("C");
				break;
			default:
				System.out.println("D");

			}

			// 3.1 添加操作：v.addElement(Object obj)
			// 3.2 当输入是负数时，跳出循环。

			// 4.获取学生成绩的最大值

			// 5.遍历Vector,得到每个学生的成绩，并与最大成绩比较，得到学生的等级。
		}
	}
}