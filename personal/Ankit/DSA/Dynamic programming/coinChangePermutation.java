import java.util.*;

public class coinChangePermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int amt = 1; amt <= target; amt++) {

            for (int coin : coins) {
                if (coin <= amt) {
                    int rem_amt = amt - coin;
                    dp[amt] += dp[rem_amt];
                }
            }

        }
        System.out.println(dp[target]);

        scn.close();
    }
}
