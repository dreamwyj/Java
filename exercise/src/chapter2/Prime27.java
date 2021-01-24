package chapter2;


public class Prime27 {
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i++) {
			boolean isflag = true;
//			if (i == 2) {
//				System.out.println(i);;
//			}
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isflag = false;
				}
			}
			if (isflag) {
				System.out.print(i + " ");
			}
		}
		
	}

}
