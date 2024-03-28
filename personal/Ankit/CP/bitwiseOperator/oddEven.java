import java.io.*;
import java.util.*;

class oddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        isEven(n);
        scn.close();
    }

    public static void isEven(long n) {
        if ((n & 1) == 1) {
            System.out.println(n + " is odd.");
        } else {
            System.out.println(n + " is even.");
        }
    }
}