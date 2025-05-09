class GCD{
	public static void main(String args[]){
		int a = 30;
		int b = 20;
		int ans = (a > b) ? b : a;
		for(int i = ans ; i > 1 ; i--){
			if( a % i == 0 && b % i == 0){
				break;a
			}
			else{
				System.out.println(1);
			}
		}
	}
}