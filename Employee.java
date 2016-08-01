

public class Employee extends Person {

	double annualsalary;
	long year;
	String nin;
	Employee(double as, long y, String n, String name)
	{
		annualsalary=as;
		year=y;
		nin=n;
		this.name=name;
	}
	void display()
	{
		System.out.println("Annual Salary="+ annualsalary);
		System.out.println("Year="+year);
		System.out.println("National Insurance Number="+ nin);
		System.out.println("Your name="+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(105.28,1996,"14887","pujitha");
		e.display();
		

	}

}
