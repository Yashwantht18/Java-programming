import java.util.*;
class SpecificPairMatrix{
	public static void main(String args[]){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

		ArrayList<List<Integer>> pairs = new ArrayList<>();

		 for (int i = 0; i < matrix.length - 1; i++) {
            		for (int j = 0; j < matrix[0].length - 1; j++) {
                		int current = matrix[i][j];
                		int diagonal = matrix[i + 1][j + 1];
                		if (current < diagonal) {
                    			pairs.add(Arrays.asList(current, diagonal));
                		}
            		}
        	}

        	for (List<Integer> pair : pairs) {
            		System.out.println(pair);
        	}
	}
}