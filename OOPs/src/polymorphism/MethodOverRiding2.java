


package polymorphism;

public class MethodOverRiding2 extends MethodOverRiding

{

public void methodOne(int a, int b) // super keyword cannot be used in static context

{

//super.methodOne(40,60); parent is invoked first

int sub= a-b;

System.out.println("DIFFERENCE:"+sub);

super.methodOne(40,60); // parent is invoked second

}

public static void main(String args[])

{

MethodOverRiding2 mc=new MethodOverRiding2();

mc.methodOne(20,10); // super keyword : used to access parent class method, used inside the child class method body

// immediate parent class constructor, method, variable

}

}

