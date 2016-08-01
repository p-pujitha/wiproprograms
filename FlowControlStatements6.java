class FlowControlStatements6
{
	public static void main(String args[])
	{
		if(args.length < 1)
			System.out.println("Please enter an integer number");
		else 
		{
				int num= Integer.parseInt(args[0]);
				if (num == 0)
					System.out.println("The factorial of 0 is 1");
				else
				{
					int i=1;
					int fact=1;
					do
					{
						fact=fact*i;
						i++;

					}while(i<=num);
					System.out.println("The factorial of " + num +" is "+fact);

				}

		}

	}

}