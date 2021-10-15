import java.util.*;
class Product
{
	int pcode,price;
	String pname;
	void read()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter code:");
		pcode=in.nextInt();
		System.out.println("Enter name:");
		pname=in.next();
		System.out.println("Enter price:");
		price=in.nextInt();
	}
}
class ProductMain
{
	public static void main(String[] args)
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.read();
		p2.read();
		p3.read();
		if(p1.price<p2.price)
		{
			if(p1.price<p3.price)
			System.out.println("\nLowest price product is "+p1.pname);
		}
		else if(p2.price<p1.price)
		{
			if(p2.price<p3.price)
			System.out.println("\nLowest price product is "+p2.pname);
		}
		else
		System.out.println("\nLowest price product is "+p3.pname);
	}
}