class Automorphic{
	public static void main(String args[]) {
		int n = 25;
        	int square = n * n;
        	String strN = Integer.toString(n);
        	String strSquare = Integer.toString(square);
        
        	if (strSquare.endsWith(strN)) {
            		System.out.println(n + " is an automorphic number");
        	}
		else{
			System.out.println(n + " is not an automorphic number");
		} 	
		
    }

}