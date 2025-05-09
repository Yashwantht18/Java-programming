class HarshadNumber{
	public static void main(String args[]){
		int n = 25;
		int copy = n;
		int result = 0;
		while(n > 0){
			int rem = n % 10;
			result += rem;
			n = n/10;
		}
		if(copy % result == 0){
			System.out.println(copy+" is a Harshad Number");
		}
		else{
			System.out.println(copy+" is not a Harshad Number");
		}
	}
}