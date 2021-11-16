class Employee implements Cloneable
{
	int empid;
	String empname;
	double salary;
	void assigndetails(int empid, String empname, double salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	void printdetails()
	{
		System.out.println("Empid"+ empid + "\n Empname" + empname +"\n Salary"+salary);
	}
	Employee cloneTest()
	{
		try{
			return (Employee)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("cloning not allowed");
			return this;
		}
	}

}
public class WrapperDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.assigndetails(1, "pujitha", 10000);
		Employee e2 = e1.cloneTest();
		e2.empid=2;
		e1.printdetails();
		e2.printdetails();
		

	}

}
