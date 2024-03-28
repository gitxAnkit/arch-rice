
//import java.io.*;
import java.util.*;

public class countingDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;// i is a factor
                if (i != n / i)
                    count++; // n/i is also a factor
            }

        }
        System.out.println("No. of divisors is: " + count);
    }
}