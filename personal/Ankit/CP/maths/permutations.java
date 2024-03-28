import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextInt();
        long r = scn.nextInt();

    }

    // call function initncr with n and mod m
    static long[] fact;
    static long[] inv_fact;
    static long m;

    static void initncr(int n, int mod) {// n is maximum n possible and m is mod
        m = mod;
        fact = new long[n];
        inv_fact = new long[n];
        int i;
        fact[0] = 1;
        for (i = 1; i < n; i++) {
            fact[i] = i * fact[i - 1] % m;
        }
        i--;
        inv_fact[i] = p(fact[i], m - 2, m);
        for (i--; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1] * (i + 1) % m;
        }
    }

    static long ncr(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            return 0;
        }
        return fact[n] * inv_fact[r] % m * inv_fact[n - r] % m;
    }

    public static long p(long a, long p, long mod) {
        long res = 1;
        while (p > 0) {
            if (p % 2 != 0) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            p >>= 1;
        }
        return res;
    }
}
