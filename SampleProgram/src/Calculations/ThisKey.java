package Calculations;

public class ThisKey {
	int age;

	public void meth(int age)

	{

	this.age=age;

	}

	public void display()

	{

	System.out.println(age);

	}


	public static void main(String args[])

	{

	ThisKey k=new ThisKey();
	k.meth(2);

	k.display();


	}
	}


