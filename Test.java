import edu.princeton.cs.algs4.*;
public class Test {
    public static void main(String[] args) {

        int N = StdIn.readInt();
        UF uf = new UF(N);

        int pairNumber = 0;

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
            }

            pairNumber++;


            if (uf.count() == 1) {
                StdOut.println(pairNumber);
                return;
            }
        }

        StdOut.println("FAILED");
    }
}
