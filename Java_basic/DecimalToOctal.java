class DecimalToOctal{
	public static void main(String args[]){
		int n = 47;
		int base = 8;
		String result = "";
		while(n > 0){
			result = (n % base) + result;
			n = n/base;
		}
		System.out.println(result);
	}
}