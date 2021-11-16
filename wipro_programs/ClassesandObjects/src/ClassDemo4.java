class Fan
{
	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="red";
	
	Fan()
	{
		System.out.println("No argument constructor");
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

	public String toString() {
		return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius
				+ ", color=" + color + "]";
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
		//System.out.println("On: "+ f.get_on()+" speed: "+ f.get_speed()+" color: "+f.get_color()+" Radius: "+f.get_radius());
		System.out.println(f.toString());
		f.set_color("green");
		f.set_on(true);
		f.set_radius(5.14);
		f.set_speed(Fan.MEDIUM);
		System.out.println(f.toString());
		
		
		
	}

}
