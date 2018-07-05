/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

public class TV extends Product {
	
	//---------------------------------------
	//	Attributes
	//---------------------------------------
	
	public String make;
	public String screenSize;
	public String type;
	public boolean capable3D;
	
	//---------------------------------------
	//	Constructor
	//---------------------------------------

	public TV (String n, String d, int p, int id) 
	{
		super(n, d, p, id);
	}
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------
	
	public String getMake()
	{
		return make;
	}
	
	public String getScreenSize()
	{
		return screenSize;
	}
	
	public String getType()
	{
		return type;
	}
	
	public boolean getCapable3D()
	{
		return capable3D;
		
	}
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------	
	
	public void setMake(String m)
	{
		this.make = m;
	}
	
	public void setScreenSize(String s)
	{
		this.screenSize = s;
	}
	
	public void setType(String t)
	{
		this.type = t;
	}
	
	public void setCapable3D(boolean c)
	{
		this.capable3D = c;
	}
	
	public void print()
	{
		System.out.println(make + " " + screenSize + " " + type + " " + capable3D);
		super.printProduct();
	}
	
}
