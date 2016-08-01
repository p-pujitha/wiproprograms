import java.util.Random;
import java.util.*;

class Patient
{
	String name;
	public double weight; // weight in pounds;
	public double height; //height in inches
	
	double BMI()
	{
		return (weight/(height*height)*3)*703;
	}
	double randomdouble(double min, double max)
	{
		Random rand=new Random();
		double range = max - min;
		  double scaled = rand.nextDouble() * range;
		  double shifted = scaled + min;
		  return shifted;
	}
}


public class classDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Patient p= new Patient();
		double height_arr[]=new double[10];
		double weight_arr[]=new double[10];
		String name[]=new String[10];
		double bmi_arr[]=new double[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the name");
			name[i]=s.next();
			height_arr[i]=p.randomdouble(2,7);
			p.height=height_arr[i];
			weight_arr[i]=p.randomdouble(20, 100);
			p.weight=weight_arr[i];
			bmi_arr[i]=p.BMI();		
		}
		for(int i=0;i<10;i++)
		{
			if(bmi_arr[i]>25.0)
			{
				System.out.println("Name: "+name[i]+ " bmi: "+bmi_arr[i] );
			}
		}

	}

}
