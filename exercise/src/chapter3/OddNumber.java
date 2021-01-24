package chapter3;


public class OddNumber {
	final static int N = 8;

	public static void main(String[] args) {
		int flag = 0;
		boolean[] num = new boolean[N];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i == j) {
					continue;
				}
				for (int j2 = 0; j2 < num.length; j2++) {
					if (i == j2||j == j2) {
						continue;
					}
					for (int k = 0; k < num.length; k++) {
						if (k == j ||k == j2|| k == i) {
							continue;
						}
						for (int k2 = 0; k2 < num.length; k2++) {
							if (k2 == j ||k2 == j2|| k2 == i || k2 == k) {
								continue;
							}
							for (int l = 0; l < num.length; l++) {
								if (l == j ||l == j2|| l == i||l == k||l == k2) {
									continue;
								}
								for (int l2 = 1; l2 < num.length; l2 = l2 + 2) {
									if (l2 == j ||l2 == j2|| l2 == i||l2 == k||l2 == k2||l2 == l) {
										continue;
									}
//									if (l2 != 1||l2 != 3||l2!=5||l2 != 7) {
//										continue;
//									}
									long x = i*1000000 + j*100000 + j2*10000 + k*1000 + k2*100 + l*10 + l2;
//									System.out.println(x);
									flag++;
								}
							}
						}
					}
				}
			}
			
			

		}
		System.out.println(flag);

	}

}
