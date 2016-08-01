class FlowControlStatements2
{
	public static void main(String args[])
	{
		if(args.length < 1)
		  System.out.println("please enter an integer number");
		else if(args.length == 1)
				{

					
					int num= Integer.parseInt(args[0]);
					if(num==0 || num==1)
					  System.out.println(num+" is neither prime nor composite");
					else
					{
						
						
						int i=2;
						while(i<num)
						{
							if(num%i == 0)
							{
								
								break;
							}
							i++;
						}
						if(i==num)
							System.out.println(num+ " is a prime number");
						else
							System.out.println(num+ " is a composite number");

					}

				}
	}
}