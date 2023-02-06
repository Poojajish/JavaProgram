package Inheritance;

public class SingleInheritanceChild extends SingleInheritance
{
	public void childDisplay()
	
	{
		System.out.println("java");
		
	}
public static void main(String args[])

{

	SingleInheritanceChild si= new SingleInheritanceChild();
	si.single();
	si.childDisplay();
	
	
}

}

