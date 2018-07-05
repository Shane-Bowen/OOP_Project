/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

public class Customer {

	//---------------------------------------
	//	Attributes
	//---------------------------------------

	public String name;
	public String address;

	static int noOfProducts = 0;
	static int noOfNames = 0;
	static String[] nameList = new String[20];
	static Order[] orderList = new Order[20];

	//---------------------------------------
	//	Constructor
	//---------------------------------------

	public Customer(String n, String a)
	{
		this.name = n;
		nameList[noOfNames] = n;
		noOfNames ++;
		this.address = a;
	}

	//---------------------------------------
	//	Get Methods
	//---------------------------------------

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	//---------------------------------------
	//	Set Method
	//---------------------------------------	

	public void setName(String n)
	{
		this.name = n;
	}

	public void setAddress(String a)
	{
		this.address = a;
	}

	public void addOrder(Order o) 
	{
		orderList[noOfProducts] = o;
		noOfProducts ++;
	}	
	
}