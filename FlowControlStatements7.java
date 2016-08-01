class FlowControlStatements7
{
	public static void main(String args[])
	{
		if(args.length<1)
		  System.out.println("Please enter an integer number");
		else
		{
			int num= Integer.parseInt(args[0]);
			int i=1;
			while(i<=num)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				System.out.println();
				i++;
			}
		}

	}
}