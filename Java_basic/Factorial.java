class Factorial{

	public int fact(int n){
		if(n == 1 || n == 0){
			return 1;
		}
		return n * fact(n-1);
	}
	public static void main(String args[]){
		int n = 5;
		Factorial obj = new Factorial();
		System.out.println(obj.fact(n));		 
	}
}