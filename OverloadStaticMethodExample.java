
public class OverloadStaticMethodExample {
	public static void Sum(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum of:-"+c);
	}
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum of:-"+c);
	}
		
	public static void main(String[] args) {
	
	OverloadStaticMethodExample.Sum(45,85);
	}
}
