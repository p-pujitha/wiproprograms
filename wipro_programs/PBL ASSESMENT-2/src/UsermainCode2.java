
class NameJumble
{
	public static String output1;
	public static void userIdGeneration(String input1, String input2, int input3, int input4)
	{
		String output;
		String smallername;
		String longername;
		if(input1.length()==input2.length())
		{
			int num1=input1.charAt(0);
			int num2=input2.charAt(0);
			if(num1 < num2)
			{
				smallername=input1;
				longername=input2;
			}
			else
			{
				smallername=input2;
				longername=input1;
			}
		}
		else
		{
			if(input1.length()<input2.length())
			{
				smallername=input1;
				longername=input2;
			}
			
		}
		//System.out.println("Smaller"+smallername);
		System.out.println("Longername"+longername);
		output = smallername.substring(0, 1);
		//System.out.println(output);
		output = output +longername;
		//System.out.println(output);
		Integer input33 = new Integer(input3);
		String input333= input33.toString();
		//char inp3 = input333.charAt(input4);
		if(input333.length()==input4)
		{
			String inp3 = input333.substring(input4-1);
			
			output = output +inp3;
			//System.out.println(output+ "yeah ");
		}
		else
		{
		output =output+ input333.substring(input4-1, input4);
		
		output = output + inp333;
		}
	
		//System.out.println(output);
		char chars[]= output.toCharArray();
		for(int j=0;j<chars.length;j++)
		{
			char c = output.charAt(j);
			if(Character.isLowerCase(c))
			{
				chars[j]=Character.toUpperCase(c);
			}
			else if(Character.isUpperCase(c))
			{
				chars[j]=Character.toLowerCase(c);
			}
		}
		output= new String(chars);
		output1 = output;
		System.out.println(output1);
		
	}
}
public class UsermainCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameJumble.userIdGeneration("Rajiv", "Roy", 560037, 6);
		NameJumble.userIdGeneration("Manoj", "Kumar",561327, 2);
		NameJumble.userIdGeneration("Kumud", "Kumar", 561327, 2);

	}

}
