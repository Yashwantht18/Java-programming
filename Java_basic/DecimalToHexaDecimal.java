class DecimalToHexaDecimal{
	public static void main(String args[]){
		int n = 20;
		String hexa = "123456789ABCDEFG";
		int base = 16;
		String result = "";
		while(n > 0){
			result = hexa.charAt((n % base)-1) + result;
			n = n/base;
		}
		System.out.println(result);
	}
}