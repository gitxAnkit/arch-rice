
//import java.io.*;
import java.util.*;

public class mazePathsJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getPaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        // Horizontal moves

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getPaths(sr, sc + ms, dr, dc);

            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }

        // Vertical moves

        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getPaths(sr + ms, sc, dr, dc);

            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }

        // diagonal moves

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {

            ArrayList<String> dpaths = getPaths(sr + ms, sc + ms, dr, dc);

            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }

        return paths;
    }
}
