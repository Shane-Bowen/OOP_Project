/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

import java.util.Scanner;
public class Order {

	final static Scanner kb = new Scanner(System.in);

	static int[] quantity = new int[20];
	static int noOfItems = 0;
	static Phone[] orderList = new Phone[20];

	public void add(Phone p, int i) 
	{
		orderList[noOfItems] = p;
		quantity[noOfItems] = i;
		noOfItems ++;
	}

	public static void orderProduct(ProductDB pd, Customer Mary, Phone p)
	{
		System.out.print("Enter the customer name: ");
		String name = kb.next();

		System.out.print("Enter the Product ID: ");
		int id = kb.nextInt();

		System.out.print("Enter the quantity: ");
		int amount = kb.nextInt();

		if(name.equalsIgnoreCase(Mary.name))
		{
			for(int i = 0; i < ProductDB.noOfProducts; i++)
			{
				if(id == ProductDB.product[i].productID)
				{
					Order o = new Order();
					o.add(ProductDB.phone[i], amount);
					Mary.addOrder(o);

					System.out.println("You ordered " + amount + " " + ProductDB.phone[i].make + " " + ProductDB.phone[i].model);
				}
			}
		}
	}

	public static void print()
	{	
		boolean ok = false;
		
		do{
			
			System.out.print("Enter the name of the customer: ");
			String name = kb.next();
		
		for(int i = 0; i < Customer.noOfNames; i++)
		{			
			if(name.equalsIgnoreCase(Customer.nameList[i]))
			{	
				for(int j=0; j<noOfItems; j++)
				{
					orderList[j].printPhone();
					System.out.print("\tQuantity: " + quantity[j]);
				}
				
				ok = true;
				break;
			}
		}
		
		if(ok == false)
		{
			System.out.println("Sorry name is not in system");
		}
		
		}while(!ok);

	}

}