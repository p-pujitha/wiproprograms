import java.util.*;
class RandomHelper
{
	
	static int randint(int min, int max)
	{
		Random rand=new Random();
		int random_number=rand.nextInt((max-min)+1)+min;
		return random_number;
	}
	static double randomdouble(int min, int max)
	{
		Random rand=new Random();
		//double random_number=min + (max - min) * rand.nextDouble();
		double random_number = min+ rand.nextDouble()*max;
		return random_number;
	}
}


public class ClassDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomHelper rh= new RandomHelper();
		System.out.println("Random integer between the numbers 1 and 10: " + rh.randint(1, 10));
		System.out.println("Random double :"+ rh.randomdouble(1, 10));
		System.out.println("Random Integer between the given numbers 1 and 10: "+RandomHelper.randint(1, 10));

	}

}
