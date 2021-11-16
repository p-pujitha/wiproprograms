class Student extends Person
{
	Student(String name)
	{
		this.name=name;
	}
}
class Teacher extends Person
{
	int salary;
	String subject;
	Teacher(int salary, String subject, String name)
	{
		this.salary=salary;
		this.subject=subject;
		this.name=name;
	}
	void printTeacherDetails()
	{
		System.out.println("Teacher name="+name);
		System.out.println("Teacher salary="+salary);
		System.out.println("Teacher subject="+subject);
	}
}
class CollegeStudent extends Student
{
	int year;
	String major;
	CollegeStudent(int year, String major, String name)
	{
		super(name);
		this.year=year;
		this.major=major;
		
	}
	void printCollegeStudentDetails()
	{
		System.out.println("Student name="+name);
		System.out.println("Student joining year="+year);
		System.out.println("Student Branch="+major);
	}
}


public class Inheritance3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t= new Teacher(50000,"Maths","Bhargavi");
		t.printTeacherDetails();
		CollegeStudent cs= new CollegeStudent(1996,"CSE","pujitha");
		cs.printCollegeStudentDetails();

	}

}
