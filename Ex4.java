import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Ex4 {
    public static void main(String[] args) {
        In in = new In("D:\\Code\\Java project\\Java DSA\\Test_algs4\\untitled\\algs4-data\\algs4-data\\2Kints.txt");
        int[] a = in.readAllInts();
        int countt = 0;
        for (int i =0;i<a.length-2;i++) for(int j=i+1;j<a.length -1;j++) for (int k = j+1;k<a.length;k++) if(a[i]+a[j] + a[k]==0) {
            StdOut.println(a[i]+" "+ a[j] + " " + a[k]);
            countt++;
        }
        StdOut.print(countt);
    }
}
