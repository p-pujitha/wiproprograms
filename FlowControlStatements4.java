class FlowControlStatements4
{
	public static void main(String args[])
	{
		if(args.length<1)
			System.out.println("Enter the number to find the sum of its digits");
		else
		{
			int num=Integer.parseInt(args[0]);
			int value=num;
			int sum=0;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+rem;
				num=num/10;

			}
			System.out.println("Sum of the digits of "+value + " is :"+sum);

		}
	}
}