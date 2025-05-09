class ChocolatePacket{
	public static void main(String args[]){
		int[] arr = {4,5,0,1,9,0,5,0};
		int n = arr.length;
		int j = 0;
		for(int i = 0 ; i < n ; i++){
			if(arr[i] != 0){
				arr[j] = arr[i];
				j++;
			}
		}
		if(j != n-1){
			for(int i = j ; i < n ; i++){
				arr[i] = 0;
						
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i] + " ");			
		}

	}
}











