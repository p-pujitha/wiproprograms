class Shape
{
	
	void draw()
	{
		System.out.println("Not defined");
	}
	void erase()
	{
		System.out.println("Not defined");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw circle");
	}
	void erase()
	{
		System.out.println("Erase circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Draw Triangle");
	}
	void erase()
	{
		System.out.println("Erase Triangle");
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Draw Square");
	}
	void erase()
	{
		System.out.println("Erase square");
	}
}
public class Overriding3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle();
		c.draw();
		c.erase();
		Square s = new Square();
		s.draw();
		s.erase();
		Triangle t = new Triangle();
		t.draw();
		t.erase();

	}

}
