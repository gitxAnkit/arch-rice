import java.io.*;
import java.util.*;

class perfectTrio {
    public static void main(String[] args) {

        /*
         * Chef defines a group of three friends
         * as a perfect group if the age of one person is equal
         * to the sum of the age of remaining two people.
         * 
         * Given that, the ages of three people in
         * a group are A, B,A,B, and CC respectively,
         * find whether the group is perfect.
         */
        Scanner scn = new Scanner(System.in);

        int[] frnd = new int[3];
        for (int i = 0; i < 3; i++) {
            frnd[i] = scn.nextInt();
        }
        Arrays.sort(frnd);

        if (frnd[0] + frnd[1] == frnd[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}