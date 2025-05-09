import java.util.Scanner;
class MaximumPlacedDept{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE: ");
		int CSE = in.nextInt();
		System.out.println("Enter the no of students placed in ECE: ");
		int ECE = in.nextInt();
		System.out.println("Enter the no of students placed in MECH: ");
		int MECH = in.nextInt();

		int max = 0;
		max = Math.max(CSE,ECE);
		max = Math.max(max,MECH);
		
		System.out.println("Highest Placement");
		if(max == CSE){
			System.out.println("CSE");
		}
		if(max == ECE){
			System.out.println("ECE");
		}
		if(max == MECH){
			System.out.println("MECH");
		}

	}
}