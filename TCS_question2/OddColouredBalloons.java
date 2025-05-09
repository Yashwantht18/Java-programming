import java.util.HashMap;
class OddColouredBalloons{
	public static void main(String args[]){
		int N = 7;
		boolean check = true;
		char[] arr = {'r','g','b','b','g','y','y'};
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : arr){
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		for(char c : map.keySet()){
			if(map.get(c)%2 == 1){
				System.out.println(c + " : " + map.get(c));
				check = false;
				break;
			}
		}
		if(check){
			System.out.println("All are Even");	
		}
	}
}