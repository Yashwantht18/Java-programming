class MaximumGuest{
	public static void main(String args[]){
		int T = 5;
		int[] E = {7,0,5,1,3};
		int[] L = {1,2,1,3,4};
		int initial = E[0] - L[0];
		int maxGuest = initial;
		for(int i = 1 ; i < T ; i++){
			initial = initial + E[i] - L[i];
			if(initial  > maxGuest){
				maxGuest = initial;
			}
		}
		System.out.println(maxGuest);
	}
}