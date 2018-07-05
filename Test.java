/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

import java.util.Scanner;
public class Test {

	final static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		ProductDB database = new ProductDB();
		Phone p = new Phone("Apple", "iphone 6", 8); // all parameters not shown 
		database.add(p);
		Phone p1 = new Phone("Samsung","Galaxy s6", 16);
		database.add(p1);
		Phone p2 = new Phone("Apple", "iphone 5",  4);
		database.add(p2);
		Phone p3 = new Phone("Samsung","Galaxy s5", 32);
		database.add(p3);
		Customer Mary = new Customer("Mary", "Cork");
		Order o = new Order();
		o.add(p,12); // ordered 12 iphone 6 products
		o.add(p1,1); //ordered 1 Galaxy s6 
		Mary.addOrder(o);
		Order o1 = new Order();
		o1.add(p2,1); // ordered 1 iphone 5 products 
		o1.add(p3,5); //ordered 5 Galaxy s5 products 
		Mary.addOrder(o1);

		Product pd = new Product("Apple", "Good" , 100, 12345);
		database.addProduct(pd);
		Product pd1 = new Product("Samsung", "Fair", 50, 12346);
		database.addProduct(pd1);
		Product pd2 = new Product("Apple", "Fair" , 100, 12347);
		database.addProduct(pd2);
		Product pd3 = new Product("Samsung", "Good", 50, 12348);
		database.addProduct(pd3);

		boolean exit = false;

		while (exit == false)
		{
			System.out.println("\nPlease enter a menu option");
			System.out.println("1. Create a new phone.");
			System.out.println("2. Search for products by supplying the Product ID.");
			System.out.println("3. Display all products.");
			System.out.println("4. Order Products.");
			System.out.println("5. Display all orders.");
			System.out.println("6. Quit");

			int choice = kb.nextInt();
			kb.nextLine();
			switch (choice) {

			case 1:
				createNewPhone(database);
				break;
			case 2:
				search(database);
				break;
			case 3:
				displayProducts(database);
				break;
			case 4:
				order(database,Mary, o, p);
				break;
			case 5:
				displayOrder(o);
				break;
			case 6:
				System.out.println("Goodbye");
				exit = true;
				break;
			}
			kb.nextLine();
		}
	}

	public static Phone createNewPhone(ProductDB pd)
	{
		System.out.print("Enter the make of the phone: ");
		String make = kb.next();

		System.out.print("Enter the model of the phone: ");
		String model = kb.next();

		System.out.print("Enter the gb of the phone: ");
		int gb = kb.nextInt();

		System.out.print("What comment would you like to make about the phone: ");
		String comment = kb.next();

		System.out.print("What is the price of the phone: ");
		int price = kb.nextInt();
		
		boolean ok;
		int id;

		do{
			
			System.out.print("What is the id of the phone: ");
			id = kb.nextInt();
			ok = true;
			
			for(int i = 0; i < ProductDB.noOfProducts; i++)
			{				
				if(id == ProductDB.product[i].productID)
				{
					System.out.println("Sorry this ID is already being used! ");
					ok = false;
					break;
				}
			}

			if(ok == true)
			{
				System.out.println("OK");
			}

		}while(!ok);

		Phone p = new Phone(make, model, gb);
		pd.add(p);

		Product pd1 = new Product(make, comment, price, id);
		pd.addProduct(pd1);

		System.out.println("\nYou have added " + make + " " + model + " with storage of " + gb + " into the database.");

		return p;
	}

	public static void search(ProductDB pd)
	{
		ProductDB.searchProduct();
	}

	public static void displayProducts(ProductDB pd)
	{
		ProductDB.print();
	}

	public static void order(ProductDB database, Customer Mary, Order o, Phone p)
	{
		Order.orderProduct(database, Mary, p);
	}

	public static void displayOrder(Order o)
	{
		Order.print();
	}
}