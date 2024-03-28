import java.io.*;
import java.util.*;

public class q1 {
    static int mod = (int) (1e9 + 7);
    static PrintWriter out = new PrintWriter(System.out);

    static void solve() {
        out.println(6);
    }

    public static void main(String[] args) {
        int test = i();
        while (test-- > 0) {
            solve();
        }
        out.flush();
        out.close();
    }

    // ------> swap(long[]arr,int idx1,int idx2)<---- swap int

    // ----->segmentTree--> segTree as class

    // ----->lazy_Seg_tree --> lazy_Seg_tree as class

    // -----> Trie --->Trie as class

    // ----->fenwick_Tree ---> fenwick_Tree

    // -----> POWER ---> long power(long x, long y) <----

    // -----> LCM ---> long lcm(long x, long y) <----

    // -----> GCD ---> long gcd(long x, long y) <----

    // -----> SIEVE --> ArrayList<Integer> sieve(int N) <-----

    // -----> NCR ---> long ncr(int n, int r) <----

    // -----> BINARY_SEARCH ---> int binary_Search(long[]arr,long x) <----

    // -----> (SORTING OF LONG, CHAR,INT) -->long[] sortLong(long[] a2)<--

    // ----> DFS ---> void dfs(ArrayList<ArrayList<Integer>>edges,int child,int
    // parent)<---

    // ---> NODETOROOT --> ArrayList<Integer>
    // node2Root(ArrayList<ArrayList<Integer>>edges,int child,int parent,int tofind)
    // <--

    // ---> LEVELS_TREE -->levels_Trees(ArrayList<HashSet<Integer>> edges, int
    // child, int parent,int[]level,int currLevel) <--

    // ---> K_THPARENT --> int k_thparent(int node,int[][]parent,int k) <---

    // ---> TWOPOWERITHPARENTFILL --> void twoPowerIthParentFill(int[][]parent) <---

    // -----> (INPUT OF INT,LONG ,STRING) -> int i() long l() String s()<-
    // tempstart

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int Int() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String String() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return String();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static InputReader in = new InputReader(System.in);

    public static int i() {
        return in.Int();
    }

    public static long l() {
        String s = in.String();
        return Long.parseLong(s);
    }

    public static String s() {
        return in.String();
    }

    public static int compareChar(char a, char b) {
        return Character.compare(a, b);
    }

    public static int compareInt(int a, int b) {
        return Integer.compare(a, b);
    }

    public static int compareLong(long a, long b) {
        return Long.compare(a, b);
    }

    public static boolean compareString(String a, String b) {
        return a.equals(b);
    }

    public static boolean compareStringBuilder(StringBuilder a, StringBuilder b) {
        return a.equals(b);
    }

}
