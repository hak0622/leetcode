class Solution {
    int[]parent;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];

        for(int i=0; i<n; i++){
            parent[i] = i;
        }

        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];

            union(a,b);
        }

        return find(source) == find(destination);
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