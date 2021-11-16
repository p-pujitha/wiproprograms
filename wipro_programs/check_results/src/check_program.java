import java.util.*;
import java.math.*;
class RandomHelper
{
	static int randInt(int x, int y)
	{
		int randomnumber= (int)Math.random();
		System.out.println(randomnumber);
		return randomnumber;
	
	}
}

public class check_program {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		RandomHelper.randInt(1, 10);
		
	}
	
	
	
}
