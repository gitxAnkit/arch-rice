import java.util.ArrayList;
import java.util.Scanner;

public class keypadCombo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getkpc(str);
        System.out.println(words);
        scn.close();
    }

    static String[] codes = { ".;", "abc", "def", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getkpc(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getkpc(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];

        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}
