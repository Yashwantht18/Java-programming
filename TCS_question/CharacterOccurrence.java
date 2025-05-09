class CharacterOccurrence{
	public static void main(String args[]){
		String str1 = "abacabadabacaba";
		String str2 = "abcd";
		int occurrence = 0;
		for(int i = 0 ; i <= str2.length()-1 ; i++){
			for(int j = 0 ; j < str1.length() ; j++){
				if(str2.charAt(i) == str1.charAt(j)){
					occurrence++;
				}
			}
		}
		System.out.println(occurrence);		
	}
}