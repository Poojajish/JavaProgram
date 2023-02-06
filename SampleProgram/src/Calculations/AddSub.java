package Calculations;
import java.util.Scanner;

public class AddSub {
	public static void main(String args[])
	{
		int a,b,sum,dif;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		sum=a+b;
		
		dif=a-b;
		
		System.out.println("first number is:"+a);
		System.out.println("second number is:"+b);
		System.out.println("sum is:"+sum);
		System.out.println("difference is:"+dif);
	}
}


