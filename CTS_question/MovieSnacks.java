import java.util.Scanner;
class MovieSnacks{
	public static void main(String args[]){
		int pizza = 100;
		int puffs = 20;
		int cooldrink = 10;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought: ");
		int pizzaCount = in.nextInt();
		System.out.println("Enter the no of puffs bought: ");
		int puffsCount = in.nextInt();
		System.out.println("Enter the no of cooldrinks bought: ");
		int cooldrinkCount = in.nextInt();
		int totalSum = 0;
		
		totalSum = pizzaCount * pizza + puffsCount * puffs + cooldrinkCount * cooldrink;

		System.out.println(totalSum);
		
	}
}