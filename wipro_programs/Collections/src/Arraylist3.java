
import java.util.*;
public class Arraylist3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> as= new ArrayList<String>();
		as.add("pujitha");
		as.add("pravallika");
		as.add("bhargavi");
		Iterator i = as.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
