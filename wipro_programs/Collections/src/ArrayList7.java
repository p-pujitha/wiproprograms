import java.util.*;
import java.util.Iterator;

class Testing2
{
	
	
	Vector<Integer > saveEvenNumbers(int n)
	{
	Vector<Integer> al = new Vector <Integer>();
		
		for(int i=2;i<n;i++)
		{
			al.add(new Integer(i));
			i=i+2;
		}
		return al;
		
	}
	
Vector printEvenNumbers(Vector<Integer> al)
	{
	Vector<Integer> a2=new Vector<Integer>();	
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
Integer printEvenNumber(int n, Vector<Integer> al)
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



 class Arraylist7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list = new ArrayList(10);
		Testing2 test = new Testing2();
	 Vector<Integer> li= new Vector<Integer>();
	 Vector<Integer> li2= new Vector<Integer>();
	li =test.saveEvenNumbers(10);
	li2 = test.printEvenNumbers(li);
	System.out.println(test.printEvenNumber(10,li));
	System.out.println(li);
	System.out.println(li2);
		
		

	}

}