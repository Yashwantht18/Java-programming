class keyLogger{
	public static void main(String args[]){
		int key = 1234;
		String key_str = String.valueOf(key);
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		for(int i = 0 ; i < key_str.length() ; i++){
			int rem = key_str.charAt(i) - '0';
			result += alphabets.charAt(rem-1);
		}
		System.out.println(result);

		result = "";
		Char r = '';
		Char r1 = '';
		for(int i = 0  ; i < key_str.length()/2 ; i = i+2){
			r = key_str.charAt(i);
			r1 = key_str.charAt(i+1);
			String str = r + r1;
			if(Integer.valueOf(str) <= 26){
				result += alphabets.charAt(Integer.valueOf(str)-1);
			}		
		}

		System.out.println(result);
	}
}