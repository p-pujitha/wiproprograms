class Fruit
{
	String name;
	String taste;
	int size;
	
	Fruit(){}
	Fruit(String name, String taste, int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name="+name+" Taste="+taste);
	}
	
}

class Apple extends Fruit
{
	Apple(String name, String taste, int size)
	{
		super(name,taste,size);
	}
	void eat()
	{
		System.out.println("Taste of apple is "+taste);
	}
}

class Orange extends Fruit
{
	Orange(String name, String taste, int size)
	{
		super(name,taste,size);
	}
	void eat()
	{
		super.eat();
		System.out.println("Taste of orange is "+taste);
	}
}

public class Overriding2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a= new Apple("Apple","sweet",2);
		a.eat();
		Orange o= new Orange("Orange","sweet",3);
		o.eat();

	}

}
