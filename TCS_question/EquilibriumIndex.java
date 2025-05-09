class EquilibriumIndex{
	public static void main(String args[]){
		int[] arr = {1, 2, 0, 3};
		int totalSum = 0;
		int leftSum = 0;
		boolean find = false;
		for(int i = 0 ; i < arr.length ; i++){
			totalSum += arr[i];
		}
		for(int j = 0 ; j < arr.length ; j++){
			totalSum -= arr[j];
			if(totalSum == leftSum){
				System.out.println(j);
				find = true;
				break;
			}
			leftSum += arr[j];
		}
		if(!find){
			System.out.println("-1");
		}
		
	}
}