class FactorialWithoutMultiplicationDivision{
	public static int add(int a , int b){
		int sum = 0;
		for(int i = 0 ; i < a ; i++){
			sum++;
		}
		for(int j = 0 ; j < b ; j++){
			sum++;
		}
		return sum;
	}


	public static int mul(int a , int b){
		int result = 0;
		for(int i = 0 ; i < b ; i++){
			result = add(result,a);
		}
		return result;

	}

	public static int fact(int n){
		int output = 1;
		for(int i = 2 ; i <= n ; i++){
			output = mul(output,i);
		}
		return output;
	}

	public static void main(String args[]){
		int n = 2;
		System.out.println(fact(n));
	}
}