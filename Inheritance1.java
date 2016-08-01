
class A
{
	int a;
}
class B extends A
{
	int a;
	B(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("a=" + a);
	}
	
}



public class Inheritance1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(100);
		b.display();
		

	}

}
