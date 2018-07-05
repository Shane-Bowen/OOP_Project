/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */
public class Phone 
/*extends Product*/ {
	
	//---------------------------------------
	//	Attributes
	//---------------------------------------

	public String make;
	public String model;
	public int storageSpace;
	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
	
	public Phone(String ma, String mo, int s) 
	{
		super();
		
		this.make = ma;
		this.model = mo;
		this.storageSpace = s;
	}
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------	
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getStorageSpace()
	{
		return storageSpace;
	}
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------	
	
	public void setMake(String ma)
	{
		this.make = ma;
	}
	
	public void setModel(String mo)
	{
		this.model = mo;
	}
	
	public void setStorageSpace(int s)
	{
		this.storageSpace = s;
	}
	
	public void printPhone()
	{
		System.out.print("\n" + make + " " + model + " " + storageSpace);		
	}

}