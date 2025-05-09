class BinaryAddition{
	public static void main(String args[]){
		String a = "10010";
		String b = "111101";
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		String result = "";
		while(i >= 0 || j >= 0 || carry == 1){
			int d1 = (i >= 0) ? a.charAt(i) - '0' : 0;
			int d2 = (j >= 0) ? b.charAt(j) - '0' : 0;
			int sum = d1 + d2 + carry;
			result += sum % 2;
			carry = sum/2;
			j--;
			i--;
		}
		System.out.println(result); 
	}
}