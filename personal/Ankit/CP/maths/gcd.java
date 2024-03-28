import java.io.*;
import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int gcd = gcd_1(a, b);
        System.out.println(gcd);
        scn.close();
    }

    // log mx(a,b)
    public static int gcd_1(int a, int b) {

        if (a == 0) {
            return b;
        }
        return gcd_1(b % a, a);
        /*
         * gcd(a,b)=gcd(a,b-a);
         * gcd(a,b)=gcd(a,b%a);
         */
    }
}
