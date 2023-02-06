package Inheritance;

public class HierarchThird extends HierarchInher{
	public void second()
	{
System.out.println("all");
}
public static void main(String args[]) {
	 HierarchThird h=new  HierarchThird();
	 HierArchSecond hs=new HierArchSecond();
	 h.methodA();
	 hs.first();
	 h.second();
	 
	 }
}