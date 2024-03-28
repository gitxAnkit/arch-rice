
//import java.io.*;
import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int m = scn.nextInt();

        int ans = binpow(a, b, m);
        System.out.println(ans);
        scn.close();
    }

    // Binary exponentiation
    // binpow
    // runs in O(logb) time
    public static int binpow(int a, int b, int m) {

        if (b == 0) {
            return a % m;
        }
        if (b % 2 == 0) {
            int t = binpow(a, b / 2, m);
            return (t * t % m);
        } else {
            int t = binpow(a, (b - 1) / 2, m);
            t = (t * t) % m;
            return (a * t * t % m);

        }
    }
}
