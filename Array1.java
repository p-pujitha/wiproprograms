
public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length <9)
			System.out.println("please enter 9 numbers");
		else
		{
			int arr[][]=new int[3][3];
			int count=0,i,j;
			System.out.println("The given array is:");
			for( i=0;i<3;i++)
			{
				for( j=0; j<3;j++)
				{
					arr[i][j]=Integer.parseInt(args[count]);
					System.out.print(arr[i][j]+" ");
					count++;
				}
				System.out.println();
			}
			int great=arr[0][0];
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(arr[i][j]>=great)
						great=arr[i][j];
				}
			}
			System.out.println("The biggest number in the given array is :" + great);
		}

	}

}
