class StringInteger{
	public static void main(String args[]){
		String s = "###***";
		int HashCount = 0;
		int StarCount = 0;
		for(int i = 0 ; i < s.length() ; i++){
			char c = s.charAt(i);
			if(c == '#'){
				HashCount++;
			}
			else if(c == '*'){
				StarCount++;
			}
		}
		if(HashCount == StarCount){
			System.out.println("0");
		}
		else if(HashCount > StarCount){
			System.out.println("-1");
		}
		else{
			System.out.println("1");
		}
	}
}