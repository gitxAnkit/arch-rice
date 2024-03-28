import java.io.*;
import java.util.*;

public class power {
    public static void main(String[] args) {

        int base = 2;
        int power = 4;
        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);

        String str = Integer.toBinaryString(10);// converts integer to binary string
        System.out.println(str);
    }
}
