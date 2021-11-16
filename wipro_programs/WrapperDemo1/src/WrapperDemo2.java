
public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(args[0]);
		System.out.println("Given Number is " + i);
		System.out.println("Binary Equivalent is "+ Integer.toBinaryString(i));
		System.out.println("Octal Equivalent is "+ Integer.toOctalString(i));
		System.out.println("Hex Equivalent is "+Integer.toHexString(i));

	}

}
