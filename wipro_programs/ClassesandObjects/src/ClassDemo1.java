class Box
{
	private double width;
	private double height;
	private double depth;
	public void setdetails(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
		
	}
	public double volume(){
		return width*height*depth;
	}
}


public class ClassDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b= new Box();
		b.setdetails(10.25,10,92.3);
		System.out.println("Volume is" + b.volume());

	}

}
