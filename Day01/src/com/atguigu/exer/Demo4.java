package com.atguigu.exer;
/*使用简单数组 (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
他们是int[]类型的数组。
(2)使用大括号{}，把array1初始化为8个素数:2,3,5,7,11,13,17,19。
(3)显示array1的内容。
(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值 (如array[0]=0,array[2]=2)。打印出array1。
 * arr1 = arr2; 地址值相同，指向同一个地址空间
 */
class ArryTest{
	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = new int[] {2,3,5,7,11,13,17,19};
		int[] arry2 = new int[8];
		for(int i = 0;i<arry1.length;i++) {
			System.out.print(arry1[i]+" ");
			if(i%2==0)
				arry2[i] = i;
			else
				arry2[i] = arry1[i];
			//System.out.print("\n");
			//System.out.print(arry2[i]+" ");
		}
		System.out.println("\narr2数组：");
		for(int j = 0;j<arry2.length;j++) {
			System.out.print(arry2[j]+" ");
		}
		

	}

}
