package polymorphism;

public class MethodOverLoading 
{

	public void addition(int a,int b,int c) 
	{
		
		
		// TODO Auto-generated method stub
		int sum=a+b+c;
		System.out.println("sum:"+sum);

	}
	public void addition(int a,int b)
	
	{
		int sum=a+b;
		System.out.println("sum:"+sum);
	}
public void addition(int a)
{
	System.out.println("sum:"+a);
}
public static void main(String args[])

{
	MethodOverLoading m=new MethodOverLoading ();
	m.addition(1,2,3);
	m.addition(1,2);
	m.addition(2);
	
	
	
}
}



