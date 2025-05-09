import java.util.*;
class ParenthesisBalancing{
	public static void main(String args[]){
		String parenthesis = "{(([]))}";
		ArrayList<Character> open = new ArrayList<>();
		for(int i = 0 ; i < parenthesis.length() ; i++){
			char symbol = parenthesis.charAt(i);
			System.out.println(symbol);
			if(symbol == '{' || symbol == '(' || symbol == '['){
				open.add(symbol);
			}
			else{
				char last = open.get(open.size()-1);
				if(symbol == '}' && last == '{'){
					open.remove(open.size()-1);
				}
				else if(symbol == ')' && last == '('){
					open.remove(open.size()-1);
				}
				else if(symbol == ']' && last == '['){
					open.remove(open.size()-1);
				}
				else{
					System.out.println("Parenthesis is not Balanced");
					break;
				}
			}
		}
		if(open.size() == 0){
			System.out.println("Parenthesis is Balanced");
		}	
	}
}