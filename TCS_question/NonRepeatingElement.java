class NonRepeatingElement{
	public static void main(String args[]){
		int[] arr = {-1, 2, -1, 3, 0};
		int[] index = new int[arr.length/2];
		int k = 0;
		for(int i = 0 ; i < arr.length-1 ; i++){
			boolean repeat = true;
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					System.out.println(i + " " + j);
					repeat = false;
					//index[k] = j;
				}
				//if(index.contains(i)){
				//	repeat = false;
				//}
			}
			if(repeat){
				System.out.println(arr[i]);
				break;
			}
		}
	}
} 