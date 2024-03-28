import java.util.ArrayList;
import java.util.Scanner;

public class getStairspath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        ArrayList<String> paths = getPaths(n);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getPaths(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getPaths(n - 1);
        ArrayList<String> paths2 = getPaths(n - 2);
        ArrayList<String> paths3 = getPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
