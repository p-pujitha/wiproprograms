class RunOne implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new RunOne(),"ThreadOne");
		t1.run();

	}

}
