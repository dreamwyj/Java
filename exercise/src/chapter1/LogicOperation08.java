package chapter1;
import java.util.Scanner;

public class LogicOperation08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		System.out.println("输入三个数：");
		for (int i = 0; i < num.length; i++) {
			System.out.println("输入第" + (i+1) + "个数：");
			num[i] = scan.nextInt();
		}
		System.out.print("与其他两个数不同的是:  ");
		if (num[0]==num[1]) {
			System.out.println("第三个数  " + num[3]);
		}
		else if(num[0] == num[2]) {
			System.out.println("第二个数 " + num[1]);
		}
		else {
			System.out.println("第一个数 " + num[0]);
		}
	}

}
