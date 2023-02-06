package Calculations;


	import java.util.Scanner;
	public class AreaTry

	{

	public static void main(String args[])

	{

	int b,h,area;

	Scanner sc =new Scanner(System.in);

	System.out.println("enter breadth");

	b=sc.nextInt();
	System.out.println("enter height");

	h=sc.nextInt();
	area=(b*h)/2;

	System.out.println("breadth"+b);
	System.out.println("height"+h);
	System.out.println("area"+area);

	}
	}


