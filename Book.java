class Author
{
	private String name;
	private String email;
	private char gender;
	Author()
	{
		
	}
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String get_name()
	{
		return name;
	}
	
	
	
}

class Books
{
	private String nameofbook;
	private double price;
	private double quantity_instock;
	private Author author;
	Books(String book)
	{
		nameofbook=book;
	}
	
	String get_name_of_the_book()
	{
		return nameofbook;
	}
	void set_price(double price)
	{
		this.price=price;
	}
	double get_price()
	{
		return price;
	}
	void set_quantity_in_stock(double qis)
	{
		quantity_instock=qis;
	}
	double get_quantity_in_stock()
	{
		return quantity_instock;
	}
	Author getAuthor()
	{
				return new Author();

	}
	
	
}


public class Book {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b= new Books("Java");
		Author a= new Author("Herberschildt","herber@gmaill.com",'m');
		b.set_price(250);
		b.set_quantity_in_stock(2);
		System.out.println("Book name: " + b.get_name_of_the_book()+" Book price: "+b.get_price()+" Quantity: "+b.get_quantity_in_stock());
		System.out.println("Authorname"+b.getAuthor());
		
		

	}

}
