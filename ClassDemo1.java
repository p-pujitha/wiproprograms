class Box
{
	private int width;
	private int height;
	private double depth;
	public void setdetails(int w, int h, double d)
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
		b.setdetails(10,10,92.3);
		System.out.println("Volume is" + b.volume());

	}

}
