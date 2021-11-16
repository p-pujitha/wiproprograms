
class Dog
{
	int time;
	void setDrinkTime(int time)
	{
		this.time=time;
	}
	int getDrinkTime()
	{
		return time;
	}
	boolean needtogo()
	{
		if(time<=4)
			return false;
		else
			return true;
	}
	
	
}
class DogOwner
{
	boolean takeForWalk(Dog d)
	{
		return d.needtogo();
	}
	
}
public class DogWalkLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.setDrinkTime(5);
		System.out.println("Dog's Time :"+d.getDrinkTime()+ "Need to go : ?"+d.needtogo());	
		//d.setDrinkTime(5);
		DogOwner od = new DogOwner();
		System.out.println("Dog's Time :"+d.getDrinkTime()+ "Need to go : ?"+od.takeForWalk(d));
		
		
		
		

	}

}
