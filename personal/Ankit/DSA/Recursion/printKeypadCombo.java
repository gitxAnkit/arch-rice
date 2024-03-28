
// import java.io.*;
import java.util.*;

public class printKeypadCombo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKpc(str, "");
        scn.close();
    }

    static String[] codes = { ".;", "abc", "def", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKpc(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeForCh = codes[ch - '0'];

        for (int i = 0; i < codeForCh.length(); i++) {

            char cho = codeForCh.charAt(i);
            printKpc(roq, ans + cho);
        }
    }
}
