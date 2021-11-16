import java.lang.*;
abstract class Instrument
{
	abstract void play();
}
class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}
class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}
public class AbstractClasses3 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instrument i[]= new Instrument[10];
		Class cls = Instrument.class;
		Guitar g = new Guitar();
		i[0]=g;
		i[0].play();
		Flute t = new Flute();
		i[1]=t;
		i[1].play();
		Piano p = new Piano();
		i[2]=p;
		i[2].play();
		System.out.println(cls.isInstance(i[0]));
		System.out.println(cls.isInstance(g));
		System.out.println(cls.isInstance(t));
	}

}
