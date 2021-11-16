import java.util.*;
class Stringoperations
{
	void stringfunctions()
	{
		System.out.println("January".startsWith("Jan"));
		System.out.println("January".endsWith("ry"));
		System.out.println("January".charAt(1));
		System.out.println("January".indexOf('J'));
		System.out.println("January".substring(1));
		System.out.println("January".toUpperCase());
		System.out.println("January".toLowerCase());
		
		
	}
	void stringbufferfunctions()
	{
		
		StringBuffer sb=new StringBuffer("Pujitha");
		System.out.println(sb.append("Pabbaraju"));
		System.out.println(sb.insert(0, "Pabbaraju"));
		System.out.println(sb.delete(0,2));
		System.out.println(sb.replace(0,2,"Pab"));
		System.out.println(sb.reverse());
		
		
		
	}
}
public class StringBuffer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int choice;
		System.out.println("Enter the choice");
		choice=s.nextInt();
		Stringoperations so =new Stringoperations();
		switch(choice)
		{
		case 1:so.stringfunctions();
			   break;
		case 2:so.stringbufferfunctions();
				break;
		}
		

	}

}
