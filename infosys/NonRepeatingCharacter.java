import java.util.*;
class NonRepeatingCharacter{
	public static void main(String args[]){
		String str = "abcace";
		Set<Character> set = new HashSet<>();
		
		for(int i = 0 ; i < str.length() ; i++){
			if(set.contains(str.charAt(i))){
				set.remove(str.charAt(i));
			}
			else{
				set.add(str.charAt(i));
			}
		}
		char first = set.iterator().next();
		System.out.println(first);	
	}
}