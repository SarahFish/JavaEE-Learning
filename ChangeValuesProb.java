/**
���⣺����������������ֵ���л���
Ҫ�󣺲���Ҫ����������
*/
//ע��һ�㿪����ʹ���м�����ķ���

/*˼·1
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
		
		n = n + m ;//���n��m��ֵ�ǳ������׳���int��Χ
		m = n - m ;
		n = n - m ;
		
		System.out.println("m="+m+",n="+n);
	}
}

/*˼·2:�����Է�ʽ��ʵ�ʿ������Ƽ���
���������ʣ�һ�������ͬһ�������Σ���������Ǹ�����
*/
class ChangeValuesProb2
{
	public static void main(String[] args)
	{
		int m = 1;
		int n = 2;
		
		n = n ^ m ;
		m = n ^ m ;//������һ���൱��(n^m)^m 
		n = n ^ m ;//�����������൱��(n^m)^(n^m)^m
		
		System.out.println("m="+m+",n="+n);
	}
}