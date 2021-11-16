
import java.util.*;
class User
{
	public static int output1;
	public static void sum(int input1)
	{
		int a[] = new int[40];
		int final_array[] = new int[40];
		int i=0;
		while(input1!=0)
		{
			a[i]=input1%10;
			i++;
			input1=input1/10;
		}
		int k=0;
		for(int j=i-1;j>=0;j--)
		{
			final_array[k]=a[j];
			k++;
			//System.out.println(final_array[j]);
		}
		
		int  final_sum=0;
		for(int j=0; j<i;j++)
		{
			final_sum+=Math.pow(final_array[j],j+1);
			//System.out.println(final_array[j]);
		}
		output1=final_sum;
		System.out.println(output1);
	}
}

public class UserMainCode {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u =new User();
		u.sum(12345);
	}

}
