import java.util.jar.Manifest;

import java.io.*;
import java.util.*;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        // 2^2^3^3^4^6=6
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {

        int unique = 0;
        for (int n : arr) {
            unique = n ^ unique;
        }
        return unique;
    }
}
