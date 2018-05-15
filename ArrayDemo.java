/*
一维数组和二维数组的定义方法总结。
*/

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] temp_a = {1,2};
		int[][] temp_b = {{1,2},{4,5}};
		
		//一维数组的4种初始化方法
		int[] a1 = new int[2];
		int[] a2 = new int[]{1,2};
		int[] a3 = {1,2};
		int[] a4 = temp_a;
		
		//二维数组的5种初始化方法
		int[][] b0 = new int[2][];//可以不指定第二维度，此时默认b0[0]和b0[1]为null。
		int[][] b1 = new int[2][3];//b[0]和b[1]的长度可以不一样。
		int[][] b2 = new int[][]{{1,2},{4,5}};
		int[][] b3 = {{1,2},{4,5}};
		int[][] b4 = temp_b;
		
		//以下输出的均为数组的存放地址，是哈希值
		System.out.println("一维数组地址：" + a1 + ", " + a2 + ", " + a3 + ", " + a4);//一维数组：数组名为地址
		
		System.out.println("二维数组地址：" + b0 + ", " + b1 + ", " + b2 + ", " + b3 + ", " + b4);//二维数组：数组名为地址
		System.out.println(b0[0] + ", " + b1[0] + ", " + b2[0] + ", " + b3[0] + ", " + b4[0]);//二维数组：一维元素名为地址，存储在b中。

		b0[0] = new int[2];
		b0[1] = new int[3];
		System.out.println(b0[0]);//发生变化：null——>哈希地址

	}
}