import java.util.*;

class Test
{
	
	
public	ArrayList<Integer > saveEvenNumbers(int n)
	{
	ArrayList<Integer> al = new ArrayList <Integer>(10);
		
		for(int i=2;i<n;i++)
		{
			al.add(new Integer(i));
			i=i+2;
		}
		return al;
		
	}
ArrayList printEvenNumbers(ArrayList<Integer> al)
	{
	ArrayList<Integer> a2=new ArrayList<Integer>(10);	
	Iterator i =al.iterator();
		int index=0;
		while(index<al.size())
		{
			int j= al.get(index).intValue();
			a2.add(new Integer(j*2));
			index++;
			
		}
		return a2;
	}
Integer printEvenNumber(int n, ArrayList<Integer> al)
{
	Integer i = new Integer(n);
	Iterator it = al.iterator();
	while(it.hasNext())
	{
	if(al.contains(i))
		return i;
	else
		it.next();
	
	}
	return 0;
}
}



public class Arraylist1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list = new ArrayList(10);
		Test test = new Test();
		ArrayList<Integer> li= new ArrayList <Integer>(10);
		ArrayList<Integer> li2= new ArrayList <Integer>(10);
	li = 	test.saveEvenNumbers(10);
	li2 = test.printEvenNumbers(li);
	System.out.println(test.printEvenNumber(10,li));
	System.out.println(li);
	System.out.println(li2);
		
		

	}

}
