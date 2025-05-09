class DecimalToBinary{
	public static void main(String args[]){
		int n = 4;
		String result = "";
		while(n > 0){
			result = (n % 2) + result;
			n = n/2;
		}
		System.out.println(result);
	}
}