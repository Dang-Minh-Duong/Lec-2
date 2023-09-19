public class WeightedQU_pathCompression {
    private int [] parent;
    private int [] size;
    public WeightedQU_pathCompression(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i =0;i<n;i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    public int find(int i) {
        while (parent[i]!=i) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP==rootQ) return;
        if (size[rootP]>=size[rootQ]) {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
    }
    public int countRoot() {
        int count = 0;
        for (int i = 0;i < parent.length;i++) {
            if (i==find(i)) count++;
        }
        return count;
    }

    public boolean isConnected(int p, int q) {
        if (find(p)==find(q)) return true;
        return false;
    }
}
