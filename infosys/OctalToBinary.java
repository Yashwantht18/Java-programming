class OctalToBinary{
	public static void main(String args[]){
		String str = "527";
		int decimal = 0;
		for(int i = 0 ; i < str.length() ; i++){
			int digit = str.charAt(i) - '0';
			decimal = decimal * 8 + digit;
		}
		if(decimal == 0){
			System.out.println(0);
		}
		else{
			String binary = "";
			while(decimal > 0){
				binary = (decimal % 2) + binary;
				decimal = decimal / 2;
			}
			System.out.println(binary);
		}
	}
}