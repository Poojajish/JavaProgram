package Calculations;

public class AddNum {
	int a;
	static int b;
	public void newmeth(int num1,int num2)
	{
		a=num1;
		b=num2;
		int sum=a+b;
		System.out.println("sum:"+sum);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNum a=new AddNum();
		a.newmeth(1,2);
		}

}
