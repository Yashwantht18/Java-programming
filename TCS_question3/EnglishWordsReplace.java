class EnglishWordsReplace{
	public static void main(String args[]){
		String str1 = "how";
		String str2 = "are";
		String str3 = "you";
		StringBuffer result = new StringBuffer();
		char[] str1_arr = str1.toCharArray();
		char[] str2_arr = str2.toCharArray();
		for(int i = 0 ; i < str1_arr.length ; i++){
			char c = str1_arr[i];
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
				result.append("%");
			}
			else{
				result.append(c);
			}
		}

		for(int i = 0 ; i < str2_arr.length ; i++){
			char c = str2_arr[i];
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
				result.append(c);
			}
			else{
				result.append("#");
			}
		}
		result.append(str3.toUpperCase());
		System.out.println(result);

	}
} 