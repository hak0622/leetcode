class Solution {
    int[]parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        parent = new int[n+1];

        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        for(int i=0; i<n; i++){
            int a = edges[i][0];
            int b = edges[i][1];

            if(find(a) == find(b)) return edges[i];

            union(a,b);
        }
        return new int[]{};
    }

    public void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a != b) parent[b] = a;
    }

    public int find(int a){
        if(a == parent[a]) return a;

        return parent[a] = find(parent[a]);
    }
}