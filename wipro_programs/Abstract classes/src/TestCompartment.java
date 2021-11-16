import java.util.Random;

abstract class Compartment
{
	abstract void notice();
}

class FirstClass extends Compartment
{
	void notice()
	{
		System.out.println("This is firstclass");
	}
}
class Ladies extends Compartment
{
	void notice()
	{
		System.out.println("This is ladies compartment");
	}
}

class General extends Compartment
{
	void notice()
	{
		System.out.println("This is general compartment");
	}
}
class Lugguage extends Compartment
{
	void notice()
	{
		System.out.println("This is Lagguage compartment");
	}
}

public class TestCompartment {

	/**
	 * @param args
	 */
	 int randint(int min, int max)
	{
		Random rand=new Random();
		int random_number=rand.nextInt((max-min)+1)+min;
		return random_number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment a[]=new Compartment[10];
		TestCompartment tc= new TestCompartment();
		for(int i=0;i<10;i++)
		{
			int random_number = tc.randint(1,4);
			switch(random_number)
			{
			case 1: FirstClass fc = new FirstClass();
					a[i]=fc;
					a[i].notice();
					
			case 2: Ladies l = new Ladies();
			a[i]=l;
			a[i].notice();
			
			case 3: General g = new General();
			a[i]=g;
			a[i].notice();
			
			case 4: Lugguage lu = new Lugguage();
			a[i]=lu;
			a[i].notice();
				
			}
		}
			

	}

}
