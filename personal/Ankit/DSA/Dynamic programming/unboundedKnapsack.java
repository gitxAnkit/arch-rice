import java.util.*;

public class unboundedKnapsack {
    public static void main(String[] args) {

        /*
         * 1. You are given a number n, representing the count of items.
         * 2. You are given n numbers, representing the values of n items.
         * 3. You are given n numbers, representing the weights of n items.
         * 3. You are given a number "cap", which is the capacity of a bag you've.
         * 4. You are required to calculate and print the maximum value that can be
         * created in the bag without
         * overflowing it's capacity.
         * Note -> Each item can be taken any number of times. You are allowed to put
         * the same item again
         * and again
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

        int[] dp = new int[cap + 1];

        for (int bagCap = 1; bagCap <= cap; bagCap++) {

            int max = 0;

            for (int i = 0; i < n; i++) {

                if (weights[i] <= bagCap) {

                    int remBagCap = bagCap - weights[i];
                    int remBagVal = dp[remBagCap];
                    int totalBagVal = remBagVal + values[i];

                    if (totalBagVal > max) {

                        max = totalBagVal;

                    }

                }

            }

            dp[bagCap] = max;

        }

        System.out.println(dp[cap]);

        scn.close();
    }
}
