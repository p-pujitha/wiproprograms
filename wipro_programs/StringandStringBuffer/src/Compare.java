
public class Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("hello");
		String str = "How was your day today?"; 
		System.out.println(str.indexOf("t")); 
		StringBuffer sb = new StringBuffer("Haiiiiiii");
		sb.replace(1, 4, "hell");
		System.out.println(sb);
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
	}

}
