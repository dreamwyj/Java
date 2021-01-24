package chapter4;

public class FreeFall41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.100m v1 每次下落的里程 v2 每次弹跳的里程
		double v1 = 0,v2 = 0,sum = 0;
		for (int i = 0; i < 10; i++) {
			
			if (i == 0) {
				v1 = 100;	
			}
			else {
				v1 = v2;
			}
			v2 = v1/2;
			sum = sum + v1 + v2;
			System.out.println((i+1) + "次" + v1 +" " + v2);
		}
		System.out.println("第十次落地时经过路程为:" + (sum - v2) + "米");
		System.out.println("第十次反弹:" + v2);

	}
	

}
