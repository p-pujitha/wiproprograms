import java.util.*;
class Code2
{
	static int answer;
	public  static void leastFrequentlyOccuringDigit(ArrayList<Integer>input1)
	{
		Iterator it = input1.iterator();
		int arr[]= new int[50], index =0;
		while(it.hasNext())
		{
			Integer intobj = new Integer((Integer) it.next());
			arr[index]= intobj.intValue();
			index++;
		}
		for(int j=0; j<index;j++)
			System.out.println(arr[j]);
			

		int distinctarr[]= new int[50],i=0;
		int countarr[]= new int[50],j=0;
		int number=0;
		while(number<index)
		{
			int input11 = arr[number];
		while(input11!=0)
		{
			int rem = input11%10;
			if(i==0)
			{
				distinctarr[i]=rem;
				countarr[i]=1;
				
				i++;
				
			}
			else
			{
				for(j=0;j<=i;j++)
				{
					
					if(rem == distinctarr[j])
					{
						countarr[j]+=1;
						break;
					}
					
					
				}
				
				if(j>i)
				{
					
					distinctarr[i]=rem;
					countarr[i]=1;
					i++;
				}
			}
				
			
			input11=input11/10;
		}
		
		number++;
		
		}
		
		for(int k=0;k<i;k++)
		{
			System.out.print(distinctarr[k]+" ");
		}
		System.out.println();
		for(int k=0;k<i;k++)
		{
			System.out.print(countarr[k]+" ");
		}
		int small = countarr[0];
		int smallindex = 0;
		int finalanswer ;
		for(int k=1;k<i;k++)
		{
			if(small == countarr[k])
			{
				if(distinctarr[smallindex] > distinctarr[k])
				{
					small = countarr[k];
					smallindex = k;
				}
					
			}
			if(countarr[k] < small)
			{
				small = countarr[k];
				smallindex = k;
			}
				
		}
		finalanswer = distinctarr[smallindex];
		System.out.println("Largest Element " +small);
		System.out.println("Digit = "+ finalanswer);
	
		
		
		
	}
}

public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1236);
		ar.add(262);
		ar.add(666);
		ar.add(121);
	Code2.leastFrequentlyOccuringDigit(ar);
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1237);
	a.add(202);
	a.add(666);
	a.add(140);
	Code2.leastFrequentlyOccuringDigit(a);

	}

}
