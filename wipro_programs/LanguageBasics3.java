class LanguageBasics3
{
	public static void main(String args[])
	{
		
		if(args.length == 2 )
		{
			int s1= Integer.parseInt(args[0]);
			int s2= Integer.parseInt(args[1]);
			System.out.println("Sum of the two number is :" + (s1+s2));
		}
		else
			System.out.println("give 2 integers to add ");

	}
}