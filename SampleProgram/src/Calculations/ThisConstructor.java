package Calculations;

public class ThisConstructor {

	public ThisConstructor()

	{
	this(3);
	System.out.println("hello");
	}


	public ThisConstructor(int a)

	{

	System.out.println(a);
	}

	public static void main(String args[])

	{

	ThisConstructor p=new ThisConstructor();

	}

	}



