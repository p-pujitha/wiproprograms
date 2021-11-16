class xyz implements Cloneable
{
	int a;
	double b;
	xyz cloneTest()
	{
		try{
			return (xyz)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("cloning not allowed");
			return this;
		}
	}
}


public class clonableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz obj = new xyz();
		xyz obj2;
		obj.a=10;
		obj.b=20;
		obj2 = obj.cloneTest();
		System.out.println("obj1 " + obj.a + obj.b);
		System.out.println("obj2 " +obj2.a + obj2.b);
		obj2.a=100;
		obj2.b=100;
		System.out.println("obj1 " + obj.a + obj.b);
		System.out.println("obj2 " +obj2.a + obj2.b);

	}

}
