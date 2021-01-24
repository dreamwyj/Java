package chapter4;

import java.util.Scanner;

public class CallNumber49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
//		int n = 10;// 刚开始人的个数
		boolean[] flag = new boolean[n];
		for (int i = 0; i < flag.length; i++) {
			flag[i] = true;
		}
//		
		int num = 1;//计数 1-3
		while (true) {
			int exsit = 0; // 用来计算还有多少人没有出局
			for (int i = 0; i < flag.length; i++) {
				if (flag[i]) {//只对为出去的人报数
					exsit++; // 计算整个队列中有多少人
					if (num == 3) {
						flag[i] = false; //报道3的人出局
					}
					num++;
				}
				if(num == 4) { // 将报数机器重置
					num = 1;
				}
			}
			if (exsit == 1) {
				break;
			}
			
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				System.out.println("留下的唯一一人是: " + (i + 1) + "号");
				break;
			}
		}
		
		

	}

}
