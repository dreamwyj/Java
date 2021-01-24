package chapter2;

public class YangHuiTest29 {
	final static int N = 10;

	public static void main(String[] args) {
		
		int[][] num = new int[N][N];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					num[i][j] = 1;
				}else {
					num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
				}
				
			}
				
			}
		for (int i = 0; i < num.length; i++) {
			for (int j = N - 1; j > i; j--) {
				if (i < j) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < i + 1; j++) {
				
					System.out.print(num[i][j] + " ");
				
				
			}
			System.out.println();
		}
		}
		
		
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N - i -1; j++) {
//				
//					System.out.print("#");
//				
//				
//			}
//			
//			for (int k = 0; k < N + 1; k++) {
//				if(i == k ) {
//					System.out.print("1");
//				}
//			}
//			
//			System.out.print("#");
//			
//			for (int k = 0; k < N + 1; k++) {
//				if(k == i + 1) {
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//			
//		}

	
}

