
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int i=0;
		for(int j=0;j<args.length;j++)
		{
			a[i]=Integer.parseInt(args[j]);
			i++;
		}
		for(int k=0;k<4;k++)
		{
			for(int j=0;j<4-k;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted elements are:");
		for(int k=0;k<i;k++)
			System.out.print(a[k]+" ");

	}

}
