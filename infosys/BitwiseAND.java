class BitwiseAND{

	public static int binary(int n){
		String result = "";
		while(n > 0){
			result = (n % 2) + result;
			n = n/2;
		}
		return Integer.valueOf(result);
	}

	public static void main(String args[]){
		int[] num = {5,7};
		int len =  num[num.length-1] - num[0] + 1;
		int[] arr = new int[len];
		int j = 0;

		for(int i = num[0] ; i <= num[num.length-1] ; i++){
			int bitwise = binary(i); 
			arr[j] = bitwise;
			j++;
		}

		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
}