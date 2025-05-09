class Palindrome{
	public static void main(String args[]){
		int a = 21212;
		int copy = a;
		String result = "";
		while(a > 0){
			int rem = a % 10;
			result += rem;
			a = a / 10;
		}
		int resultNum = Integer.valueOf(result);
		if(resultNum == copy){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not a Palindrome");
		}
				 
	}
}