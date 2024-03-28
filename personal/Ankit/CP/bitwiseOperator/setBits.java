import java.io.*;
import java.util.*;

public class setBits {
    public static void main(String[] args) {

        int n = 111;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(SetBits(n));
        //System.out.println(4 ^ 3);
    }

    public static int SetBits(int n) {

        int count = 0;

        while (n > 0) {

            count++;
            n = n - (n & -n);

        }
        return count;

    }
}
