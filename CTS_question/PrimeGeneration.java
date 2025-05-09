import java.util.Scanner;
class PrimeGeneration{
	public boolean isPrime(int a){
		for(int i = 2 ; i*i <= a ; i++){
			if(a % i == 0){
				return false;	
			}
		}
		return true;

	}

	public static void main(String args[]){
		PrimeGeneration obj = new PrimeGeneration();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number to Start Prime Generation : ");
		int a = input.nextInt();
		System.out.println("Enter a Number to End Prime Generation : ");
		int b = input.nextInt();
		if(a < b){
			for(int j = a ; j <= b ; j++){
				if(obj.isPrime(j)){
					System.out.println(j + " is Prime Number");
				}
			}
		}
		else{
			System.out.println("Provide valid input");
		}
	}
}