class NthTermSeries{
	public static void main(String args[]){
		int n = 20;
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i=i+2){
			arr[i] = i;
			arr[i+1] = i/2;
		}
		for(int j = 0 ; j < arr.length ; j++){
			if(j == n-1){
				System.out.print(arr[j]);
			}
		}
	}
}