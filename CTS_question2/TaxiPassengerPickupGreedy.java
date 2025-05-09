import java.util.*;

public class TaxiPassengerPickupGreedy {

    public int greedyMaxPassengers(int[][] grid) {
        int n = grid.length;
        int firstTrip = collect(grid, 0, 0, n - 1, n - 1);
        int secondTrip = collect(grid, n - 1, n - 1, 0, 0);
        return firstTrip + secondTrip;
    }

    private int collect(int[][] grid, int sx, int sy, int dx, int dy) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        for (int[] row : dp)
            Arrays.fill(row, Integer.MIN_VALUE);
        dp[sx][sy] = grid[sx][sy];

        int dxDir = sx < dx ? 1 : -1;
        int dyDir = sy < dy ? 1 : -1;

        for (int i = sx; i != dx + dxDir; i += dxDir) {
            for (int j = sy; j != dy + dyDir; j += dyDir) {
                if (grid[i][j] == -1) continue;

                if (i - dxDir >= 0 && i - dxDir < n && dp[i - dxDir][j] != Integer.MIN_VALUE)
                    dp[i][j] = Math.max(dp[i][j], dp[i - dxDir][j] + grid[i][j]);

                if (j - dyDir >= 0 && j - dyDir < n && dp[i][j - dyDir] != Integer.MIN_VALUE)
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - dyDir] + grid[i][j]);
            }
        }
	for(int i = 0 ; i < dp.length ; i++){
		for(int j = 0 ; j < dp[i].length ; j++){
			System.out.print(dp[i][j]);
		}
		System.out.println();
	}

        if (dp[dx][dy] == Integer.MIN_VALUE) return 0;

       
        int sum = 0;
        List<int[]> path = new ArrayList<>();
        int i = dx, j = dy;
        while (i != sx || j != sy) {
	    System.out.println(i + " " + j);
            sum += grid[i][j];
            path.add(new int[]{i, j});

            if (i - dxDir >= 0 && i - dxDir < n && dp[i][j] == dp[i - dxDir][j] + grid[i][j]) {
                i -= dxDir;
            } else {
                j -= dyDir;
            }
        }
        sum += grid[sx][sy];
        path.add(new int[]{sx, sy});

       
        for (int[] cell : path) {
            grid[cell[0]][cell[1]] = 0;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0},
            {1, 1, 1},
            {1, 1, 1}
        };

        TaxiPassengerPickupGreedy greedy = new TaxiPassengerPickupGreedy();
        int result = greedy.greedyMaxPassengers(grid);
        System.out.println("Greedy Pickup Result: " + result);  
    }
}
