package chapter4;

public class Pingpang44 {
	// 将两队看成数字，使用枚举法
	public static void main(String[] args) {
		char[] team = {'x','y','z'};
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					if (i != 1&&i != 3&&k != 3&&i != j&& i != k&&k != j) {
						System.out.println("a:" + team[i - 1]);
						System.out.println("b:" + team[j - 1]);
						System.out.println("c:" + team[k - 1]);
					}
				}
			}
		}
	}

}
