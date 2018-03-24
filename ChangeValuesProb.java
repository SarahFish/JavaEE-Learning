/**
问题：对两个整数变量的值进行互换
要求：不需要第三方变量
*/
//注：一般开发都使用中间变量的方法

/*思路1
11 = 3 + 8
8 = 11 - 3
3 = 11 - 8
*/
class ChangeValuesProb1
{
	public static void main(String[] args)
	{
		int m = 1;
		int n = 2;
		
		n = n + m ;//如果n和m的值非常大，容易超出int范围
		m = n - m ;
		n = n - m ;
		
		System.out.println("m="+m+",n="+n);
	}
}

/*思路2:技巧性方式（实际开发不推荐）
用异或的性质：一个数异或同一个数两次，结果还是那个数。
*/
class ChangeValuesProb2
{
	public static void main(String[] args)
	{
		int m = 1;
		int n = 2;
		
		n = n ^ m ;
		m = n ^ m ;//加上上一步相当于(n^m)^m 
		n = n ^ m ;//加上上两步相当于(n^m)^(n^m)^m
		
		System.out.println("m="+m+",n="+n);
	}
}