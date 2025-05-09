class ArrayGeater{
	public static void main(String args[]){
		int[] arr = {7,4,8,2,9};
		int len = arr.length;
		int count = 1;
		for(int i = len-1 ; i > 0 ;i--){
			Boolean check = false;
			for(int j = i-1 ; j >= 0 ; j--){
				if(arr[i] < arr[j]){
					check = true;
				}
			}
			if(!check){
				count++;	
			}
		}
		System.out.println(count);
	}
}