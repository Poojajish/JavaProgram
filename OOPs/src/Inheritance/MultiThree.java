package Inheritance;

public class MultiThree extends MultiTwo{

	public void three() {
		// TODO Auto-generated method stub
System.out.println("new");
	}
public static void main(String args[])
{
	MultiThree m=new MultiThree ();
	m.first();
	m.second();
	m.three();
}
}
