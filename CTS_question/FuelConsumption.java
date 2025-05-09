import java.util.Scanner;
class FuelConsumption{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank: ");
		int Liters = in.nextInt();
		System.out.println("Enter the distance covered: ");
		int DistancesCovered = in.nextInt();
		if(Liters < 0 || DistancesCovered < 0){
			System.out.println("Invalid Input");
		}
		else{
			double FuelConsumption = ((double)Liters/DistancesCovered) * 100.0;
			double Miles = DistancesCovered * 0.6214;
			double gollons = Liters * 0.2642;
			double cost = Miles/gollons;
			System.out.printf("Liter/100 : %.2f",FuelConsumption);
			System.out.println();
			System.out.printf("Miles/Gollons : %.2f", cost);
		}
	}
}