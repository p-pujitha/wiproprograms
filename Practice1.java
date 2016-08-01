
public class Practice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		String surname="Pabbaraju";
		String name="pujitha";
		sb.append(surname);
		System.out.println(sb);
		System.out.println(surname.length());
		int n= surname.length();
		sb.insert(n,name);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());

	}

}
