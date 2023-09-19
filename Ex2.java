import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;


public class Ex2 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int countt = 0;
        boolean result = false;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            int y = StdIn.readInt();
            uf.union(x, y);
            if(!result) countt++;
            if(uf.count()==1) {
                result = true;
            }
        }
        if (result) StdOut.print(countt);
        else StdOut.print("FAILED");
    }
}
