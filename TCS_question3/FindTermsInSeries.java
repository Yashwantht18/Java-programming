class FindTermsInSeries{
	public static void main(String args[]){
		int n = 15;
		int count = 0;
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i = i + 2){
			arr[i] = count * 7;
			if(i+1 != n){
				arr[i+1] = count * 6;
			}
			count++;
		}

		for(int i = 0 ; i < n ; i++){
			if(i == n-1){
				System.out.println(arr[i] + " ");
			}
			
		}

	}
}