
//import java.io.*;
import java.util.*;

public class divisionModulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int m = scn.nextInt();

        int res1 = (a / b) % m;
        a = a % m;
        int inv_b = binpow(a, m - 2, m); // Fermat's little theorem
        // works only if m is prime

        int res2 = a * inv_b % m;
        System.out.println(res1);
        System.out.println(res2);

    }

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
