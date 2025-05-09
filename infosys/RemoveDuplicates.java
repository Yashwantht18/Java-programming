class RemoveDuplicates{
	public static void main(String args[]){
		int[] nums = {0,0,1,1,1,2,2,3,3};
		int len = nums.length;
    		int j = 0;
    		for (int i = 0; i < nums.length; i++) {
        		if (nums[i] != nums[j]) {
            			j++;
            			nums[j] = nums[i];
        		}
    		}
		for(int i = 0 ; i <= j ; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println(j);
	}
}