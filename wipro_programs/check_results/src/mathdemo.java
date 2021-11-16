
public class mathdemo {

	/**
	 * @param args when to use BufferReader and Input Stream Reader 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n1= Integer.parseInt(args[0]);
		String s = new String(args[0]);
		int length = args[0].length();
		//System.out.println(length);
		int a[] = new int[10],i;
		for( i=0;i<length;i++)
		{
			String s1 = s.valueOf((s.charAt(i)));
			a[i]=Integer.parseInt(s1);	
			//System.out.println(a[i]);
		}
		for(int j=0;j<i;j++)
			System.out.println(a[j]);
		double sum=0;
		for(int j=0;j<i;j++)
		{
			double power;
			if(j==i-1)
				power = Math.pow(a[j], 0);
			else
				power = Math.pow(a[j], a[j+1]);
			sum+=power;
		}
		System.out.println(sum);
		
		
	}

}
