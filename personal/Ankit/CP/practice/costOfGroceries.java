import java.io.*;
import java.util.*;

class costOfGroceries {
    public static void main(String[] args) {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t != 0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            int[] fval = new int[n];
            for (int i = 0; i < n; i++) {
                fval[i] = scn.nextInt();
            }
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scn.nextInt();
            }
            t--;
            int cost_sum = 0;
            for (int i = 0; i < n; i++) {
                if (fval[i] >= x) {
                    cost_sum += cost[i];
                }
            }
        }
    }
}