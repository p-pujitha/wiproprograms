import java.awt.List;
import java.util.ArrayList;
import java.util.*;

class Multiple
{
	int n1;
	float n2;
	double n3;
	Multiple()
	{
		
	}
	Multiple(int n1, float n2, double n3)
	{
		this.n1= n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	int getInteger(){
		return n1;
		
	}
	float getFloat()
	{
		return n2;
	}
	double getDouble()
	{
		return n3;
	}
}

public class Arraylist4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	ArrayList <Multiple> m = new ArrayList <Multiple>();
	m.add(new Multiple(10,2.3f,10.4));
	for(Multiple i :m)
	{
		System.out.println(i.getInteger());
		System.out.println(i.getFloat());
		System.out.println(i.getDouble());
	}
	
	/*Iterator i = m.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}*/
	
	
}
}
