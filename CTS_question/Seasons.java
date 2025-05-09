import java.util.Scanner;

class Seasons{
	public static void main(String args[]){
		String[] arr = {"Spring","Summer","Autumn","Winter"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int Month = in.nextInt();
		if(Month > 12){
			System.out.println("Invalid Month");
		}
		else{
			Month = Month % 4;
			System.out.println("Season : " + arr[Month-1]);
		}
	}
}