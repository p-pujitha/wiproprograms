class Frequent
{
	public static int output1;
	public static void MostFrequentDigit(int input1, int input2, int input3, int input4)
	{
		int distinctarr[]= new int[50],i=0;
		int countarr[]= new int[50],j=0;
		int number=1;
		while(number<5)
		{
			if(number == 2)
				input1 = input2;
			else if (number ==3 )
				   input1 = input3;
			else if(number == 4)
				   input1 = input4;
		while(input1!=0)
		{
			int rem = input1%10;
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
				
			
			input1=input1/10;
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
		int large = countarr[0];
		int largeindex = 0;
		int finalanswer ;
		for(int k=1;k<i;k++)
		{
			if(large == countarr[k])
			{
				if(distinctarr[largeindex] < distinctarr[k])
				{
					large = countarr[k];
					largeindex = k;
				}
					
			}
			if(countarr[k] > large)
			{
				large = countarr[k];
				largeindex = k;
			}
				
		}
		finalanswer = distinctarr[largeindex];
		System.out.println("Largest Element " +large);
		System.out.println("Digit = "+ finalanswer);
	}
	
}


public class MostFrequentNumber {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequent.MostFrequentDigit(123, 234, 345, 673);
		Frequent.MostFrequentDigit(123, 456, 345, 5043);
		Frequent.MostFrequentDigit(1203, 7624, 2046, 1052);
		Frequent.MostFrequentDigit(1203, 7624, 2046, 1002);
	}

}
