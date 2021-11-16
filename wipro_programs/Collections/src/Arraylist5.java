import java.util.*;
class Workers_in_Office
{
	int empid;
	String empname;
	String address;
	Workers_in_Office()
	{
		
	}
	Workers_in_Office(int id, String name, String address)
	{
		this.empid = id;
		this.empname= name;
		this.address=address;
	}
	int getId()
	{
		return empid;
	}
	String getName()
	{
		return empname;
	}
	String getAddress()
	{
		return address;
	}
	
}
class EmployeeObjects
{
	ArrayList<Workers_in_Office> w = new ArrayList <Workers_in_Office>();
	EmployeeObjects()
	{
		
		w.add(new Workers_in_Office(1,"pujitha","Vizag"));
		w.add(new Workers_in_Office(2,"Pravallika","Guntur"));
		
	}
	String Search_Employee(int id)
	{
			int index =0;
			while(index<w.size())
			{
				if((w.get(index).empid)==id)
				{
					System.out.println("FOund Employee "+w.get(index).empname);
					return w.get(index).empname;
				}
			}
			return " ";
	}
}
public class Arraylist5 {
	
	
	public  static  void main(String args[])
	{
		EmployeeObjects eo = new EmployeeObjects();
		eo.Search_Employee(1);
		
		
		
		
		
		
	}

}
