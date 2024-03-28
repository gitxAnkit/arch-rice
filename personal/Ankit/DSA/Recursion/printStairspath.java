
//import java.io.*;
import java.util.*;

public class printStairspath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        printPaths(n, "");
        scn.close();
    }

    public static void printPaths(int n, String paths) {

        if (n == 0) {
            System.out.println(paths);
            return;
        } else if (n < 0) {
            return;
        }
        printPaths(n - 1, paths + '1');
        printPaths(n - 2, paths + '2');
        printPaths(n - 3, paths + '3');

    }
}
