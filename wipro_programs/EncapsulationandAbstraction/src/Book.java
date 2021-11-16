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
	String get_email()
	{
		return email;
	}
	char get_gender()
	{
		return gender;
	}
	
	
	
}

class Books
{
	private String nameofbook;
	private double price;
	private double quantity_instock;
	private Author author;
	Books(String book, double p, double qin, Author a)
	{
		nameofbook=book;
		price=p;
		quantity_instock=qin;
		author=a;
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
				return author;

	}
	
	
}


public class Book {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a= new Author("Herberschildt","herber@gmaill.com",'m');
		Books b= new Books("Java",500,2.5,a);
		b.set_price(250);
		b.set_quantity_in_stock(2);
		System.out.println("Book name: " + b.get_name_of_the_book()+" Book price: "+b.get_price()+" Quantity: "+b.get_quantity_in_stock());
		Author instance_get = b.getAuthor();
		System.out.println("Author name:"+instance_get.get_name()+"Author email:"+instance_get.get_email()+"Author gender:"+instance_get.get_gender());
		
		

	}

}
