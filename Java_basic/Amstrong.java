class Amstrong{
	public static void main(String args[]){
		int a = 145;
		int temp = a;
		int rem = 0;
		int result = 0;
		String b = String.valueOf(a); 
		int len = b.length();	
		while(a > 0){
			rem = a % 10;
			result += Math.pow(rem,len);
			a = a/ 10;
		}
		System.out.println(result == temp? "Amstrong Number": "Not an amstrong Number");
		
	}
}