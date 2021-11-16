
public class StringBuffer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		String s="madam";
		sb.append(s);
		System.out.println(sb);
		StringBuffer sb2= new StringBuffer(sb.reverse());
		System.out.println(sb2);
		String s2=sb2.toString();
		if(s.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
