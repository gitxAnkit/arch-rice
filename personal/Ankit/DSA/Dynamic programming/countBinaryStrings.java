import java.io.*;
import java.util.*;

public class countBinaryStrings {
    public static void main(String[] args) {
        /*
         * 1. You are given a number n.
         * 2. You are required to print the number of binary strings of length n with no
         * consecutive 0's.
         */
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // int[] dp0 = new int[n + 1];
        // int[] dp1 = new int[n + 1];

        // dp0[1] = 1;
        // dp1[1] = 1;

        // for (int i = 2; i <= n; i++) {

        // dp1[i] = dp1[i - 1] + dp0[i - 1];
        // dp0[i] = dp1[i - 1];

        // }
        // System.out.println(dp1[n] + dp0[n]);

        altSolution(n);

    }

    public static void altSolution(int n) {

        int oldCount0 = 1;
        int oldCount1 = 1;

        for (int i = 2; i <= n; i++) {

            int newCount0 = oldCount1;
            int newCount1 = oldCount1 + oldCount0;

            oldCount0 = newCount0;
            oldCount1 = newCount1;

        }
        System.out.println(oldCount0 + oldCount1);
    }
}
