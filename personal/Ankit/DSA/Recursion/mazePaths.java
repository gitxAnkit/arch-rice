
//import java.io.*;
import java.util.*;

public class mazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // rows
        int m = scn.nextInt(); // columns
        ArrayList<String> paths = getMazepaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getMazepaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> paths = new ArrayList<>();

        if (sr < dr) {
            hpaths = getMazepaths(sr + 1, sc, dr, dc);
        }
        if (sc < dc) {
            vpaths = getMazepaths(sr, sc + 1, dr, dc);
        }
        for (String path : hpaths) {
            paths.add('h' + path);
        }
        for (String path : vpaths) {
            paths.add('v' + path);
        }
        return paths;
    }
}
