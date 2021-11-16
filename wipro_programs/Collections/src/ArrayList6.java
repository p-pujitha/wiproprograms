import java.util.*;
import java.util.Iterator;

class Testing
{
	
	
	LinkedList<Integer > saveEvenNumbers(int n)
	{
	LinkedList<Integer> al = new LinkedList <Integer>();
		
		for(int i=2;i<n;i++)
		{
			al.addLast(new Integer(i));
			i=i+2;
		}
		return al;
		
	}
	
LinkedList printEvenNumbers(LinkedList<Integer> al)
	{
	LinkedList<Integer> a2=new LinkedList<Integer>();	
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
Integer printEvenNumber(int n, LinkedList<Integer> al)
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



 class Arraylist6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list = new ArrayList(10);
		Testing test = new Testing();
		LinkedList<Integer> li= new LinkedList <Integer>();
		LinkedList<Integer> li2= new LinkedList <Integer>();
	li =test.saveEvenNumbers(10);
	li2 = test.printEvenNumbers(li);
	System.out.println(test.printEvenNumber(10,li));
	System.out.println(li);
	System.out.println(li2);
		
		

	}

}