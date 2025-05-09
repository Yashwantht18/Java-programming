class PrimeForPositive{
	public static boolean isPrime(int num){
		for(int i = 2 ; i * i <= num ; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isPositive(int n){
		if(n > 0){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		int n = -19;
		if(isPositive(n)){
			if(isPrime(n)){
				System.out.println(n + " is Prime Number");
			}
			else{
				System.out.println(n + " is not a Prime Number");
			}
		}
		else{
			System.out.println("please enter the positive number");
		}
	}
}