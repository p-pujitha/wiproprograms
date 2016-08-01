import java.util.*;
public class EmployeeDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String details[][]= new String[2][8];
		int da=0;
		System.out.println("Enter the details");
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				details[i][j]=s.next();
			}
		}
		int empid= Integer.parseInt(args[0]);
		int count=0,flag=0;
		for(int i=1;i<8;i++)
		{ 
			int employid=Integer.parseInt(details[i][count]);
			if(employid!=empid)
				continue;
			else
			{
				System.out.print("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary\n");
				System.out.print(details[i][0] + "\t"+ details[i][1]+"\t"+ details[i][4]);
				char des=details[i][3].charAt(0);
				switch(des)
				{
				case 'e' : System.out.print("\tEngineer");
							da=20000;
							break;
				case 'c' : System.out.print("\tConsultant");
						    da=32000;
						    break;
				case 'k' : System.out.print("\tClerk");
						    da=12000;
						    break;
				case 'r' : System.out.print("\tReceptionist");
						    da=15000;
						    break;
				
				}
				int basic=Integer.parseInt(details[i][5]);
				int hra=Integer.parseInt(details[i][6]);
				int it=Integer.parseInt(details[i][7]);
				int salary=basic+hra+da-it;
				System.out.print("\t"+salary);
				flag=1;
				break;
				
				}
			 
			
				
			}
		if(flag==0)
			System.out.println("There is no employee id with empid: "+empid);
		 
			
		}
		

	}


