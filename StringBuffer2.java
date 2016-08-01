
public class StringBuffer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("hai");
		String s2 = new String("hai");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3 = s2;
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));

	}

}
