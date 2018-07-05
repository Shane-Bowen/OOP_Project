/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

public class Product {
	
	//---------------------------------------
	//	Attributes
	//---------------------------------------
	
	public String name;
	public String description;
	public int price;
	public int productID;
	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
	
	public Product(String n, String d, int p, int id)
	{
		this.name = n;
		this.description = d;
		this.price = p;
		this.productID = id;
	}
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------	

	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getProductID()
	{
		return productID;
	}
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------	
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setDescription(String d)
	{
		this.description = d;
	}
	
	public void setPrice(int p)
	{
		this.price = p;
	}
	
	public void setProductID(int id)
	{
		this.productID = id;
	}
	
	public void printProduct()
	{
		System.out.print(" " + productID );
	}
	
}