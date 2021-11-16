import java.util.Random;
import java.util.*;

class Patient
{
	String name;
	public double weight; // weight in pounds;
	public double height; //height in inches
	
	Patient(String n,double w,double h)
	{
		name=n;
		weight=w;
		height=h;
	}
	
	double BMI()
	{
		return (weight/(height*height))*703;
	}
	
}


public class classDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Patient[] p=new Patient[10];
	p[0]=new Patient("chikki",120,413);
	p[1]=new Patient("puji",130,425);
	p[2]=new Patient("pravs",115,400);
	for(int i=0;i<3;i++)
	{
		if(p[i].BMI()>25.0)
			System.out.println("Name"+p[i].name+ "BMI is:"+p[i].BMI());
	}
	}

}
