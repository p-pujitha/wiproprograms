class FlowControlStatements1
{
	public static void main(String args[])
	{
		if(args.length < 1 )
		  System.out.println("An integer number as argument is expected");
		else
		{
		    int num= Integer.parseInt(args[0]);
		    if(num < 0)
		       System.out.println(num + " is a negative number");
		    else if(num > 0)
		           System.out.println( num + " is a postive number");
		          else
		            System.out.println(" 0 is either positive or negative");
		}
	}
}