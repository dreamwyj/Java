package com.atguigu.exer;
/*
 * 算法的考察：数组的复制，反转，查找，（线性查找，二分法查找）
 */
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"JJ","DD","MM","BB","GG","AA"};
		//数组的复制(区别于数组变量的赋值：arr1 = arr)
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
		//数组的反转
		System.out.println("arr反转前：");
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]+" ");
		//方法一
//		for(int i = 0;i < arr.length/2;i++ ) {
//			String temp = arr[i];
//			arr[i] = arr[arr.length-i-1] ;
//			arr[arr.length-i-1] = temp;
//		}
		//方法二
		for(int i = 0,j = arr.length-1;i<j;i++,j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println("\narr反转后：");
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]+" ");
		//查找
		// 线性查找：
		String desc = "BB";
		int target=-1,i;
		for( i = 0;i< arr.length;i++) {
			if(arr[i].equals(desc)) {
				target = i;
				break;
			}
				
		}
		if(target>0)
			System.out.println("\n这个字符串在第"+(target+1)+"个");
		else
			System.out.println("\n不存在这个字符串");
		// 二分法查找
		int[] arr2 = new int[] {-98,-34,-22,2,34,79,105,210,333};
		int derst = 210;
		boolean flag = false;
		int head = 0,end = arr2.length - 1,mild;
		do {
			mild = (head + end)/2;
			if(derst > arr2[mild])
			{
				head = mild + 1;	
			}
			else if(derst < arr2[mild]) {
				end = mild - 1;
			}
			else {
				flag = true;
				end = head = mild;
				break;
			}
		}while(head < end);
		if(flag)
			System.out.println(derst + "在" + (mild+1) + "个");
		else
			System.out.println("没有这个");
			
		

	}

}
