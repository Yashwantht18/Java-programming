public class TaxiPassengerPickup {
    
    public int maxPassengers(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[n][n][n];

        for (int[][] layer : dp)
            for (int[] row : layer)
                java.util.Arrays.fill(row, Integer.MIN_VALUE);

	for(int i = 0 ; i < dp.length ; i++){
		for(int j = 0 ; j < dp[i].length ; j++){
			for(int k = 0 ; k < dp[i][j].length ; k++){
				System.out.print(dp[i][j][k] + " ");
			}
		}
		System.out.println();
	}


        dp[0][0][0] = grid[0][0] == -1 ? Integer.MIN_VALUE : grid[0][0];

        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < n; y1++) {
                for (int x2 = 0; x2 < n; x2++) {
                    int y2 = x1 + y1 - x2;
                    if (y2 < 0 || y2 >= n) continue;
                    if (grid[x1][y1] == -1 || grid[x2][y2] == -1) continue;

                    int val = grid[x1][y1];
                    if (x1 != x2 || y1 != y2) val += grid[x2][y2];

                    int maxPrev = Integer.MIN_VALUE;
                    for (int[] dir1 : new int[][]{{-1, 0}, {0, -1}}) {
                        for (int[] dir2 : new int[][]{{-1, 0}, {0, -1}}) {
                            int px1 = x1 + dir1[0];
                            int py1 = y1 + dir1[1];
                            int px2 = x2 + dir2[0];
                            int py2 = y2 + dir2[1];
                            if (px1 >= 0 && py1 >= 0 && px2 >= 0 && py2 >= 0) {
                                maxPrev = Math.max(maxPrev, dp[px1][py1][px2]);
                            }
                        }
                    }

                    if (maxPrev != Integer.MIN_VALUE) {
                        dp[x1][y1][x2] = maxPrev + val;
                    }
                }
            }
        }

        return Math.max(0, dp[n - 1][n - 1][n - 1]);
    }

    public static void main(String[] args) {
        int[][] grid = {
             {0, 1, 1},
             {1, 1, 1},
             {1, 1, 1}

        };
        TaxiPassengerPickup tpp = new TaxiPassengerPickup();
        System.out.println(tpp.maxPassengers(grid));  
    }
}