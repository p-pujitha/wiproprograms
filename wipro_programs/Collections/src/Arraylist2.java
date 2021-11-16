import java.util.*;
class Employee
{
	String name;
	int ecode;
	Employee()
	{
		
	}
	Employee(String name, int ecode)
	{
		this.name =name;
		this.ecode=ecode;
	}
	
}

class EmployeeDB
{
	ArrayList <Employee> ae = new ArrayList<Employee>();
	
	boolean addEmployee(Employee e)
	{
		ae.add(e);
		return true;
	}
	boolean deleteEmployee(int Ecode)
	{
		//Iterator i = ae.iterator();
		int index=0;
		while(index < ae.size())
		{
			if(ae.get(index).ecode==Ecode)
			{
				ae.remove(index);
				return true;
			}
				
		}
		return false;
	}
	
	String showpaySlip(int Ecode)
	{
		int index=0;
		while(index < ae.size())
		{
			if(ae.get(index).ecode == Ecode)
			{
				return ae.get(index).name;
			}
		}
		return "Ecode is not available";
	}
	
	ArrayList listall()
	{
		Iterator i = ae.iterator();
		while(i.hasNext())
		{
			i.next();
			

		}
		return ae;
	}
}
public class Arraylist2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("pujitha",1);
		EmployeeDB e2 = new EmployeeDB();
		System.out.println(e2.addEmployee(e1));
		System.out.println(e2.showpaySlip(1));
		Employee e3 = new Employee("puji",3);
		e2.addEmployee(e3);
		System.out.println(e2.listall());
		Iterator i = e2.listall().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getClass());
			
			//System.out.println(e.ecode +e.name);
		}
		ArrayList al=e2.listall();
		for(Object e : al)
		{
			Employee em = (Employee)e;
			System.out.println(em.ecode);
			System.out.println(em.name);
			
		}

	}
}


