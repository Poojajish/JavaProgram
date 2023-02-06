package Calculations;

public class AddSubtraction {
	public static void addition()
	{
	int a=10;
	int b=10;
	int c=a+b;
	System.out.println(" a=10");
	System.out.println(" b=10");
	System.out.println("Sum:"+c);
	}
	public void subtraction()
	{
	int a=10;
	int b=10;
	int c =a-b;
	System.out.println(" a=10");
	System.out.println(" b=10");
	System.out.println("Difference:="+c);
	}
	public static void main(String args[])
	{
	addition();
	AddSubtraction J=new AddSubtraction();
	J.subtraction();

}
}
