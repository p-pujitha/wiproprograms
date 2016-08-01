class Stock
{
	String name;
	String symbol;
	double previous_closing_price;
	double current_closing_price;
	Stock(String name, String symbol, double pcp, double ccp)
	{
		this.name=name;
		this.symbol=symbol;
		previous_closing_price=pcp;
		current_closing_price=ccp;
	}
	
	double getChangePercentage()
	{
		return ((current_closing_price - previous_closing_price)/current_closing_price)*100;
	}
}
public class ClassDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Stock s= new Stock("rice","pikachubrand",7.98,8.94);
		System.out.println("Change percentage"+s.getChangePercentage());

	}

}
