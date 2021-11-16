class FlowControlStatements8
{
	 
	/* If we declare main in this way it can compile but in run time you get an error that is  

	Error: Main method not found in class FlowControlStatements8, please define the main method as:
   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application

	 static void main(String args[])
	{
		System.out.println("hai");
	}*/

	/* If we declare without static it compiles successfully but in run time it get error like

	Error: Main method is not static in class FlowControlStatements8, please define the main method as:
   	public static void main(String[] args)

	public void main(String args[])
	
	{
		System.out.println("hai");
	}*/

	/* If we declare without args .. It does not even compile also It get error like

	Error: Main method not found in class FlowControlStatements8, please define the main method as:
   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application

	public static void main()
	{
		System.out.println("hai");
	}*/


	/* If we declare with arguments as Integer it compiles but in run time it will get error like
		
		Error: Main method not found in class FlowControlStatements8, please define the main method as:
   		public static void main(String[] args)
		or a JavaFX application class must extend javafx.application.Application

	public static void main (Integer a[])
	{
		System.out.println("hai");
	}
	*/


	/* It prints output successfully :) */
	static public void  main(String args[])
	{
		System.out.println("hai");
	}

}