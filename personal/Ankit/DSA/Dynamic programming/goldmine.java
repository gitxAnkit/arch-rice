import java.util.*;
import java.lang.Math;

public class goldmine {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mine = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mine[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];

        for (int j = mine[0].length - 1; j >= 0; j--) {
            for (int i = mine.length - 1; i >= 0; i--) {

                if (j == mine[0].length - 1) {

                    dp[i][j] = mine[i][j];

                } else if (i == 0) {

                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + mine[i][j];

                } else if (i == mine.length - 1) {

                    dp[i][j] = Math.max(dp[i][j + 1], dp[i - 1][j + 1]) + mine[i][j];

                } else {
                    dp[i][j] = Math.max(Math.max(dp[i][j + 1], dp[i + 1][j + 1]), dp[i - 1][j + 1]) + mine[i][j];
                }
            }
        }
        int cost = dp[0][0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i][0] > cost) {
                cost = dp[i][0];
            }
        }
        System.out.println(cost);

        scn.close();
    }
}
