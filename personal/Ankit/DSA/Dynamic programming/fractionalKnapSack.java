import java.util.*;

public class fractionalKnapSack {
    public static void main(String[] args) {

        /*
         * 1. You are given a number n, representing the count of items.
         * 2. You are given n numbers, representing the values of n items.
         * 3. You are given n numbers, representing the weights of n items.
         * 3. You are given a number "cap", which is the capacity of a bag you've.
         * 4. You are required to calculate and print the maximum value that can be
         * created in the bag without overflowing it's capacity.
         * Note1 -> Items can be added to the bag even partially. But you are not
         * allowed to put same items again and again to the bag.
         */

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = scn.nextInt();
        }
        int cap = scn.nextInt();

        double[][] dp = new double[n + 1][cap + 1];

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                if (j < weights[i - 1]) {

                    if ((double) (j / weights[i - 1]) * values[i - 1] > dp[i - 1][j]) {

                        dp[i][j] = (double) (j / weights[i - 1]) * values[i - 1];

                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {

                    int remCap = j - weights[i - 1];

                    if ((double) (dp[i - 1][remCap] + values[i - 1]) > dp[i - 1][j]) {

                        dp[i][j] = (double) dp[i - 1][remCap] + values[i - 1];

                    } else {

                        dp[i][j] = dp[i - 1][j];

                    }

                }

            }

        }
        System.out.println(dp[n][cap]);
        scn.close();
    }
}
