import java.util.Scanner;
class Alphabets{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Only enter 4 digits!");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println("Enter a " + (i+1) + " digit : ");
			arr[i] = in.nextInt();
		}
		
		for(int j = 0 ; j < arr.length ; j++){
			System.out.println(arr[j] + " - " + (char)arr[j]);
		}

		
	}
}