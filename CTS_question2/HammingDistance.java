class HammingDistance{
	public static void main(String args[]){
		int a = 9;
		int b = 14;
		String result = "";
		int count= 0 ;
		while(a > 0){
			result = (a % 2) + result;
			a = a/2;
		}
		String result1 = "";
		while(b > 0){
			result1 = (b % 2) + result1;
			b = b/2;
		}
		int len = result.length();
		int len1 = result1.length();
		for(int i = 0 ; i <= 32 - len ; i++){
			result  = "0" + result;
		}
		for(int i = 0 ; i <= 32 - len1 ; i++){
			result1  = "0" + result1;
		}
		
		for(int i = 0 ;  i < result.length() ; i++){
			if(result1.charAt(i) == result.charAt(i)) continue;
			else count ++;
		}

		System.out.println(result);
		System.out.println(result1);
		System.out.println(count);
	}
}