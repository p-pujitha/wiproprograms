import java.util.*;
public class Activity5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			sum+=a[i];
			
		}
		System.out.println("Average is "+(sum/10));

	}

}
