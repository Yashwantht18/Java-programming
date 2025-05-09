class OctalToHexaDecimal{
	public static void main(String args[]){
		String str = "527";
		//int n = Integer.valueOf(str);
		int decimal = 0;
		String hexa = "123456789ABCDEFG";
		int base = 16;
		String result = "";
		for(int i = 0 ; i < str.length() ; i++){
			int digit = str.charAt(i) - '0';
			decimal = decimal * 8 + digit;
		}
		while(decimal > 0){
			result = hexa.charAt((decimal % base)-1) + result;
			decimal = decimal/base;
		}
		System.out.println(result);
	}
}