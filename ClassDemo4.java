class Fan
{
	public static int SLOW;
	public static int MEDIUM;
	public static int FAST;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	static  void defaults_static_set()
	{
		SLOW=1;
		MEDIUM=2;
		FAST=3;
		
	}
	void defaults_set()
	{
		speed=SLOW;
		on=false;
		radius=5;
		color="red";
	}
	Fan()
	{
		defaults_static_set();
		defaults_set();
	}
	void set_speed(int speed)
	{
		this.speed=speed;
	}
	int get_speed()
	{
	return speed;
	}
	void set_on(boolean bo)
	{
		on=bo;
	}
	boolean get_on()
	{
		return on;
	}
	void set_radius(double radius)
	{
		this.radius=radius;
	}
	double get_radius()
	{
		return radius;
	}
	void set_color(String color)
	{
		this.color=color;
	}
	String get_color()
	{
		return color;
	}
	
}



public class ClassDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f= new Fan();
		System.out.println("Defaults are :");
		System.out.println("On: "+ f.get_on()+" speed: "+ f.get_speed()+" color: "+f.get_color()+" Radius: "+f.get_radius());
		f.set_color("green");
		f.set_on(true);
		f.set_radius(5.14);
		f.set_speed(Fan.MEDIUM);
		System.out.println("On: "+ f.get_on()+" speed: "+ f.get_speed()+" color: "+f.get_color()+" Radius: "+f.get_radius());
		
		
	}

}
