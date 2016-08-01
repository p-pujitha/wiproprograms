class FlowControlStatements3
{
	public static void main(String args[])
	{
		 if(args.length < 1)
		 	System.out.println("Enter a number to check whether it is palindrome or not");
		 else
		 {
		 	int num=Integer.parseInt(args[0]);
		 	int value=num;
		 	int sum=0;
		 	while(num!=0)
		 	{
		 		int rem= num%10;
		 		sum=(sum*10)+rem;
		 		//System.out.println(sum);
		 		num=num/10;
		 	}
		 	if(value==sum)
		 		System.out.println("Give number is a palindrome");
		 	else
		 		System.out.println("Given number is not a palindrome");
		 }

	}
}