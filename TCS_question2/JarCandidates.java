class JarCandidates{
	public static void main(String agrs[]){
		int N = 10;
		int CustomerBuys = 6;
		if(CustomerBuys > 10){
			System.out.println("INVALID INPUT");
		}
		else{
			int k = N - CustomerBuys;
			System.out.println("NUMBER OF CANDIES SOLD : " + CustomerBuys);
			System.out.println("NUMBER OF CANDIES LEFT : " + ((k <= 5)? 10 : k));
		}
		

	}
}