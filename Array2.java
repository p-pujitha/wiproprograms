
public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<4)
			System.out.println("please enter 4 numbers");
		else
		{
			int arr[][]=new int[2][2];
			int count=0;
			System.out.println("The given array is:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					arr[i][j]=Integer.parseInt(args[count]);
					System.out.print(arr[i][j]+ " ");
					count++;
				}
				System.out.println();
			}
			System.out.println("The reverse of the array is:");
			for(int i=1;i>=0;i--)
			{
				for(int j=1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
