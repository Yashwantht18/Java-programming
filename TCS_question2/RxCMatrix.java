class RxCMatrix{
	public static void main(String args[]){
		int[] arr = {0,1,0,1,1,0,0,0,1,1,0,0};
		int c = 3;
		int r = 4;
		int count = 0;
		int MaxCount = 0;
		int col = 0;
		int maxRow = 0;
		int row = 0;
		for(int i = 0 ; i < arr.length ; i++){
			col++;
			if(col == c){
				row++;
				if(count > MaxCount){
					MaxCount = count;
					maxRow = row;
				}
				count = 0;
				col = 0;
			}
			if(arr[i] == 1){
				count++;
			}
			
		}
		System.out.println(maxRow);
	}
}