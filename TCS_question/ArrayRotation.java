class ArrayRotation{
	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4, 5, 6};
		int d = 2;
		d = (d >= arr.length)? d/2 : d;
		for(int i = 0 ; i < d ; i++){
			for(int j = 0 ; j < arr.length-1 ; j++){
				arr[j] = arr[j] ^ arr[j+1];
				arr[j+1] = arr[j] ^ arr[j+1];
				arr[j] = arr[j] ^ arr[j+1];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
			
		}

	}
}