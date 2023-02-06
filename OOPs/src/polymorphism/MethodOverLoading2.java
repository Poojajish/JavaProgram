package polymorphism;

public class MethodOverLoading2 
{
	public static void addition(int a, int b,int c )
	{
		int sum=a+b+c;
		System.out.println("sum:"+sum);
		
	}
public static void addition(float a,float b,float c)
{
	float sum=a+b+c;
	System.out.println("sum:"+sum);
	
}
public static void addition(double a)
{
	System.out.println("sum:"+a);
}
public static void main(String args[])
{
	
	addition(1,2,3);
	addition(1f,2f,3f);
	addition(1);
	
}
}
