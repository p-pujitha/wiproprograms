class AboutDifferentArray
{
	String a[]= new String[5];
	AboutDifferentArray(){}
	AboutDifferentArray(String a1, String b, String c, String d, String e)
	{
		a[0]=a1;
		a[1]=b;
		a[2]=c;
		a[3]=d;
		a[4]=e;
		
	}
	void display(){};
	 
}
class Intarray extends AboutDifferentArray
{
	Intarray(String a1, String b, String c, String d, String e)
	{
		a[0]=a1;
		a[1]=b;
		a[2]=c;
		a[3]=d;
		a[4]=e;
		
	}
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Integer.parseInt(a[i]));
		}
	}
}

class DoubleArray extends AboutDifferentArray
{
	DoubleArray(String a1, String b, String c, String d, String e)
	{
		super(a1,b,c,d,e);
		
	}
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Double.parseDouble(a[i]));
		}
	}
}

class CharacterArray extends AboutDifferentArray
{
	CharacterArray(String a1, String b, String c, String d, String e)
	{
		super(a1,b,c,d,e);
		
	}
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("character by character of "+a[i]);
			for(int j=0;j<a[i].length();j++)
				System.out.print(a[i].charAt(j)+" ");
		}
	}
}




public class Overriding1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intarray a= new Intarray("10","25","87","58","52");
		a.display();
		DoubleArray d =new DoubleArray("10.25","85.25","74.51","95.41","74.69");
		d.display();
		CharacterArray c= new CharacterArray("pujitha","mounica","chikki","thaha","pravallika");
		c.display();
		
	

	}

}
