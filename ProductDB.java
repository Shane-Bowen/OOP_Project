/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

import java.util.Scanner;
public class ProductDB {
	final static Scanner kb = new Scanner(System.in);

	static int noOfPhone = 0;
	static int noOfProducts = 0;

	static Phone[] phone = new Phone[20];

	static Product[] product = new Product[20];

	public void add(Phone p) 
	{
		phone[noOfPhone] = p;
		noOfPhone ++;
	}

	public void addProduct(Product pd)
	{
		product[noOfProducts] = pd;
		noOfProducts ++;
	}

	public void remove(Phone p) 
	{

	}

	public static void print()
	{
		for(int i = 0; i < noOfPhone; i++)
		{
			phone[i].printPhone();
			product[i].printProduct();
		}
	}

	public static void searchProduct()
	{
		boolean ok = false;
		
		do{
		
		System.out.print("Please enter product ID: ");
		int id = kb.nextInt();

		for(int i = 0; i < noOfProducts; i++)
		{
			if(id == product[i].productID)
			{
				phone[i].printPhone();
				ok = true;
				break;
			}
		}
		
		if(ok == false)
		{
			System.out.println("Sorry Item is not in the System! ");
		}
		
		}while(!ok);
	}
}