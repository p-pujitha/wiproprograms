
import java.util.*;
public class Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[26];
		int large=0;
		for(int i=0;i<25;i++)
		{
			a[i]=s.nextInt();
			if(a[i]>large)
				large=a[i];
		}
		
		System.out.println("Largest number is: "+large);
	}

}
