import java.util.*;

 class Problem
{
	public static int output1;
	public static void get(String input1)
	{
		int length = input1.length();
		//System.out.println(length);
		int arr[] = new int[length], arr_index=0;
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(input1.charAt(i)== ' ')
			{
				//System.out.print(count+" ");
				arr[arr_index] = count;
				arr_index ++;
				count=0;
				
			}
			else
			{
			//	System.out.println(input1.charAt(i));	
				count++;
			}
			
		}
		//System.out.println(count);
		arr[arr_index]= count;
		arr_index++;
		int final_sum=0;
		for(int j=0;j<arr_index;j++)
		{
			final_sum+=arr[j];	
		
		}
		//System.out.println(final_sum);
		Integer sum = new Integer(final_sum);
		String s = sum.toString();
		if(s.length() == 1)
		{
			output1 = final_sum;
			//System.out.println(output1);
		}
		else
		{
			while(s.length()!=1)
			{
			int index =0;
			int i=0;
			int new_length=s.length();
			//System.out.println(new_length);
			int a[]= new int[new_length];
			for(i=0; i<new_length;i++)
			{
				String s1 = s.valueOf((s.charAt(i)));
				a[i]=Integer.parseInt(s1);
				
				//System.out.println(a[i]);
			}
			int sum_of_digits=0;
			for(int j=0;j<i;j++)
			{
				sum_of_digits+=a[j];
			}
			Integer digits = new Integer(sum_of_digits);
			s=digits.toString();
			new_length=s.length();
			}
			output1 = Integer.parseInt(s);
			System.out.println(output1);
		}
	}
}



public class NExtque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem p = new Problem ();
		p.get("Wipro Technologies");
		p.get("The Good the bad and the ugly");
		p.get("Entertaining in complicated Environment");

	}

}
