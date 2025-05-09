class FindSubSet{
	public static void main(String args[]){
		int [] a = {11, 1, 13, 21, 3, 7};
		int[] b = {11, 3, 7, 1};
		int count = 0;
		for(int num : a){
			for(int num2 : b){
				if(num == num2){
					count++;
					break;
				}
			}
		} 
		System.out.println((count == b.length)? "True" : "False");
	}
}