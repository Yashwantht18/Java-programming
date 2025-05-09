class OctalToDecimal{
	public static void main(String args[]){
		String str = "527";
		int decimal = 0;
		for(int i = 0 ; i < str.length() ; i++){
			int digit = str.charAt(i) - '0';
			decimal = decimal * 8 + digit;
			System.out.println(decimal);
		}
		System.out.println(decimal);

	}
}