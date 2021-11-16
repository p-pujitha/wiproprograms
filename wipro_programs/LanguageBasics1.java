class LanguageBasics1
{

	public static void main(String args[])
	
	{
		if(args.length>2)
		 System.out.println("You have to enter only 2 arguments... Its mandatory");
		else if( args.length < 2)
			System.out.println("Give 2 arguments");
		     else
			System.out.println(args[0]+" " +"Technologies"+" "+args[1]);
	}
}
