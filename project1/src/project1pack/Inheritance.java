package project1pack;
class A{
	A()
	{
	System.out.println("default constructor of Class A");
	}
	A(String s){
		System.out.println("parameterised constructor of Class A");
	}
	public void display()
	{
		System.out.println("this is class A");
		
	}
}

class B extends A {
	B()
	{
		System.out.println("default constructor of Class B");
	}
	B(String s){System.out.println(s);}
	public void display()
	{
		super.display();
	System.out.println("this is class B");
	
	}}
 public class Inheritance
 {
	public static void main(String[] args) {
		

B a1= new B("welcome");
A b1= new A("super");
System.out.println(a1);
a1.display();
		// TODO Auto-generated method stub

	}

}
