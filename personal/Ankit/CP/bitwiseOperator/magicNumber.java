import java.io.*;
import java.util.*;

public class magicNumber {

    public static void main(String[] args) {

        int n = 10;
        int ans = 0;
        int base = 5;
        int b = 2;
        noOfDigits(n, b);
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }

    // no. of digits in base b
    public static void noOfDigits(int n, int b) {

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
