class RowWithMostOne{
	public static void main(String args[]){
		int[][] arr ={{0,1,0,0},
			      {1,1,0,0},
			      {0,0,0,1},
			      {1,1,1,1}};
		int count = 0;
		int maxCount = 0;
		for(int i = 0 ; i < arr.length ; i++){
			count = 0;
			for(int j = 0 ; j < arr[i].length ; j++){
				if(arr[i][j] == 1){
 					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
			}
		}
		System.out.println(maxCount);
	}
}