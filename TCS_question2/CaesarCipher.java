class CaesarCipher{
	public static void main(String args[]){
		int key = 1;
		String plaintext = "All the best";
		String arr = "abcdefghijklmnopqrstuvwxyz";
		plaintext = plaintext.toLowerCase();
		String result = "";
		for(int i = 0 ; i < plaintext.length() ; i++){
			
			char c = plaintext.charAt(i);
			if(c == ' '){
				result += ' ';
			}
			else{
				int index = arr.indexOf(c);
				index = index % 25;
				result += arr.charAt(index+key);
				
			}
		}
		System.out.println(result);
	}
} 

