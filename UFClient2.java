import java.util.Scanner;

public class UFClient2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeightedQU_pathCompression q = new WeightedQU_pathCompression(n);
        int m = sc.nextInt();
        int count = 0;
        boolean result = false;
        for (int i =0;i<m;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            q.union(x, y);
            if (!result) count++;
            if (q.countRoot()==1) result = true;
        }
        if (result) System.out.println(count);
        else System.out.println("FAILED");
    }
}
