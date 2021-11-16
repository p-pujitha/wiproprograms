abstract class GeneralBank
{
	abstract float getSavingInterestRate();
	abstract double getFixedInterestRate();
}

 class ICICIBank extends GeneralBank
{
	float getSavingInterestRate()
	{
		return 4;
	}
	double getFixedInterestRate()
	{
		return 8.5;
	}
}

 class KotMBank extends GeneralBank
{
	float getSavingInterestRate()
	{
		return 6;
	}
	double getFixedInterestRate()
	{
		return 9;
	}
}


public class AbstractClasses1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KotMBank k=new KotMBank();
		System.out.println("Percent of Saving Interest in KotMBank"+k.getSavingInterestRate());
		ICICIBank i = new ICICIBank();
		System.out.println("Percent of Saving Interest in ICICI is "+ i.getSavingInterestRate());
		System.out.println("Percent of Fixed Interest in KOtMBank"+k.getFixedInterestRate());
		System.out.println("Percent of Fixed Interest in ICICI is"+i.getFixedInterestRate());
		GeneralBank g;
		g=k;
		System.out.println("Percent of Saving Interest in KotMBank using GeneralBank Instance"+ g.getSavingInterestRate());
		GeneralBank g2;
		g2=i;
		System.out.println("Percent of Fixed Interest in ICICI using GeneralBank Instance"+ g2.getFixedInterestRate());

	}

}
