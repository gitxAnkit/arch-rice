import java.io.*;
import java.util.*;

public class cntDivisorsOfAll {

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;// i is a factor
                if (i != n / i)
                    count++; // n/i is also a factor
            }
        }
        return count;
    }

    // Complexity of this algo is arount (n*root n)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println(countDivisors(i));
        // }
        // better solution
        Vector<Integer> div = new Vector<>(n + 1);

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                div.add(j);// j is divisor
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(div.get(i));
        }
    }
    // Complexity of this algo is NlogN

}
