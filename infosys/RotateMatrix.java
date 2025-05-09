class RotateMatrix{
	public static void main(String args[]){
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] matrix = {{1,2,3},{4,5,6}};
		int[][] matrix = {{1,2},{3,4},{5,6}};
		int[][] result_mat = new int[matrix[0].length][matrix.length];
		int k = 0;
		for(int i = 0 ; i < matrix[0].length ; i++){
			for(int j = 0 ; j < matrix.length ; j++){
				k = matrix.length-1 - j;
				System.out.println(k);
				result_mat[i][j] = matrix[k][i];
			}
		}

		for(int i = 0 ; i < result_mat.length ; i++){
			for(int j = 0; j < result_mat[i].length ; j++){
				System.out.print(result_mat[i][j] + " ");				
			}
			System.out.println();
		}

	}
} 