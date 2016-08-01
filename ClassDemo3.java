import java.util.*;
class RandomHelper
{
	
	static int randint(int min, int max)
	{
		Random rand=new Random();
		int random_number=rand.nextInt((max-min)+1)+min;
		return random_number;
	}
	static int randomdouble(int min, int max)
	{
		Random rand=new Random();
		int random_number=rand.nextInt(((max/2)-min)+1)+min;
		return 2*random_number;
	}
}


public class ClassDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomHelper rh= new RandomHelper();
		System.out.println("Random integer between 0 to 10: " + rh.randint(0, 10));
		System.out.println("Random double :"+ rh.randomdouble(0, 10));
		System.out.println("Random Integer between 0 to 10: "+RandomHelper.randint(0, 10));

	}

}
