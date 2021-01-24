package chapter4;

public class PeachTest50 {

	public static void main(String[] args) {
		// 1.算出满足条件的最后一个猴子拿的桃子
		// 1.1 每个猴子拿桃子的数目
		// 2.算出所有桃子数
		int peachNum = 0;
		for (int j = 1; j < 100000; j++) {
			boolean isflag = true;
			int[] monkey = new int[5];
			for (int i = 0; i < 5; i++) {
				int monkeyPeach = fn(j, i);
				if (monkeyPeach <= 0) { 
					isflag = false;
					break;
				}else {
					monkey[i] = monkeyPeach;
				}
			}
			if (isflag) {//所有猴子拿的桃子数目未出错
				for (int i = 0; i < monkey.length; i++) {
					peachNum += monkey[i];
					System.out.println("第" + (5-i) + "个猴子获得的桃子数：" + monkey[i]);
				}
				peachNum = peachNum + monkey[0]*4 + 5;
				break;
			}
		}
		System.out.println("桃子总数：" + peachNum);
		

	}
	// 猴子拿去的桃子数
	static int fn(int n,int i) {// n 代表桃子数 ，i代表猴子
		if (i == 0) {
			return n;//最后一个猴子拿的桃子
		}
		else {
			// 猴子拿去前的桃子数
			if ((fn(n, i - 1)*5+1)%4 == 0) {
				return (fn(n, i - 1)*5+1)/4;
			}
			else {
				return -1;
			}
		}
//		
	}

}
