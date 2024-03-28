
// import java.io.*;
import java.util.*;

public class printMazePathsJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printPaths(1, 1, n, m, "");
        scn.close();
    }

    public static void printPaths(int sr, int sc, int dr, int dc, String path) {

        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        // Horizontal moves

        for (int ms = 1; ms <= dc - sc; ms++) {
            printPaths(sr, sc + ms, dr, dc, path + "h" + ms);
        }
        // Vertical moves

        for (int ms = 1; ms <= dr - sr; ms++) {
            printPaths(sr + ms, sc, dr, dc, path + "v" + ms);
        }

        // diagonal moves

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {

            printPaths(sr + ms, sc + ms, dr, dc, path + "d" + ms);

        }
    }
}
