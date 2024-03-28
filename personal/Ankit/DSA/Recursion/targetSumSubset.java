
//import java.io.*;
import java.util.*;

public class targetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        printTargetSumSubset(arr, 0, "", 0, target);
        scn.close();
    }

    public static void printTargetSumSubset(int[] arr, int idx, String set, int sos, int target) {

        if (idx == arr.length) {
            if (sos == target) {
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubset(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], target);
        printTargetSumSubset(arr, idx + 1, set, sos, target);
    }
}
