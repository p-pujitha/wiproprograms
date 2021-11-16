import java.util.*;
public class Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a[]=new int[10];
		int max=0;
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			if(a[i]>max)
				max=a[i];
			
			
		}
		int count=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]==max)
				count++;
		}
		System.out.println("The number with highest value is "+max+" occurs "+count+" times");
			
		

	}

}
