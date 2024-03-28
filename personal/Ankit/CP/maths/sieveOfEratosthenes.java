import java.util.*;

public class sieveOfEratosthenes {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> primes = sieve(n);
        System.out.println(primes);
        scn.close();
    }

    public static ArrayList<Integer> sieve(int N) {

        ArrayList<Integer> al = new ArrayList<>();

        boolean[] prime = new boolean[N + 1];

        Arrays.fill(prime, true);

        for (int i = 2; i * i <= N; i++) {

            if (prime[i]) {

                for (int j = i * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }
        al = new ArrayList<>();

        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                al.add(i);
            }
        }
        return al;
    }

}
