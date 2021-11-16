class SumFirst
{
	public static int output1;
	public static int outpu2;
	public static void findOriginalFirstandSum(int[] input1)
	{
		int length=input1.length;
		int new_arr[]=new int[50],index=0;
		int firstnum;
		int subnum=input1[length-1];
		int sum=subnum;
		for(int j=length-1;j>0;j--)
		{
			new_arr[index]=input1[j-1]-subnum;
			subnum=new_arr[index];
			index++;
			sum=sum+subnum;
		}
		firstnum=new_arr[index-1];
		System.out.println(firstnum);
		System.out.println(sum);
		
		
	}
}


public class UserMainCode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SumFirst sf = new SumFirst();
		int arr[]=new int[50];
		int arr2[] = new int[50];
		arr[0]=7;
		arr[1]=6;
		arr[2]=8;
		arr[3]=16;
		arr[4]=12;
		arr[5]=3;
		SumFirst.findOriginalFirstandSum(arr);
		arr2[0]=-2;
		arr2[1]=-7;
		arr2[2]=-12;
		arr2[3]=-15;
		SumFirst.findOriginalFirstandSum(arr2);
		int arr3[]=new int[50];
		arr3[0]=3;
		SumFirst.findOriginalFirstandSum(arr3);
		int arr4[]= new int[50];
		arr4[0]=-44;
		arr4[1]=-37;
		arr4[2]=31;
		arr4[3]=23;
		arr4[4]=0;
		arr4[5]=-6;
		arr4[6]=83;
		arr4[7]=110;
		arr4[8]=74;
		arr4[9]=53;
		SumFirst.findOriginalFirstandSum(arr4);
	}

}
