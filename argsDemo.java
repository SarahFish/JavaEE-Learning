/**
使用cmd运行时，直接在文件名后面加参数 那些参数就会传到args数组里。（空格隔开）
*/
class argsDemo{
	public static void main(String[] args)
	{
		String a=args[0];
		String b=args[1];
		String c=args[2];
		String d=args[3];
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}