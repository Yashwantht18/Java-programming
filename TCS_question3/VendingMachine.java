import java.util.Scanner;
class VendingMachine{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("Coffee");
		System.out.println("Tea");
		System.out.println("Soups");
		System.out.println("Beverages");
		System.out.println("Enter a first letter to select from main menu :");
		String mainMenu = in.next();
	
		if(mainMenu.equals("c") || mainMenu.equals("C")){
			System.out.println("Sub Menu");
			System.out.println("1.Espresso Coffee");
			System.out.println("2.Cappuccino Coffee");
			System.out.println("3.Latte Coffee");
			System.out.println("Enter a Number to select from sub menu :");
			int subMenu = in.nextInt();
			System.out.println("Welcome to CCD!"); 
			switch(subMenu){
				case 1:
					System.out.println("Enjoy your Espresso Coffee!");
					break;
				case 2:
					System.out.println("Enjoy your Cappuccino Coffee!");
					break;
				case 3:
					System.out.println("Enjoy your Latte Coffee!");
					break;
			}	
		}
		else if(mainMenu.equals("t") || mainMenu.equals("T")){
			System.out.println("Sub Menu");
			System.out.println("1.Plain Tea");
			System.out.println("2.Assam Tea");
			System.out.println("3.Ginger Tea");
			System.out.println("4.Cardamom Tea");
			System.out.println("5.Masala Tea");
			System.out.println("6.Lemon Tea");
			System.out.println("7.Green Tea");
			System.out.println("8.Organic Darjeeling Tea");
			System.out.println("Enter a Number to select from sub menu :");
			int subMenu = in.nextInt();
			System.out.println("Welcome to CCD!"); 
			switch(subMenu){
				case 1:
					System.out.println("Enjoy your Plain Tea!");
					break;
				case 2:
					System.out.println("Enjoy your Assam Tea!");
					break;
				case 3:
					System.out.println("Enjoy your Ginger Tea!");
					break;
				case 4:
					System.out.println("Enjoy your Cardamom Tea!");
					break;
				case 5:
					System.out.println("Enjoy your Masala Tea!");
					break;
				case 6:
					System.out.println("Enjoy your Lemon Tea!");
					break;
				case 7:
					System.out.println("Enjoy your Green Tea!");
					break;
				case 8:
					System.out.println("Enjoy your Organic Darjeeling Tea!");
					break;
			}	
		}
		else if(mainMenu.equals("s") || mainMenu.equals("S")){
			System.out.println("Sub Menu");
			System.out.println("1.Hot and Sour Soup");
			System.out.println("2.Veg Corn Soup");
			System.out.println("3.Tomato Soup");
			System.out.println("4.Spicy Tomato Soup");
			System.out.println("Enter a Number to select from sub menu :");
			int subMenu = in.nextInt();
			System.out.println("Welcome to CCD!"); 
			switch(subMenu){
				case 1:
					System.out.println("Enjoy your Hot and Sour Soup!");
					break;
				case 2:
					System.out.println("Enjoy your Veg Corn Soup!");
					break;
				case 3:
					System.out.println("Enjoy your Tomato Soup!");
					break;
				case 4:
					System.out.println("Enjoy your Spicy Tomato Soup!");
					break;
			}	
		}
		else if(mainMenu.equals("b") || mainMenu.equals("B")){
			System.out.println("Sub Menu");
			System.out.println("1.Hot Chocolate Drink");
			System.out.println("2.Badam Drink");
			System.out.println("3.Badam-Pista Drink");
			System.out.println("Enter a Number to select from sub menu :");
			int subMenu = in.nextInt();
			System.out.println("Welcome to CCD!"); 
			switch(subMenu){
				case 1:
					System.out.println("Enjoy your Hot Chocolate Drink!");
					break;
				case 2:
					System.out.println("Enjoy your Badam Drink!");
					break;
				case 3:
					System.out.println("Enjoy your Badam-Pista Drink!");
					break;

			}	
		}

		
	}
} 