class GoodNumber{
	public static void main(String args[]){
		int a = 19;
		int copy = a;
		int sum = 0;
		
		while(a > 0){
			int rem = a % 10;
			sum += rem;
			a = a / 10;
		}
		if(copy % sum == 0){
			System.out.println("Good Number");
		}
		else{
			System.out.println("Not a Good Number");
		}
		 
	}
}