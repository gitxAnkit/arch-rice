import java.io.*;
import java.util.*;

public class newP {
    public static void main(String[] args) {

        // your code goes here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t != 0) {

            int n = scn.nextInt();
            String str = scn.next();
            t--;
            int prev1 = -1;
            int res = 1;
            for (int i = 1; i < n; i++) {
                if (str.charAt(i) == '1') {
                    if (prev1 != -1) {
                        if ((i - prev1) % 2 == 0) {
                            res = 2;
                            break;
                        }
                    }
                    prev1 = i;
                }
            }
            System.out.println(res);

        }
    }
}
