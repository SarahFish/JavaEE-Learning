/*
һά����Ͷ�ά����Ķ��巽���ܽᡣ
*/

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] temp_a = {1,2};
		int[][] temp_b = {{1,2},{4,5}};
		
		//һά�����4�ֳ�ʼ������
		int[] a1 = new int[2];
		int[] a2 = new int[]{1,2};
		int[] a3 = {1,2};
		int[] a4 = temp_a;
		
		//��ά�����5�ֳ�ʼ������
		int[][] b0 = new int[2][];//���Բ�ָ���ڶ�ά�ȣ���ʱĬ��b0[0]��b0[1]Ϊnull��
		int[][] b1 = new int[2][3];//b[0]��b[1]�ĳ��ȿ��Բ�һ����
		int[][] b2 = new int[][]{{1,2},{4,5}};
		int[][] b3 = {{1,2},{4,5}};
		int[][] b4 = temp_b;
		
		//��������ľ�Ϊ����Ĵ�ŵ�ַ���ǹ�ϣֵ
		System.out.println("һά�����ַ��" + a1 + ", " + a2 + ", " + a3 + ", " + a4);//һά���飺������Ϊ��ַ
		
		System.out.println("��ά�����ַ��" + b0 + ", " + b1 + ", " + b2 + ", " + b3 + ", " + b4);//��ά���飺������Ϊ��ַ
		System.out.println(b0[0] + ", " + b1[0] + ", " + b2[0] + ", " + b3[0] + ", " + b4[0]);//��ά���飺һάԪ����Ϊ��ַ���洢��b�С�

		b0[0] = new int[2];
		b0[1] = new int[3];
		System.out.println(b0[0]);//�����仯��null����>��ϣ��ַ

	}
}