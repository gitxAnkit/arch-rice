
//import java.io.*;
import java.util.*;

public class printPermuation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        print_permuations(str, "");
        scn.close();
    }

    public static void print_permuations(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String left_part = ques.substring(0, i);
            String right_part = ques.substring(i + 1);
            String roq = left_part + right_part;
            print_permuations(roq, ans + ch);
        }
    }
}
