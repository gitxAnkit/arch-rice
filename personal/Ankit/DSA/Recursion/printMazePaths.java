
//import java.io.*;
import java.util.*;

public class printMazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // rows
        int m = scn.nextInt(); // columns
        printPaths(1, 1, n, m, "");
        scn.close();
    }

    public static void printPaths(int sr, int sc, int dr, int dc, String path) {

        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        if (sr < dr) {
            printPaths(sr + 1, sc, dr, dc, path + 'h');
        }
        if (sc < dc) {
            printPaths(sr, sc + 1, dr, dc, path + 'v');
        }
        /*
         * Alternate solution
         * 
         * if(sr>dr || sc>dr){
         * return;
         * }
         * if(sr==dr && sc==dc){
         * System.out.println(path);
         * return;
         * }
         * printPaths(sr + 1, sc, dr, dc, path + 'h');
         * 
         * printPaths(sr, sc + 1, dr, dc, path + 'v');
         * 
         */

    }
}
