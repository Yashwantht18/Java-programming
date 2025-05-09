import java.util.*;

class LetterRepeatation{
	public static void main(String args[]){
		String str = "abcabcefghabcdedeeee";
		HashMap<Character,Integer> map = new HashMap<>();
		String result = "";

		for(int i = 0 ; i < str.length() ; i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else{
				map.put(str.charAt(i) , 1);
			}
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        	list.sort((a, b) -> b.getValue() - a.getValue()); 
  
        	for (Map.Entry<Character, Integer> entry : list) {
            		if (entry.getValue() >= 2) {
                		result += entry.getKey();
            		}
        	}
		System.out.println(result);
	} 
}