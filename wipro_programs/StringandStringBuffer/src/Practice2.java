
public class Practice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Hello";
		try
		{
			str1+="this program is example of StringBuffer class and its functions";
			StringBuffer sb = new StringBuffer();
			System.out.println(sb.length());
			sb.append(str1);
			System.out.println(sb);
			sb.delete(0,str1.length());
			sb.append("hello");
			sb.append("world");
			System.out.println(sb);
			sb.insert(5,"_JAVA");
			System.out.println(sb);
			sb.reverse();
			System.out.println("reverse:"+sb);
			sb.reverse();
			System.out.println(sb);
			sb.setCharAt(5,' ');
			System.out.println(sb);
			System.out.println(sb.charAt(1));
			System.out.println(sb.substring(3,7));
			sb.deleteCharAt(3);
			System.out.println(sb);
			System.out.println("Capacity:"+sb.capacity());
			sb.delete(6,sb.length());
			System.out.println(sb);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
